package ch.hoth.github.footballdata.v2.client;


import uk.co.mruoc.http.client.*;

public class TokenHttpClient implements ReadOnlyHttpClient {

    private final ReadOnlyHttpClient httpClient;
    private final String token;

    public TokenHttpClient() {
        this(new SimpleHttpClient(), new DefaultTokenProvider());
    }

    public TokenHttpClient(TokenProvider tokenProvider) {
        this(new SimpleHttpClient(), tokenProvider);
    }

    public TokenHttpClient(HttpClient httpClient, TokenProvider tokenProvider) {
        this.httpClient = httpClient;
        this.token = tokenProvider.getToken();
    }

    @Override
    public Response get(String endpoint) {
        Headers headers = new Headers();
        return get(endpoint, headers);
    }

    @Override
    public Response get(String endpoint, Headers headers) {
        if (!headers.hasAuthToken())
            headers.addAuthToken(token);
        return httpClient.get(endpoint, headers);
    }

}
