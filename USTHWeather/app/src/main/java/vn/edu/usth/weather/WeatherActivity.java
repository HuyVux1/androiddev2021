package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


public class WeatherActivity extends AppCompatActivity {
    private static  final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, firstFragment).commit();

        Log.i(TAG,"Created");

    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }
}