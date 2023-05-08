package models;

public class ObserverDisplay implements ObServer {

    private  Sensor subject;

    public ObserverDisplay(Sensor sensor){
        this.subject = sensor;
        this.subject.addObserver(this);
    }

    @Override
    public void updatePull() {
        System.out.println("Display wurde aktualisiert");
    }

    @Override
    public void pull(){
        System.out.println(this.subject.getTemperature() +"°" +" " + this.subject.getHumidity() +"%");
    }

    @Override
    public void push(Sensor sensor) {
        System.out.println(this.subject.getTemperature() +"°" +" " + this.subject.getHumidity() +"%");
    }
}
