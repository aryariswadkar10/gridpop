package com.example.exp7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onYT (View view) {
        Toast.makeText(MainActivity.this, "Youtube", Toast.LENGTH_SHORT).show();
    }

    public void onAmazon (View view){
        Toast.makeText(MainActivity.this, "Amazon", Toast.LENGTH_SHORT).show();

    }

    public void onFK(View view){
        Toast.makeText(MainActivity.this, "FlipKart" , Toast.LENGTH_SHORT).show();

    }

    public void onMeesho(View view){
        Toast.makeText(MainActivity.this, "Meesho", Toast.LENGTH_SHORT).show();

    }
}