package com.example.mycode.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Module
public class OkHttpModule {
    @Singleton//单例标记
    @Provides
    public OkHttpClient okHttpClientProvider() {
        return new OkHttpClient();
    }
}