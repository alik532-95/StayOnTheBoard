package android.example.stayontheboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonPlay;
    private Button buttonSettings;
    private Button buttonRules;
    private Button buttonFeedback;
    private Button buttonExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = findViewById(R.id.buttonPlay);
        buttonSettings = findViewById(R.id.buttonSettings);
        buttonRules = findViewById(R.id.buttonRules);
        buttonFeedback = findViewById(R.id.buttonFeedback);
        buttonExit = findViewById(R.id.buttonExit);

        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                Class destinationActivity = PlayActivity.class;
                Intent PlayActivityIntent = new Intent(context, destinationActivity);
                startActivity(PlayActivityIntent);
            }
        });

        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                String message = getString(R.string.toastNotAvailable);
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
            }
        });

        buttonRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                Class destinationActivity = RulesActivity.class;
                Intent rulesActivityIntent = new Intent(context, destinationActivity);
                startActivity(rulesActivityIntent);
            }
        });

        buttonFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = MainActivity.this;
                Class destinationActivity = FeedbackActivity.class;
                Intent feedbackActivityIntent = new Intent(context, destinationActivity);
                startActivity(feedbackActivityIntent);
            }
        });

        buttonExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}
