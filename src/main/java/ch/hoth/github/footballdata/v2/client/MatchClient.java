package ch.hoth.github.footballdata.v2.client;

import ch.hoth.github.footballdata.v2.model.ListOfMatches;
import ch.hoth.github.footballdata.v2.model.Match;
import uk.co.mruoc.http.client.ReadOnlyHttpClient;
import uk.co.mruoc.http.client.Response;

public class MatchClient {

    private final MatchesParser parser = new MatchesParser();
    private final ReadOnlyHttpClient httpClient;
    private final EndpointProvider endpointProvider;

    public MatchClient(ReadOnlyHttpClient httpClient, EndpointProvider endpointProvider) {
        this.httpClient = httpClient;
        this.endpointProvider = endpointProvider;
    }

    public ListOfMatches load() {
        Response response = httpClient.get(endpointProvider.getMatches());
        return parser.toMatches(response.getBody());
    }


    public Match load(int matchId) {
        String endpoint = endpointProvider.getMatch(matchId);
        Response response = httpClient.get(endpoint);
        return parser.toMatch(response.getBody());
    }

}
