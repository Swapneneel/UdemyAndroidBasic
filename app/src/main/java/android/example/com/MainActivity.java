package android.example.com;

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

    /**
     * Variables to keep the count of goals and fouls
     */
    int goalCount_A, goalCount_B = 0;
    int foul_count_A, foul_count_B = 0;

    /**
     * Methods to show new goal
     * @param
     */
    private void score_team_A() {
        TextView goalText = (TextView) findViewById(R.id.team_a_score);
        goalText.setText(""+goalCount_A);
    }

    private void score_team_B() {
        TextView goalText = (TextView) findViewById(R.id.team_b_score);
        goalText.setText(""+goalCount_B);
    }

    /**
     * Methods to show new foul
     * @param
     */
    private void fouls_team_A() {
        TextView foulText = (TextView) findViewById(R.id.team_a_fouls);
        foulText.setText("Fouls: " + foul_count_A);
    }

    private void fouls_team_B() {
        TextView foulText = (TextView) findViewById(R.id.team_b_fouls);
        foulText.setText("Fouls: " + foul_count_B);
    }

    /**
     * Goal and foul count incrementer for Team A
     * @param view
     */
    public void goal_teamA(View view) {
        goalCount_A = goalCount_A + 1;
        score_team_A();
    }

    public void foul_teamA(View view) {
        foul_count_A = foul_count_A + 1;
        fouls_team_A();
    }


    /**
     * Gola and foul count incrementer for Team B
     * @param view
     */
    public void goal_teamB(View view) {
        goalCount_B = goalCount_B + 1;
        score_team_B();
    }

    public void foul_teamB(View view) {
        foul_count_B = foul_count_B + 1;
        fouls_team_B();
    }


    /**
     * New Match btn
     */
    public void newMatchBtn(View v) {
        goalCount_A = 0;
        foul_count_A = 0;
        goalCount_B = 0;
        foul_count_B = 0;

        score_team_A();
        score_team_B();
        fouls_team_A();
        fouls_team_B();
    }
}
