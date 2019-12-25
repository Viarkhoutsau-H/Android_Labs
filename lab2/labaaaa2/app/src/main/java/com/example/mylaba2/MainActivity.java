package com.example.mylaba2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{


    TextView tvOut;
    Button myButton;
    Button myButton2;
    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "найдем View-элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        myButton = (Button) findViewById(R.id.myButton);
        myButton2 = (Button) findViewById(R.id.myButton2) ;

        Log.d(TAG, "присваиваем обработчик кнопкам");
        myButton.setOnClickListener(this);
        myButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "по id определяем кнопку, вызвавшую этот обработчик");
        switch (v.getId()) {
            case R.id.myButton:
                Log.d(TAG, "А что же ночью?");
                tvOut.setText("Днем в Минске +25");
                Toast.makeText(this, "А что же ночью?", Toast.LENGTH_LONG).show();
                break;
            case R.id.myButton2:
                Log.d(TAG, "А что же днем?");
                tvOut.setText("Ночью в Минске +5");
                Toast.makeText(this, "А что же днем?", Toast.LENGTH_LONG).show();
                break;
        }
    }
}