package ch.hoth.github.footballdata.v2.client;

import static org.apache.commons.lang3.StringUtils.EMPTY;

public class DefaultTokenProvider implements TokenProvider {

    private JavaPropertyTokenProvider javaPropertyTokenProvider = new JavaPropertyTokenProvider();
    private SystemPropertyTokenProvider systemPropertyTokenProvider = new SystemPropertyTokenProvider();
    private EnvironmentVariableTokenProvider environmentVariableTokenProvider = new EnvironmentVariableTokenProvider();

    @Override
    public String getToken() {
        if (javaPropertyTokenProvider.hasToken())
            return javaPropertyTokenProvider.getToken();

        if (systemPropertyTokenProvider.hasToken())
            return systemPropertyTokenProvider.getToken();

        if (environmentVariableTokenProvider.hasToken())
            return environmentVariableTokenProvider.getToken();

        return EMPTY;
    }

    @Override
    public boolean hasToken() {
        return javaPropertyTokenProvider.hasToken() || systemPropertyTokenProvider.hasToken() || environmentVariableTokenProvider.hasToken();
    }

}
