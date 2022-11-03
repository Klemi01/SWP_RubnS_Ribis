public class Summenfunktion {


        public static void main(String[] args) {

            int ergebnis = Rekursion(6);
            int ergebnis2 = Interativ(6);
            System.out.printf("Summenfunktion von 6 ist %d\n", ergebnis);
            System.out.printf("Summenfunktion von 6 ist %d", ergebnis2);
        }

        public static int Rekursion(int zahl){
            if(zahl>=1) {
                return zahl + Rekursion(zahl - 1);
            }
            else{
                return zahl;
            }
        }
        public static int Interativ(int zahl2){
            for(int i = zahl2 -1 ;i > 0; i--){
              zahl2 = zahl2 + i;
            }
            return zahl2;
        }

}
