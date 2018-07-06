package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mAnswerOneButton;
    Button mAnswerTwoButton;
    TextView mTextView;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mAnswerOneButton = (Button) findViewById(R.id.buttonTop);
        mAnswerTwoButton = (Button) findViewById(R.id.buttonBottom);
        mTextView = (TextView) findViewById(R.id.storyTextView);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mAnswerOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStoryOne();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mAnswerTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateStoryTwo();
            }
        });

    }

    private void updateStoryOne() {

        mStoryIndex = mStoryIndex + 1;

        if (mStoryIndex == 2) {
            mTextView.setText(R.string.T3_Story);
            mAnswerOneButton.setText(R.string.T3_Ans1);
            mAnswerTwoButton.setText(R.string.T3_Ans2);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 3) {
            mTextView.setText(R.string.T6_End);
            mAnswerOneButton.setVisibility(View.GONE);
            mAnswerTwoButton.setVisibility(View.GONE);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 7) {
            mTextView.setText(R.string.T3_Story);
            mAnswerOneButton.setText(R.string.T3_Ans1);
            mAnswerTwoButton.setText(R.string.T3_Ans2);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 8) {
            mTextView.setText(R.string.T6_End);
            mAnswerOneButton.setVisibility(View.GONE);
            mAnswerTwoButton.setVisibility(View.GONE);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        }

    }

    private void updateStoryTwo() {

        mStoryIndex = mStoryIndex + 5;

        if (mStoryIndex == 7) {
            mTextView.setText(R.string.T5_End);
            mAnswerOneButton.setVisibility(View.GONE);
            mAnswerTwoButton.setVisibility(View.GONE);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 6) {
            mTextView.setText(R.string.T2_Story);
            mAnswerOneButton.setText(R.string.T2_Ans1);
            mAnswerTwoButton.setText(R.string.T2_Ans2);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 7) {
            mTextView.setText(R.string.T3_Story);
            mAnswerOneButton.setText(R.string.T3_Ans1);
            mAnswerTwoButton.setText(R.string.T3_Ans2);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 11) {
            mTextView.setText(R.string.T4_End);
            mAnswerOneButton.setVisibility(View.GONE);
            mAnswerTwoButton.setVisibility(View.GONE);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        } else if (mStoryIndex == 12) {
            mTextView.setText(R.string.T5_End);
            mAnswerOneButton.setVisibility(View.GONE);
            mAnswerTwoButton.setVisibility(View.GONE);
            Log.d("Destini", "Story Index is " + mStoryIndex);
        }


    }

}