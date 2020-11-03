package com.example.safalcrm.network;


import net.gotev.uploadservice.http.impl.HurlStack;

import okhttp3.OkHttpClient;

public class OkHttpStack extends HurlStack {
    private final OkHttpClient client;

    public OkHttpStack() {
        this(new OkHttpClient());
    }

    OkHttpStack(OkHttpClient client) {
        if (client == null) {
            throw new NullPointerException("Client must not be null.");
        }
        this.client = client;
    }


}