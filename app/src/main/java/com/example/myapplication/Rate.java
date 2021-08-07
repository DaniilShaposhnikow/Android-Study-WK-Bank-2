package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

import java.util.Objects;

public class Rate extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        setTitle(R.string.Rate);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#DAD3D3'>"+getResources().getString(R.string.Rate)+"</font>"));
    }
}
