package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int mainScoreTeamA = 0;
    int mainScoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
        displayForTeamB(0);
        displayForBothTeams(0);
    }


    /**
     * This method handles scores for team A
     * @param score
     */

    public void displayForTeamA(int score) {
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(String.valueOf(score));
    }

    public void point_3(View view){
        mainScoreTeamA = mainScoreTeamA + 3;
        displayForTeamA(mainScoreTeamA);
    }

    public void point_2(View view){
        mainScoreTeamA = mainScoreTeamA + 2;
        displayForTeamA(mainScoreTeamA);
    }

    public void freethrow(View view){
        mainScoreTeamA = mainScoreTeamA + 1;
        displayForTeamA(mainScoreTeamA);

    }


    /**
     * This methods handle scores for team B
     * @param scoreB
     */


    public void displayForTeamB(int scoreB){
        TextView t = (TextView) findViewById(R.id.team_b_score);
        t.setText(String.valueOf(scoreB));
    }

    public void point_3b(View view){
        mainScoreTeamB = mainScoreTeamB + 3;
        displayForTeamB(mainScoreTeamB);
    }

    public void point_2b(View view){
        mainScoreTeamB = mainScoreTeamB + 2;
        displayForTeamB(mainScoreTeamB);
    }

    public void freethrowb(View view){
        mainScoreTeamB = mainScoreTeamB + 1;
        displayForTeamB(mainScoreTeamB);
    }


    /**
     * This method is called when the reset button is clicked
     */

    public void displayForBothTeams(int rreset){
        TextView t = (TextView) findViewById(R.id.team_a_score);
        t.setText(String.valueOf(rreset));

        TextView tv = (TextView) findViewById(R.id.team_b_score);
        tv.setText(String.valueOf(rreset));
    }

    public void reseting(View v){
        displayForBothTeams(0);

    }

 //This can be used to call the reset button and have it reset the score values
    /**
     * public void resetScore(View v) {
     *     mainScoreTeamA = 0;
     *     mainScoreTeamB = 0;
     *     displayForTeamA(mainScoreTeamA);
     *     displayForTeamB(mainScoreTeamB);
     * }
     */

}
