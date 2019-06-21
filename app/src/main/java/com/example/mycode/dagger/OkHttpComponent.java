package com.example.mycode.dagger;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Singleton//注意：写在Component的上面
@Component(modules = OkHttpModule.class)
public interface OkHttpComponent {
    void inject(MainActivity1 mainActivity);
}
