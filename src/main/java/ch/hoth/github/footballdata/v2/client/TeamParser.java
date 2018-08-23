package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.Team;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class TeamParser {

    private final JsonParser parser = new JsonParser();

    public Team toTeam(String jsonString) {
        JsonElement element = parser.parse(jsonString);
        JsonObject json = element.getAsJsonObject();
        return toTeam(json);
    }

    public Team toTeam(JsonObject json) {
        return new Gson().fromJson(json, Team.class);
    }
}
