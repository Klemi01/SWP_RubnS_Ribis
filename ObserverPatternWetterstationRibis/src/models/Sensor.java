package models;
import java.util.ArrayList;
import java.util.List;

public class Sensor implements Subject{

    private double temp;
    private double luftfeu;

    public double getTemperature(){
        return this.temp;
    }

    public double getHumidity(){
        return this.luftfeu;
    }

    public Sensor(){}

    public Sensor(double t, double h){
        this.temp = t;
        this.luftfeu = h;
    }

    public void measurePull(){
        this.temp = (double)(Math.random() * 30);
        this.luftfeu = (double)(Math.random() * 100);
        this.notifyObserverPull();
    }

    public void measurePush(){
        this.temp = (double)(Math.random() * 30);
        this.luftfeu = (double)(Math.random() * 100);
        this.notifyObserverPush(new Sensor(this.temp, this.luftfeu));
    }

    List<ObServer> observers = new ArrayList<>();

    @Override
    public void addObserver(ObServer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(ObServer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserverPull() {
        for(ObServer ob : this.observers){
            ob.updatePull();
        }
    }

    @Override
    public void notifyObserverPush(Sensor sensor) {
        for(ObServer ob : this.observers){
            ob.push(sensor);
        }
    }
}
