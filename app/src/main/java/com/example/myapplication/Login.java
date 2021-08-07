package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class Login extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(R.string.lo);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#DAD3D3'>"+getResources().getString(R.string.lo)+"</font>"));
    }
}