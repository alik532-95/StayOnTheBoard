package android.example.stayontheboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayFriendsActivity extends AppCompatActivity {
    private Button buttonRules;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_friends);

        buttonRules = findViewById(R.id.buttonRules);

        buttonRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = PlayFriendsActivity.this;
                Class destinationActivity = RulesActivity.class;
                Intent rulesActivityIntent = new Intent(context, destinationActivity);
                startActivity(rulesActivityIntent);
            }
        });
    }
}
