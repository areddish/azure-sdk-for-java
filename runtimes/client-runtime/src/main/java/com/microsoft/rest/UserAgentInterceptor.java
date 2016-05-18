/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * User agent interceptor for putting a 'User-Agent' header in the request.
 */
public class UserAgentInterceptor implements Interceptor {
    /**
     * The default user agent header.
     */
    private static final String DEFAULT_USER_AGENT_HEADER = "AutoRest-Java";

    /**
     * The user agent header string.
     */
    private String userAgent;

    /**
     * Initialize an instance of {@link UserAgentInterceptor} class with the default
     * 'User-Agent' header.
     */
    public UserAgentInterceptor() {
        this.userAgent = DEFAULT_USER_AGENT_HEADER;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public void appendUserAgent(String userAgent) {
        this.userAgent += " " + userAgent;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        String header = request.header("User-Agent");
        if (header == null || !userAgent.equals(DEFAULT_USER_AGENT_HEADER)) {
            request = chain.request().newBuilder()
                    .header("User-Agent", userAgent + " " + header)
                    .build();
        }
        return chain.proceed(request);
    }
}
