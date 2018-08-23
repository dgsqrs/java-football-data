package ch.hoth.github.footballdata.v2.model;

import java.util.List;

public class Match {

    private Integer id;
    private Competition competition;
    private Season season;
    private String utcDate;
    private MatchStatus status;
    private int matchDay;
    private String stage;
    private String group;
    private String venue;
    private String lastUpdated;
    private Team homeTeam;
    private Team awayTeam;
    private Score score;
    private List<Person> referees;


    public Integer getId() {
        return id;
    }

    public Competition getCompetition() {
        return competition;
    }

    public Season getSeason() {
        return season;
    }

    public String getUtcDate() {
        return utcDate;
    }

    public MatchStatus getStatus() {
        return status;
    }

    public int getMatchDay() {
        return matchDay;
    }

    public String getStage() {
        return stage;
    }

    public String getGroup() {
        return group;
    }

    public String getVenue() {
        return venue;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Score getScore() {
        return score;
    }

    public List<Person> getReferees() {
        return referees;
    }
}
