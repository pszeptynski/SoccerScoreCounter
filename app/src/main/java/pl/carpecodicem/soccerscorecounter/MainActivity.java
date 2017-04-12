package pl.carpecodicem.soccerscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int cornerTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;
    int cornerTeamB = 0;

    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void addCornerForTeamA(View v) {
        cornerTeamA = cornerTeamA + 1;
        displayCornerForTeamA(cornerTeamA);
    }

    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void addCornerForTeamB(View v) {
        cornerTeamB = cornerTeamB + 1;
        displayCornerForTeamB(cornerTeamB);
    }


    public void resetScore(View v) {
        scoreTeamA = 0;
        foulTeamA = 0;
        cornerTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        cornerTeamB = 0;

        displayScoreForTeamA(scoreTeamA);
        displayFoulForTeamA(foulTeamA);
        displayCornerForTeamA(cornerTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayFoulForTeamB(foulTeamB);
        displayCornerForTeamB(cornerTeamB);
    }

    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayCornerForTeamA(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.team_a_corner);
        cornerView.setText(String.valueOf(corner));
    }

    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));
    }

    public void displayCornerForTeamB(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.team_b_corner);
        cornerView.setText(String.valueOf(corner));
    }
}
