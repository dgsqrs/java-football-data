package ch.hoth.github.footballdata.v2.model;

import java.util.Comparator;
import java.util.List;

/**
 * This code belongs to Square Services Sàrl
 * Created by dgo on 18.08.18.
 */
public class ListOfMatches {

    private Integer count;
    private Filters filters;
    private List<Match> matches;



    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public List<Match> getMatches() {
        matches.sort(Comparator.comparing(Match::getId));
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
}
