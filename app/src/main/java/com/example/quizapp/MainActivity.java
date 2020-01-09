package com.example.quizapp;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitOrder(View view) {


        int RadioButtoncounter = checkRadioButton();
        int checkBoxcounter = checkBox();
        int editTextCounter = checkEditText();
       int result= score(RadioButtoncounter, checkBoxcounter, editTextCounter);
        Toast.makeText(this,"Your result: "+result+" / 7",Toast.LENGTH_SHORT).show();

    }

    public int checkRadioButton() {
        RadioButton trueRadioOption_Q1 = findViewById(R.id.Question1_option1);
        boolean question1 = trueRadioOption_Q1.isChecked();

        RadioButton trueRadioOption_Q2 = findViewById(R.id.Question2_option1);
        boolean question2 = trueRadioOption_Q2.isChecked();

        RadioButton trueRadioOption_Q3 = findViewById(R.id.Question3_option2);
        boolean question3 = trueRadioOption_Q3.isChecked();
        int RadioButtoncounter = 0;

        if (question1) {
            RadioButtoncounter++;
        }
        if (question2) {
            RadioButtoncounter++;
        }
        if (question3) {
            RadioButtoncounter++;
        }
        return RadioButtoncounter;

    }

    public int checkBox() {
        CheckBox truecheckBox_Q4_1 = findViewById(R.id.question4_option1);
        boolean question4_1 = truecheckBox_Q4_1.isChecked();

        CheckBox truecheckBox_Q4_3 = findViewById(R.id.question4_option3);
        boolean question4_3 = truecheckBox_Q4_3.isChecked();


        CheckBox truecheckBox_Q5_1 = findViewById(R.id.question5_option1);
        boolean question5_1 = truecheckBox_Q5_1.isChecked();

        CheckBox truecheckBox_Q5_2 = findViewById(R.id.question5_option2);
        boolean question5_2 = truecheckBox_Q5_2.isChecked();
        //...............................................................
        CheckBox truecheckBox_Q4_2 = findViewById(R.id.question4_option2);
        boolean question4_2 = truecheckBox_Q4_2.isChecked();

        CheckBox truecheckBox_Q4_4 = findViewById(R.id.question4_option4);
        boolean question4_4 = truecheckBox_Q4_4.isChecked();


        CheckBox truecheckBox_Q5_3 = findViewById(R.id.question5_option3);
        boolean question5_3 = truecheckBox_Q5_3.isChecked();

        CheckBox truecheckBox_Q5_4 = findViewById(R.id.question5_option4);
        boolean question5_4 = truecheckBox_Q5_4.isChecked();


        int checkBoxcounter = 0;

        if (question4_1 && question4_3) {
            if (question4_2 == false && question4_4 == false) {
                checkBoxcounter++;
            }
        }

        if (question5_1 && question5_2) {
            if (question5_3 == false && question5_4 == false) {
                checkBoxcounter++;
            }
        }

        return checkBoxcounter;
    }

    public int checkEditText() {
        double result1, result2;


        EditText Question6_result = findViewById(R.id.question6_EditText);

        String ed_text = Question6_result.getText().toString().trim();

        if (ed_text.isEmpty() || ed_text.length() == 0 || ed_text.equals("") || ed_text == null) {
            result1 = 0.0;
        } else {
            result1 = Double.parseDouble(Question6_result.getText().toString());
        }
        //..............................................

        EditText Question7_result = findViewById(R.id.question7_EditText);

        String ed_text1 = Question7_result.getText().toString().trim();

        if (ed_text1.isEmpty() || ed_text1.length() == 0 || ed_text1.equals("") || ed_text1 == null) {
            result2 = 0.0;
        } else {
            result2 = Double.parseDouble(Question7_result.getText().toString());
        }

        int editTextCounter = 0;

        if ((int) result1 == 56) {
            editTextCounter++;
        }
        if ((int) result2 == 18) {
            editTextCounter++;
        }

        return editTextCounter;
    }


    public int score(int RadioButtoncounter, int checkBoxcounter, int editTextCounter) {
        int score = 0;
        score=RadioButtoncounter + checkBoxcounter + editTextCounter;
       return score;
    }
}