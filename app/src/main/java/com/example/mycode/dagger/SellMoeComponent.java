package com.example.mycode.dagger;

import dagger.Component;

/**
 * @author JimGw
 * @date 2019/06/21
 */
//指定模型
@Component(modules = SellMoeModule.class)
public interface SellMoeComponent {
    void inject(MainActivity mainActivity);
}
