package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.Competition;
import ch.hoth.github.footballdata.v2.model.ListOfCompetitions;
import ch.hoth.github.footballdata.v2.model.Match;
import ch.hoth.github.footballdata.v2.model.Team;
import uk.co.mruoc.http.client.ReadOnlyHttpClient;

import java.util.List;

public class FootballDataClient {

    private final CompetitionClient competitionClient;
    private final TeamClient teamClient;
    private final MatchClient matchClient;

    public FootballDataClient() {
        this(new TokenHttpClient(), new V2EndpointProvider());
    }

    public FootballDataClient(ReadOnlyHttpClient httpClient, EndpointProvider endpointProvider) {
        this.competitionClient = new CompetitionClient(httpClient, endpointProvider);
        this.teamClient = new TeamClient(httpClient, endpointProvider);
        this.matchClient = new MatchClient(httpClient, endpointProvider);
    }

    public ListOfCompetitions getCompetitions() {
        return competitionClient.load();
    }

    public Competition getCompetition(int competitionId) {
        return competitionClient.load(competitionId);
    }

    public List<Team> getCompetitionTeams(int competitionId) {
        return teamClient.loadCompetitionTeams(competitionId);
    }

    public Team getTeam(int teamId) {
        return teamClient.load(teamId);
    }

    public List<Match> getMatches() {
        return matchClient.load().getMatches();
    }

    public Match getMatch(int matchId) {
        return matchClient.load(matchId);
    }
}
