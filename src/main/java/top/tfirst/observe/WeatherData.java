package top.tfirst.observe;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private  float t;
    private  float p;
    private  float h;
    private ArrayList observers;
    public WeatherData() {
        observers =  new ArrayList<Observer>();
    }

    public float getT() {
        return t;

    }

    public void setT(float t) {
        this.t = t;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public void registerObserver(Observer o) {
      observers.add(o);
    }

    public void removeObserver(Observer o) {
      observers.remove(o);
    }

    public void notifyObservers() {
      for(int i = 0 ;i < observers.size();i++){
          Observer observer = (Observer) observers.get(i);
          observer.update(t,h,p);
      }
    }
    public void measurementsChanged() {
      notifyObservers();
    }
    public void setMeasurements(float t,float h,float p){
          this.t = t;
          this.h = h;
          this.p = p;
        measurementsChanged();
    }
}
