package ch.hoth.github.footballdata.v2.model;

/**
 * This code belongs to Square Services Sàrl
 * Created by dgo on 18.08.18.
 */
public class Season {
    private Integer id;
    private String startDate;
    private String endDate;
    private int currentMatchday;

    public Integer getId() {
        return id;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public int getCurrentMatchday() {
        return currentMatchday;
    }
}
