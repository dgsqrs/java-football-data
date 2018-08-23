package ch.hoth.github.footballdata.v2.client;
import org.apache.commons.lang3.StringUtils;

import static org.apache.commons.lang3.StringUtils.EMPTY;

/**
 * This code belongs to Square Services Sàrl
 * Created by dgo on 19.08.18.
 */
public class JavaPropertyTokenProvider implements TokenProvider {

    private static final String TOKEN_PROPERTY_NAME = "footballDataApiToken";

    @Override
    public String getToken() {
        String footballDataApiToken = System.getProperty(TOKEN_PROPERTY_NAME);
        if (footballDataApiToken != null) {
            return footballDataApiToken;
        }
        else {
            return EMPTY;
        }
    }

    @Override
    public boolean hasToken() {
        String token = getToken();
        return StringUtils.isNotEmpty(token);
    }
}
