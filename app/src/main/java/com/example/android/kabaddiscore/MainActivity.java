package com.example.android.kabaddiscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addOneToTeamA(View view) {
        scoreA++;
        displayTeamAScore(scoreA);

    }

    public void addOneToTeamB(View view) {
        scoreB++;
        displayTeamBScore(scoreB);
    }

    public void addTwoToTeamA(View view) {
        scoreA += 2;
        displayTeamAScore(scoreA);
    }

    public void addTwoToTeamB(View view) {
        scoreB += 2;
        displayTeamBScore(scoreB);
    }

    public void finishMatch(View view) {

        Context context = getApplicationContext();
        CharSequence text;
        if(scoreA>scoreB){
            text="Team A win the match by "+(scoreA-scoreB)+" points.";
        }else if(scoreB>scoreA){
            text="Team B win the match by "+ (scoreB-scoreA)+" ponits.";
        }else{
            text="Match Draw!";
        }

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        scoreA = 0;
        scoreB = 0;
        displayTeamAScore(scoreA);
        displayTeamBScore(scoreB);
    }

    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayTeamAScore(scoreA);
        displayTeamBScore(scoreB);
    }

    private void displayTeamAScore(int number) {
        TextView teamA = (TextView) findViewById(R.id.teamA_score);
        teamA.setText("" + number);

    }

    private void displayTeamBScore(int number) {
        TextView teamB = (TextView) findViewById(R.id.teamB_score);
        teamB.setText("" + number);
    }
}