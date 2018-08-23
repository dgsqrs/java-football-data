package ch.hoth.github.footballdata.v2.client;

public interface EndpointProvider {

    String getBase();

    String getCompetitions();

    String getCompetition(int competitionId);

    String getTeams(int competitionId);

    String getTeam(int teamId);

    String getMatches();

    String getMatch(int fixtureId);

}
