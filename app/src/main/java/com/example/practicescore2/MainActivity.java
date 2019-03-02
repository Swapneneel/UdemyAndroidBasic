package com.example.practicescore2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /**
     * Method to show score of Team A
     * @param score_a
     */
    private void displayScoreTeam_A(int score_a) {
        TextView score_of_A = (TextView) findViewById(R.id.score_count_A);
        score_of_A.setText(""+score_a);
    }


    /**
     * Method to show score of Team B
     * @param score_b
     */
    private void displayScoreTeam_B(int score_b) {
        TextView score_of_A = (TextView) findViewById(R.id.score_count_B);
        score_of_A.setText(""+score_b);
    }

    /**
     * Score Count Variable for both the Teams
     */
    int scoreCountA, scoreCountB = 0;

    /**
     * Score Buttons for Team A
     * @param view
     */
    public void score_3_teamA(View view) {
        scoreCountA = scoreCountA + 3;
        displayScoreTeam_A(scoreCountA);
    }

    public void score_2_teamA(View view) {
        scoreCountA = scoreCountA + 2;
        displayScoreTeam_A(scoreCountA);
    }

    public void score_free_teamA(View view) {
        scoreCountA = scoreCountA + 1;
        displayScoreTeam_A(scoreCountA);
    }



    /**
     * Score buttons for Team B
     * @param view
     */
    public void score_3_teamB(View view) {
        scoreCountB = scoreCountB + 3;
        displayScoreTeam_B(scoreCountB);
    }

    public void score_2_teamB(View view) {
        scoreCountB = scoreCountB + 2;
        displayScoreTeam_B(scoreCountB);
    }

    public void score_free_teamB(View view) {
        scoreCountB = scoreCountB + 1;
        displayScoreTeam_B(scoreCountB);
    }



    /**
     * Reset button for the match
     * @param view
     */
    public void resetMatch(View view){
        scoreCountA = 0;
        displayScoreTeam_A(0);
        scoreCountB = 0;
        displayScoreTeam_B(0);
    }
}
