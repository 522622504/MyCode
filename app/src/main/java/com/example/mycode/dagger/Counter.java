package com.example.mycode.dagger;

/**
 * @author JimGw
 * @date 2019/06/21
 */
public class Counter {
    private int sum;
    public Counter() {
    }
    public Counter(int sum) {
        this.sum = sum;
    }
    public int getSum() {
        return sum++;
    }
}