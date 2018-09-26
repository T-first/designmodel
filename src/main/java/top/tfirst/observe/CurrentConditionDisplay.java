package top.tfirst.observe;

public class CurrentConditionDisplay implements Observer,DisplayElement {
    private  float t;
    private  float h;
    private  Subject  weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("Current conditions: "+t +"F degrees and "+ h + "%humidity");
    }

    public void update(float temp, float humidity, float pressure) {
    this.t =temp;
    this.h =h;
    display();
    }
}
