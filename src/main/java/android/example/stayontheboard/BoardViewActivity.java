package android.example.stayontheboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BoardViewActivity extends AppCompatActivity {
    private TextView textViewBoardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_view);

        textViewBoardView = findViewById(R.id.textViewBoardView);

        Intent intentThatStartedThisActivity = getIntent();

        if(intentThatStartedThisActivity.hasExtra("progressInt")) {
            int size = intentThatStartedThisActivity.getIntExtra("progressInt", 4);
//            String size = intentThatStartedThisActivity.getStringExtra("progressInt");
            textViewBoardView.setText(String.valueOf(size));
        }
    }
}
