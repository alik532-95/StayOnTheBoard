package android.example.stayontheboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.xw.repo.BubbleSeekBar;

public class BoardSizeActivity extends AppCompatActivity {
    private TextView textViewBoardSizeInfo;
    /*private TextView textViewBoardSizeб;
    private ProgressBar progressBarBoardSize;
    private SeekBar seekBarBoardSize;*/
    private BubbleSeekBar bubbleSeekBarBoardSize;
    private Button buttonBoardSize;
    private int progressInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_size);

        /*textViewBoardSizeInfo = (TextView) findViewById(R.id.textViewBoardSizeInfo);
        textViewBoardSize = (TextView) findViewById(R.id.textViewBoardSize);
        progressBarBoardSize = (ProgressBar) findViewById(R.id.progressBarBoardSize);
        seekBarBoardSize = (SeekBar) findViewById(R.id.seekBarBoardSize);*/
        bubbleSeekBarBoardSize = (BubbleSeekBar) findViewById(R.id.bubbleSeekBarBoardSize);
        buttonBoardSize = (Button) findViewById(R.id.buttonBoardSize);

        /*seekBarBoardSize.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBarBoardSize, int progress, boolean fromUser) {
                progressBarBoardSize.setProgress(progress);
                textViewBoardSize.setText("" + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBarBoardSize) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBarBoardSize) {

            }
        });
        */
       buttonBoardSize.setText("Створити дошку розміром " + bubbleSeekBarBoardSize.getProgress() + " на " + bubbleSeekBarBoardSize.getProgress());
/*
       int sizeInt;
       sizeInt = 0;
       while (sizeInt<5) { sizeInt=sizeInt++;}
*/
       bubbleSeekBarBoardSize.setOnProgressChangedListener(new BubbleSeekBar.OnProgressChangedListener() {
            @Override
            public void onProgressChanged(int progress, float progressFloat) {
                buttonBoardSize.setText("Створити дошку розміром " + progress + " на " + progress);
                progressInt = progress;
            }

            @Override
            public void getProgressOnActionUp(int progress, float progressFloat) {
                buttonBoardSize.setText("Створити дошку розміром " + progress + " на " + progress);
                progressInt = progress;
            }

            @Override
            public void getProgressOnFinally(int progress, float progressFloat) {
                buttonBoardSize.setText("Створити дошку розміром " + progress + " на " + progress);
                progressInt = progress;
            }
       });


        buttonBoardSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String size = "4";

                Context context = BoardSizeActivity.this;
                Class destinationActivity = BoardViewActivity.class;
                Intent boardViewActivityIntent = new Intent(context, destinationActivity);

                boardViewActivityIntent.putExtra("progressInt", progressInt);

                startActivity(boardViewActivityIntent);
            }
        });
    }
}