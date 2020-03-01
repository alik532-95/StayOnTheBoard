package android.example.stayontheboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {

    private Button buttonPlArtificialIntelligence;
    private Button buttonPlayFriends;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        buttonPlArtificialIntelligence = findViewById(R.id.buttonPlArtificialIntelligence);
        buttonPlayFriends = findViewById(R.id.buttonPlayFriends);

        buttonPlArtificialIntelligence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = PlayActivity.this;

                String message = getString(R.string.toastNotAvailable);
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

                Class destinationActivity = BoardSizeActivity.class;
                Intent BoardSizeActivityIntent = new Intent(context, destinationActivity);
                startActivity(BoardSizeActivityIntent);
            }
        });

        buttonPlayFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = PlayActivity.this;

                String message = getString(R.string.toastNotAvailable);
                Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

                Class destinationActivity = PlayFriendsActivity.class;
                Intent PlayFriendsActivityIntent = new Intent(context, destinationActivity);
                startActivity(PlayFriendsActivityIntent);
            }
        });
    }
}
