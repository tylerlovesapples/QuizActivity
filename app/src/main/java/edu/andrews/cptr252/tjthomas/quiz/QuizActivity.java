package edu.andrews.cptr252.tjthomas.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.Console;

public class QuizActivity extends AppCompatActivity {
   /** Tag for this class */
   public static final String TAG = "QuizActivity";

   Question tempQuestion = new Question();

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

      tempQuestion.setQuestion("What's my name?");
      tempQuestion.addAnswer("Tyler Thomas", true);
      tempQuestion.addAnswer("Markus Oh", true);
      tempQuestion.addAnswer("Gordon Freeman", false);
      tempQuestion.addAnswer("Jason Illegal", false);

      /*
      Set onClick listener to respond when the user taps the button
       */
      mStartButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            Log.d(TAG, "mStartButton clicked");
            Log.d(TAG, tempQuestion.toString());
            tempQuestion.removePosition(0);
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
