package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.Competition;
import com.google.gson.Gson;


public class CompetitionParser {

    public Competition toCompetition(String jsonString) {
        return new Gson().fromJson(jsonString, Competition.class);
    }

}
