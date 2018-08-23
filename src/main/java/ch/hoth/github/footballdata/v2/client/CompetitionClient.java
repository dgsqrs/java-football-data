package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.Competition;
import ch.hoth.github.footballdata.v2.model.ListOfCompetitions;
import uk.co.mruoc.http.client.ReadOnlyHttpClient;
import uk.co.mruoc.http.client.Response;


public class CompetitionClient {

    private final CompetitionsParser parser = new CompetitionsParser();
    private final ReadOnlyHttpClient httpClient;
    private final EndpointProvider endpointProvider;

    public CompetitionClient(ReadOnlyHttpClient httpClient, EndpointProvider endpointProvider) {
        this.httpClient = httpClient;
        this.endpointProvider = endpointProvider;
    }

    public ListOfCompetitions load() {
        Response response = httpClient.get(endpointProvider.getCompetitions());
        return parser.toCompetitions(response.getBody());
    }

    public Competition load(int id) {
        String endpoint = endpointProvider.getCompetition(id);
        Response response = httpClient.get(endpoint);
        return parser.toCompetition(response.getBody());
    }

}
