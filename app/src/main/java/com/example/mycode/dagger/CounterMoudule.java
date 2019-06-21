package com.example.mycode.dagger;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author JimGw
 * @date 2019/06/21
 */
@Module
public class CounterMoudule {
    private int sum;

    public CounterMoudule(int sum) {
        this.sum = sum;
    }

    @Provides
    public int sumProvider() {
        return this.sum;
    }

    @Provides
//    @Named("current")
    @CurrentCounter
    public Counter currentCounterProvider() {
        return new Counter();
    }

    @Provides
//    @Named("total")
    @TotalCounter
    public Counter totalCunterProvider(int sum) {
        return new Counter(sum);
    }
}