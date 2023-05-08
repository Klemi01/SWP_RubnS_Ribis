package models;

public class ObserverColor implements ObServer{

    private Sensor subject;

    public ObserverColor(Sensor sensor){
        this.subject = sensor;
        this.subject.addObserver(this);
    }

    @Override
    public void updatePull() {

        System.out.println("Farbe wurde aktualisiert");
    }

    public static final String reset = "\u001B[0m";
    public static final String rot = "\u001B[31m";
    public static final String blau = "\u001B[34m";
    public static final String gruen = "\u001B[32m";

    @Override
    public void pull(){
        if(subject.getTemperature() <= 10){
            System.out.print(blau + "BLUE\t\t" + reset);
        }
        else if(subject.getTemperature() >= 35){
            System.out.print(rot + "RED\t\t\t" + reset);
        }
        else{
            System.out.print(gruen + "GREEN\t\t" + reset);
        }
    }

    @Override
    public void push(Sensor sensor) {
        if(sensor.getTemperature() <= 10){
            System.out.print(blau + "BLUE\t\t" + reset);
        }
        else if(subject.getTemperature() >= 35){
            System.out.print(rot + "RED\t\t\t" + reset);
        }
        else{
            System.out.print(gruen+ "GREEN\t\t" + reset);
        }
    }
}
