package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.Match;
import com.google.gson.Gson;

public class MatchParser {

    public Match toMatch(String jsonString) {
       return new Gson().fromJson(jsonString, Match.class);
    }
}
