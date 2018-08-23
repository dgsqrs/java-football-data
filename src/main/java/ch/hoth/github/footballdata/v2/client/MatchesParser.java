package ch.hoth.github.footballdata.v2.client;


import ch.hoth.github.footballdata.v2.model.ListOfMatches;
import ch.hoth.github.footballdata.v2.model.Match;
import com.google.gson.Gson;

public class MatchesParser {

    private final MatchParser matchParser = new MatchParser();

    public ListOfMatches toMatches(String jsonString) {
       return new Gson().fromJson(jsonString, ListOfMatches.class);
    }

    public Match toMatch(String jsonString) {
        return matchParser.toMatch(jsonString);
    }
}
