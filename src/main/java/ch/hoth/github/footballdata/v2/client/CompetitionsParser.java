package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.Competition;
import ch.hoth.github.footballdata.v2.model.ListOfCompetitions;
import com.google.gson.Gson;

public class CompetitionsParser {

    private final CompetitionParser competitionParser = new CompetitionParser();

    public ListOfCompetitions toCompetitions(String jsonString) {
       return new Gson().fromJson(jsonString, ListOfCompetitions.class);
    }

    public Competition toCompetition(String jsonString) {
        return competitionParser.toCompetition(jsonString);
    }
}
