package com.example.android.scorekeeper;

import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int scoreBuccaneers;
    int scorePackers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Buccaneers methods

    public void displayBuccaneers(int score) {
        TextView scoreView = findViewById(R.id.score_buccaneers);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsToB(View v) {
        scoreBuccaneers = scoreBuccaneers + 3;
        displayBuccaneers(scoreBuccaneers);
    }

    public void addTwoPointsToB(View v) {
        scoreBuccaneers = scoreBuccaneers + 2;
        displayBuccaneers(scoreBuccaneers);
    }

    public void addOnePointToB(View v) {
        scoreBuccaneers = scoreBuccaneers + 1;
        displayBuccaneers(scoreBuccaneers);
    }

    public void addSixPointsToB(View v) {
        scoreBuccaneers = scoreBuccaneers + 6;
        displayBuccaneers(scoreBuccaneers);
    }

    // Packers methods

    public void displayPackers(int score) {
        TextView scoreView = findViewById(R.id.score_packers);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreePointsToP(View v) {
        scorePackers = scorePackers + 3;
        displayPackers(scorePackers);
    }

    public void addTwoPointsToP(View v) {
        scorePackers = scorePackers + 2;
        displayPackers(scorePackers);
    }

    public void addOnePointToP(View v) {
        scorePackers = scorePackers + 1;
        displayPackers(scorePackers);
    }

    public void addSixPointsToP(View v) {
        scorePackers = scorePackers + 6;
        displayPackers(scorePackers);
    }

    // resets scores

    public void resetScores (View v) {
        scoreBuccaneers = 0;
        scorePackers = 0;
        displayBuccaneers(scoreBuccaneers);
        displayPackers(scorePackers);
    }

}
