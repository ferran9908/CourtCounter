package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayScoreA(int sc)
    {
        TextView s = findViewById(R.id.scoreA_text_view);
        scoreA+=sc;
        s.setText(String.valueOf(scoreA));
    }
    public void threePointsA(View view)
    {
        displayScoreA(3);
    }
    public void twoPointsA(View view)
    {
        displayScoreA(2);
    }
    public void freeThrowA(View view)
    {
        displayScoreA(1);
    }

    private void displayScoreB(int sc)
    {
        TextView s = findViewById(R.id.scoreB_text_view);
        scoreB+=sc;
        s.setText(String.valueOf(scoreB));
    }
    public void threePointsB(View view)
    {
        displayScoreB(3);
    }
    public void twoPointsB(View view)
    {
        displayScoreB(2);
    }
    public void freeThrowB(View view)
    {
        displayScoreB(1);
    }

    public void reset(View v)
    {
        scoreA=0;
        scoreB=0;
        TextView A = findViewById(R.id.scoreA_text_view);
        TextView B = findViewById(R.id.scoreB_text_view);
        A.setText(String.valueOf(0));
        B.setText(String.valueOf(0));
    }
}
