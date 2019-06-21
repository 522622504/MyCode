package com.example.mycode.dagger;

import dagger.Component;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Component
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
