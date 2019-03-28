package com.example.logica_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button submit;
    private String answer1, answer2, answer3, answer4;
    private EditText question1, question2, question3, question4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.buttonSubmit);
        question1 = findViewById(R.id.textUserInput1);
        question2 = findViewById(R.id.textUserInput2);
        question3 = findViewById(R.id.textUserInput3);
        question4 = findViewById(R.id.textUserInput4);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswers();
            }
        });
    }


    private void checkAnswers() {
        answer1 = question1.getText().toString();
        answer2 = question2.getText().toString();
        answer3 = question3.getText().toString();
        answer4 = question4.getText().toString();

        if ((answer1.equals("F")) || answer2.equals("T") || answer3.equals("T") || answer4.equals("F")) {
            Toast.makeText(this, "One or more answers have been answered wrong. Try again!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Congratulations, you have answered every question right. You good!", Toast.LENGTH_SHORT).show();
        }
    }
}
