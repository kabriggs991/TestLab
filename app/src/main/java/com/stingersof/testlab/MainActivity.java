package com.stingersof.testlab;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import android.util.Log;import android.view.View;import android.widget.Button;import android.widget.TextView;import android.os.CountDownTimer;public class MainActivity extends AppCompatActivity {    @Override    protected void onCreate(Bundle savedInstanceState) {        Log.i("MainActivity", "Starting App");        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);    }}