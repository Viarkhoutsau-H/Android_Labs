package com.example.stormdaily;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.StormDaily.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private void RequestWeather(String nameCity) {
        final TextView textView = (TextView) findViewById(R.id.naimCity);
        final TextView tempText = (TextView) findViewById(R.id.tempText);
        final ImageView imageView = (ImageView) findViewById(R.id.weatherImg);
        final TextView overcastView = (TextView) findViewById(R.id.humidity);
        final TextView pressureView = (TextView) findViewById(R.id.pressure);
        final TextView speedView = (TextView) findViewById(R.id.speed);
        final TextView cloudsView = (TextView) findViewById(R.id.clouds);

        NetworkService.getInstance()
                .jsonGet()
                .getCurrentWeather(nameCity, "6281ac24452719a823176e49b8d6aeb4", "metric")
                .enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(@NonNull Call<Model> call, @NonNull Response<Model> response) {
                        if (response.isSuccessful()) {
                            Model model = response.body();
                            textView.setText(model.getCityName());
                            tempText.setText(Float.toString(model.getMain().getTemp()) + "\u00B0" + "C");
                            if(model.getMain().getTemp() < 0) {
                                imageView.setImageResource(R.drawable.snow3);
                            }
                            else {
                                imageView.setImageResource(R.drawable.rain);
                            }
                            overcastView.setText(Float.toString(model.getMain().getHumidity()) + "%");
                            pressureView.setText(Float.toString(model.getMain().getPressure()) + " мм.рт.ст");
                            speedView.setText(Float.toString(model.getWind().getSpeed()) + " м/с");
                            cloudsView.setText(Float.toString(model.getCloud().getAll()) + '%');


                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<Model> call, @NonNull Throwable t) {
                        textView.setText("Ошибка");
                        t.printStackTrace();
                    }
                });
    }

    ImageButton refresher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refresher = findViewById(R.id.refresher);
        refresher.setOnClickListener(this); //присваиваем обработчик кнопкам
    }


    @Override
    public void onClick(View v) {
        final EditText editText = (EditText) findViewById(R.id.naimCity);
        String nameCity = editText.getText().toString();
        RequestWeather(nameCity);
    }
}