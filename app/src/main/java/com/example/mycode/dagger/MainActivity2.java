package com.example.mycode.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.mycode.R;
import com.example.mycode.dagger.Counter;
import com.example.mycode.dagger.CounterMoudule;
import com.example.mycode.dagger.CurrentCounter;
import com.example.mycode.dagger.DaggerCounterComponent;
import com.example.mycode.dagger.TotalCounter;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity2 extends AppCompatActivity {
//    @Named("current")
    @CurrentCounter
    @Inject
    Counter currentCounter;
//    @Named("total")
    @TotalCounter
    @Inject
    Counter totalCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = findViewById(R.id.tv);

        DaggerCounterComponent.builder().counterMoudule(new CounterMoudule(10)).build().inject(this);

        Log.e("current", currentCounter.getSum() + "");
        Log.e("total", totalCounter.getSum() + "");
    }
}
