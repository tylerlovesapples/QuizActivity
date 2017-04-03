package edu.andrews.cptr252.tjthomas.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Console;

public class QuizActivity extends AppCompatActivity {

   //Start quiz button
   private Button mStartButton;

   //Show the question list
   private Button mListButton;



   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_quiz);

      //get reference to
      mStartButton = (Button) findViewById(R.id.startQuiz);

      //get reference to
      mListButton = (Button) findViewById(R.id.questionList);

      /*
      Set onClick listener to respond when the user taps the button
       */
      mStartButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Log.d("Taggy", "mStartButton clicked");
         }
      });

      mListButton.setOnClickListener(new View.OnClickListener(){
         @Override
         public void onClick(View v) {
            Log.d("Taggy", "mListButton clicked");
         }
      });
   }
}
