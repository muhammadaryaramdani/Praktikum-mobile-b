package com.example.kuiskuis;

import static java.security.AccessController.getContext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QnA extends AppCompatActivity implements View.OnClickListener {

    TextView questAmount, question;
    Button answerA, answerB, answerC, answerD;
    int score = 0;
    int totalQuestion = kuncijawaban.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int amountOfQuestion = 1;
    int bestScore = 0;
    int newScore = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qna);

        questAmount = findViewById(R.id.questAmount);
        question = findViewById(R.id.question);
        answerA = findViewById(R.id.answerA);
        answerB = findViewById(R.id.answerB);
        answerC = findViewById(R.id.answerC);
        answerD = findViewById(R.id.answerD);


        answerA.setOnClickListener(this);
        answerB.setOnClickListener(this);
        answerC.setOnClickListener(this);
        answerD.setOnClickListener(this);

        questAmount.setText("Question " + amountOfQuestion + " of " + totalQuestion);
        loadNewQuestion();

    }

    @Override
    public void onClick(View view) {

        answerA.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.btnColor));
        answerB.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.btnColor));
        answerC.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.btnColor));
        answerD.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.btnColor));


        Button clickedButton = (Button) view;

        if(clickedButton.getId() == R.id.answerA|| clickedButton.getId() == R.id.answerB || clickedButton.getId() == R.id.answerC || clickedButton.getId() == R.id.answerD){
            selectedAnswer = clickedButton.getText().toString();
            if(selectedAnswer.equals(kuncijawaban.correctAns[currentQuestionIndex])){
                clickedButton.setBackgroundColor(Color.GREEN);
                score = score + 20;
            }else if(selectedAnswer != kuncijawaban.correctAns[currentQuestionIndex]){
                clickedButton.setBackgroundColor(Color.RED);
            }
            currentQuestionIndex++;
            amountOfQuestion++;

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    if(currentQuestionIndex == totalQuestion){
                        String name = getIntent().getStringExtra("extra_name");
                        String profileImage = getIntent().getStringExtra("PROFILE_IMAGE_URI");

                        Intent intent = new Intent(getApplicationContext(), ScoreActivity.class);
                        intent.putExtra("extra_name", name);
                        intent.putExtra("PROFILE_IMAGE_URI", profileImage);
                        intent.putExtra("TOTAL_SCORE", score);
                        startActivity(intent);
                        return;
                    }else {
                        clickedButton.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.btnColor));
                        questAmount.setText("Question " + amountOfQuestion + " of " + totalQuestion);
                        loadNewQuestion();
                    }
                }
            },1000);


        }

    }

    void loadNewQuestion(){
        //mengambil pertanyaan
        question.setText(kuncijawaban.question[currentQuestionIndex]);

        //mengambil pilihan jawaban
        answerA.setText(kuncijawaban.choice[currentQuestionIndex][0]);
        answerB.setText(kuncijawaban.choice[currentQuestionIndex][1]);
        answerC.setText(kuncijawaban.choice[currentQuestionIndex][2]);
        answerD.setText(kuncijawaban.choice[currentQuestionIndex][3]);

    }
}