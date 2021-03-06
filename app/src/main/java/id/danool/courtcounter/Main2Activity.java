package id.danool.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tvScoreTeamA;
    private TextView tvScoreTeamB;
    private Button btn3A;
    private Button btn2A;
    private Button btnFreeA;
    private Button btn3B;
    private Button btn2B;
    private Button btnFreeB;
    private Button btnReset;
    private int scoreTeamA;
    private int scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init() {
        tvScoreTeamA = (TextView) findViewById(R.id.tv_score_team_a);
        tvScoreTeamB = (TextView) findViewById(R.id.tv_score_team_b);
        btn3A = (Button) findViewById(R.id.btn_3_a);
        btn2A = (Button) findViewById(R.id.btn_2_a);
        btnFreeA = (Button) findViewById(R.id.btn_free_a);
        btn3B = (Button) findViewById(R.id.btn_3_b);
        btn2B = (Button) findViewById(R.id.btn_2_b);
        btnFreeB = (Button) findViewById(R.id.btn_free_b);
        btnReset = (Button) findViewById(R.id.btn_reset);
        scoreTeamA = 0;
        scoreTeamB = 0;

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                tvScoreTeamA.setText(scoreTeamA+"");
                tvScoreTeamB.setText(scoreTeamB+"");

            }
        });
        btn3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(3);
            }
        });
        btn2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(2);
            }
        });

        btnFreeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamA(1);
            }
        });

        btn3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamB(3);
            }
        });
        btn2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamB(2);
            }
        });
        btnFreeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPointToTeamB(1);
            }
        });
    }

    private void addPointToTeamA(int i) {
        scoreTeamA += i;
        tvScoreTeamA.setText(scoreTeamA+"");
    }

    private void addPointToTeamB(int i) {
        scoreTeamB += i;
        tvScoreTeamB.setText(scoreTeamB+"");
    }
}