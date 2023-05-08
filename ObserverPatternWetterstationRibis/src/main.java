import models.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Sensor sensor = new Sensor();

        ObserverDisplay display = new ObserverDisplay(sensor);
        ObserverColor color = new ObserverColor(sensor);

        Scanner reader = new Scanner(System.in);


        for(;;){

            // push variant
            sensor.measurePush();

            // pull variant
           /* sensor.measurePull();
            System.out.println("Werte anzeigen? [j/n]");
            char choice = reader.next().toLowerCase().charAt(0);
            if(choice == 'j'){
                sensor.pullAllObservers();
            } */


        }



    }
}
