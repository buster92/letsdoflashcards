package com.letsflashcards.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @Click(R.id.activity_main_letsgo)
    void startClick(){
        PlayCardsActivity_.intent(this).start();
    }
}
