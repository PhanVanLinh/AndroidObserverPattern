package toong.vn.androidobserverpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import toong.vn.androidobserverpattern.observer.CurrentConditionsDisplay;
import toong.vn.androidobserverpattern.observer.StatisticsDisplay;
import toong.vn.androidobserverpattern.observerble.WeatherData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
