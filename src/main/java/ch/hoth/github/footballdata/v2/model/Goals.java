package ch.hoth.github.footballdata.v2.model;

/**
 * This code belongs to Square Services Sàrl
 * Created by dgo on 19.08.18.
 */
public class Goals {
    private String homeTeam;
    private String awayTeam;

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }
}
