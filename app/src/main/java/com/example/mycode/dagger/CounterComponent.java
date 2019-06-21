package com.example.mycode.dagger;

import dagger.Component;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Component(modules = CounterMoudule.class)
public interface CounterComponent {
    void inject(MainActivity2 mainActivity);
}
