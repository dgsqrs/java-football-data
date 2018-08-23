package ch.hoth.github.footballdata.v2.model;

/**
 * This code belongs to Square Services Sàrl
 * Created by dgo on 19.08.18.
 */
public class Score {
    private String winner;
    private String duration;
    private Goals fullTime;
    private Goals halfTime;
    private Goals extraTime;
    private Goals penalties;

    public String getWinner() {
        return winner;
    }

    public String getDuration() {
        return duration;
    }

    public Goals getFullTime() {
        return fullTime;
    }

    public Goals getHalfTime() {
        return halfTime;
    }

    public Goals getExtraTime() {
        return extraTime;
    }

    public Goals getPenalties() {
        return penalties;
    }
}