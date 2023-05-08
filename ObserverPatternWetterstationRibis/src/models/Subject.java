package models;
import models.ObServer;

public interface Subject  {

    public void addObserver(ObServer observer);
    public void removeObserver(ObServer observer);
    public void notifyObserverPull();
    public void notifyObserverPush(Sensor sensor);
}
