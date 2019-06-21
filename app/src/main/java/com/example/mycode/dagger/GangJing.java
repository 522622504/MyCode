package com.example.mycode.dagger;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * @author JimGw
 * @date 2019/06/21
 */
public class GangJing {
    //新增一个卖萌对象
    SellMoe sellMoe;

    //修改构造方法，传入卖萌对象
    @Inject
    public GangJing(SellMoe sellMoe) {
        this.sellMoe = sellMoe;
    }

    //添加一个调用卖萌对象的方法
    public String lookAtHim() {
        Log.e("GangJingSellMoeID", sellMoe.id + "");
        return sellMoe.sellMoe();
    }

    public void gang(Activity activity) {
        Toast.makeText(activity, "这抠脚大汉天天卖萌", Toast.LENGTH_SHORT).show();
    }
}
