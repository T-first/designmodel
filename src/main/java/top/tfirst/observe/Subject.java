package top.tfirst.observe;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
    void measurementsChanged();
}
