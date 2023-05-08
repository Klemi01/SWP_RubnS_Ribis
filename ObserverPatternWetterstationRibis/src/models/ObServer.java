package models;

public interface ObServer {
    public void updatePull();
    public void pull();
    public void push(Sensor sensor);
}
