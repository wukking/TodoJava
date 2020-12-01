package com.wuyson.todojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.wuyson.common.util.DateUtils;
/**
 * @author Wuyson
 * @date 2020/12/1
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "Time1:" + DateUtils.getEpochSecond1());
        Log.e(TAG, "Time2:" + DateUtils.getEpochSecond());
        Log.e(TAG, "Time3:" + DateUtils.currentTimeSeconds());
    }

    public void launchHome(View view) {
        startActivity(new Intent(this,HomeActivity.class));
    }
}