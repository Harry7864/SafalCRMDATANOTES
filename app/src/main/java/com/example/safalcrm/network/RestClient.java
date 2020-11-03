package com.example.safalcrm.network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.example.safalcrm.utillity.Tools;
import com.example.safalcrm.utillity.VariableBag;

import net.gotev.uploadservice.UploadService;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {

    public static <S> S createService(Class<S> serviceClass) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .addInterceptor(interceptor)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        return chain.proceed(chain.request()
                                .newBuilder()
                                .addHeader("key", Tools.Decode(VariableBag.API_KEY))
                                .build());
                    }
                })
                .build();

       UploadService.HTTP_STACK = new OkHttpStack(okHttpClient);

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(VariableBag.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create());
        Retrofit retrofit = builder
                .build();

        return retrofit.create(serviceClass);
    }

}
