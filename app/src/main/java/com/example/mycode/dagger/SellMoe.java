package com.example.mycode.dagger;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * @author JimGw
 * @date 2019/06/21
 */
public class SellMoe {

    public int id;
    private int age;

    public SellMoe(int age) {
        this.age = age;
    }

    @Inject
    public SellMoe() {
    }

    public String sellMoe() {
//        return "赶紧卖了个大萌";
        return "我特么" + age + "岁了还是可爱得要死";
    }

}
