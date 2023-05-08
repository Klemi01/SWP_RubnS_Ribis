package Models;

public class StoreFactory {

    public static Store newLocation(StoreLocation loc){

        if(loc == StoreLocation.Berlin) return new StoreBerlin(loc);
        if(loc == StoreLocation.Hamburg) return new StoreHamburg(loc);
        return new StoreRostock(loc);
    }

}
