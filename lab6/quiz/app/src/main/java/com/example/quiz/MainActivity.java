package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView questionTextView;
    Button textButtonAnswer0;
    Button textButtonAnswer1;
    Button textButtonAnswer2;
    Button textButtonAnswer3;

    String[] question;

    String[][] buttonText;

    int[] answer;
    int[] questionAnswer = new int[10];

    int questionNumber = 0;
    int finalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.textViewQuestion);

        findViewById(R.id.buttonAnswer0).setOnClickListener(this);
        findViewById(R.id.buttonAnswer1).setOnClickListener(this);
        findViewById(R.id.buttonAnswer2).setOnClickListener(this);
        findViewById(R.id.buttonAnswer3).setOnClickListener(this);

        textButtonAnswer0 = findViewById(R.id.buttonAnswer0);
        textButtonAnswer1 = findViewById(R.id.buttonAnswer1);
        textButtonAnswer2 = findViewById(R.id.buttonAnswer2);
        textButtonAnswer3 = findViewById(R.id.buttonAnswer3);

        quiz();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.buttonAnswer0:

                if (questionNumber == 9) {
                    questionAnswer[questionNumber] = 0;
                    quizResult();
                } else {
                    questionAnswer[questionNumber] = 0;
                    questionNumber++;
                    quiz();
                }

                break;

            case R.id.buttonAnswer1:

                if (questionNumber == 9) {
                    questionAnswer[questionNumber] = 1;
                    quizResult();
                } else {
                    questionAnswer[questionNumber] = 1;
                    questionNumber++;
                    quiz();
                }

                break;

            case R.id.buttonAnswer2:

                if (questionNumber == 9) {
                    questionAnswer[questionNumber] = 2;
                    quizResult();
                } else {
                    questionAnswer[questionNumber] = 2;
                    questionNumber++;
                    quiz();
                }

                break;

            case R.id.buttonAnswer3:

                if (questionNumber == 9) {
                    questionAnswer[questionNumber] = 3;
                    quizResult();
                } else {
                    questionAnswer[questionNumber] = 3;
                    questionNumber++;
                    quiz();
                }

                break;

        }
    }

    public void quiz() {

        question = new String[]{
                "Лучший сериал от HBO?",
                "Русский актер из сериала Викинги?",
                "Самый последний сериал от Netflix?",
                "Вставьте пропущенную фразу: Ведьмаку заплатите ... ?",
                "Как зовут Ведьмака?",
                "Откуда родом Ведьмак?",
                "Главная колдунья сериала Ведьмак?",
                "Кого ищет Ведьмак?",
                "Сколько серий в 1 сезоне Сериала Ведьмак?",
                "Цвет волос Геральда?"
        };

        answer = new int[]{3, 0, 3, 2, 1, 2, 3, 1, 0, 3};

        buttonText = new String[][]{
                {"Бесстыдники", "Сотня", "Булл", "Игра Престолов"},
                {"Козловский", "Петров", "Воля", "Путин"},
                {"Сорвиголова", "Готэм", "Счастливы вместе", "Ведьмак"},
                {"Натурой", "Вкусным обедом", "Чеканной монетой", "Мешком залота"},
                {"Хольгер", "Геральд", "Владимир", "Витовт"},
                {"Из Нордскола", "Из Винтерфела", "Из Ривии", "Из Сребролесья"},
                {"Циралла", "Ария", "Фрея", "Енифер"},
                {"Енифер", "Цириллу", "Моргану", "Волкалака"},
                {"8", "12", "10", "22"},
                {"Рыжий", "Черный", "Русый", "Белый"},
        };

        questionTextView.setText(question[questionNumber]);
        textButtonAnswer0.setText(buttonText[questionNumber][0]);
        textButtonAnswer1.setText(buttonText[questionNumber][1]);
        textButtonAnswer2.setText(buttonText[questionNumber][2]);
        textButtonAnswer3.setText(buttonText[questionNumber][3]);

    }

    public void quizResult() {

        findViewById(R.id.buttonAnswer0).setVisibility(View.INVISIBLE);
        findViewById(R.id.buttonAnswer1).setVisibility(View.INVISIBLE);
        findViewById(R.id.buttonAnswer2).setVisibility(View.INVISIBLE);
        findViewById(R.id.buttonAnswer3).setVisibility(View.INVISIBLE);

        for (int i = 0; i <= 9; i++) {

            if (answer[i] == questionAnswer[i])
                finalScore++;

        }

        questionTextView.setText("Your score is " + finalScore + "/10");

    }
}