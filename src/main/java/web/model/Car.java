package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String model;
    int number;
    int series;

    public Car(String model, int number, int series) {
        this.model = model;
        this.number = number;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getSeries() {
        return series;
    }
}
