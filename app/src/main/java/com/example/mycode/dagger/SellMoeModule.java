package com.example.mycode.dagger;

import dagger.Module;
import dagger.Provides;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Module
public class SellMoeModule {
    private int age;
    public SellMoeModule(int age) {
        this.age = age;
    }
    //提供参数的提供者
    @Provides
    public int ageProvider() {
        return age;
    }
    //提供对象的提供者
    @Provides
    public SellMoe sellMoeProvider(int age) {
        return new SellMoe(age);
    }
}