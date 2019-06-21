package com.example.mycode.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.mycode.R;
import com.example.mycode.dagger.DaggerMainActivityComponent;
import com.example.mycode.dagger.DaggerOkHttpComponent;
import com.example.mycode.dagger.DaggerSellMoeComponent;
import com.example.mycode.dagger.GangJing;
import com.example.mycode.dagger.SellMoe;
import com.example.mycode.dagger.SellMoeModule;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    @Inject
    SellMoe sellMoe;
//    @Inject
//    GangJing gangJing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = findViewById(R.id.tv);
//        DaggerMainActivityComponent.create().inject(this);
//        sellMoe.id = 1;
//        tv.setText(gangJing.lookAtHim());
//        Log.e("GangJingSellMoeID", sellMoe.id + "");
//        gangJing.gang(this);

        DaggerSellMoeComponent.builder().sellMoeModule(new SellMoeModule(80)).build().inject(this);

        tv.setText(sellMoe.sellMoe());
    }
}
