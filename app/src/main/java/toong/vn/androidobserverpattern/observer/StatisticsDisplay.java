package toong.vn.androidobserverpattern.observer;

import toong.vn.androidobserverpattern.observerble.Observable;

/**
 * Created by PhanVanLinh on 21/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Observable weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: "
                + temperature
                + " F degrees and "
                + humidity
                + "% humidity and "
                + pressure
                + " pressure");
    }
}
