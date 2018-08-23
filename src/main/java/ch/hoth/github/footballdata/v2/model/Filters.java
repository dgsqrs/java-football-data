package ch.hoth.github.footballdata.v2.model;

/**
 * This code belongs to Square Services Sàrl
 * Created by dgo on 18.08.18.
 */
public class Filters {
    private String dateFrom;
    private String dateTo;
    private String competitions;

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }
}
