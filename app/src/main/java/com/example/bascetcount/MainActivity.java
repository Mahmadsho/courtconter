package com.example.bascetcount;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addTreeForTeamA(View view) {
        displayForTeamA(scoreTeamA=scoreTeamA+ 3);
    }

    public void addTwoForTeamA(View view) {
        displayForTeamA(scoreTeamA =scoreTeamA + 2);
    }

    public void addOneForTeamA(View view) {
        displayForTeamA(scoreTeamA=scoreTeamA + 1);
    }




    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addTreeForTeamB(View view) {
        displayForTeamB(scoreTeamB=scoreTeamB+ 3);
    }

    public void addTwoForTeamB(View view) {
        displayForTeamB(scoreTeamB =scoreTeamB + 2);
    }

    public void addOneForTeamB(View view) {
        displayForTeamB(scoreTeamB=scoreTeamB + 1);
    }


    public void resetSoret(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamB(scoreTeamA);
        displayForTeamA(scoreTeamB);
    }
}