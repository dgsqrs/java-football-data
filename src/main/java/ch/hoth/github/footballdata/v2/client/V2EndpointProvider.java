package ch.hoth.github.footballdata.v2.client;

public class V2EndpointProvider implements EndpointProvider {

    private static final String BASE_URL = "http://api.football-data.org/v2/";

    @Override
    public String getBase() {
        return BASE_URL;
    }

    @Override
    public String getCompetitions() {
        return BASE_URL + "competitions/";
    }

    @Override
    public String getCompetition(int competitionId) {
        return getCompetitions() + competitionId + "/";
    }

    @Override
    public String getTeams(int competitionId) {
        return getCompetition(competitionId) + "teams/";
    }

    @Override
    public String getTeam(int teamId) {
        return BASE_URL + "teams/" + teamId + "/";
    }

    @Override
    public String getMatches() {
        return BASE_URL + "matches/";
    }

    @Override
    public String getMatch(int matchId) {
        return getMatches() + matchId + "/";
    }

}
