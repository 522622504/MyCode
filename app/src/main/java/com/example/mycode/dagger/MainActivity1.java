package com.example.mycode.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.mycode.R;
import com.example.mycode.dagger.DaggerMainActivityComponent;
import com.example.mycode.dagger.DaggerOkHttpComponent;
import com.example.mycode.dagger.GangJing;
import com.example.mycode.dagger.SellMoe;

import java.io.IOException;

import javax.inject.Inject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity1 extends AppCompatActivity {
    @Inject
    OkHttpClient okHttpClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = findViewById(R.id.tv);
        //注入对象
        DaggerOkHttpComponent.create().inject(this);
        /**
         以下为OkHttp使用，与Dagger2无关
         */
        Request request = new Request.Builder().url("https://www.baidu.com/s?wd=世界上最帅的人").build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText("查无此人");
                    }
                });
            }

            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            tv.setText(response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}
