package com.binduhait.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
       int countA = 0;
       int countB = 0;
    public void AddThreeForTeamA(View view){
        countA = countA+3;
        displayForTeamA(countA);
    }
    public void AddTwoForTeamA(View view){
        countA = countA+2;
        displayForTeamA(countA);
    }
    public void AddOneForTeamA(View view){
        countA = countA+1;
        displayForTeamA(countA);
    }


    public void AddThreeForTeamB(View view) {
        countB = countB + 3;
        displayForTeamB(countB);
    }

    public void AddTwoForTeamB(View view) {
        countB = countB + 2;
        displayForTeamB(countB);
    }

    public void AddOneForTeamB(View view) {
        countB = countB + 1;
        displayForTeamB(countB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void resetScore(View view) {
        countB = 0;
        countA = 0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}