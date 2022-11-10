import java.util.Scanner;

public class FakEndrekursion {


    static int calcFakultaet(int x, int y){
            if(y == 0) {
                return x;
            }
            return calcFakultaet(x*y, y-1);
        }


        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Zahl: ");
            int y = reader.nextInt();
            if(y <= 0){
                System.out.println("Zahl muss größer als 0 sein!");
            }
            else System.out.println(calcFakultaet(1, y));


        }

    }
