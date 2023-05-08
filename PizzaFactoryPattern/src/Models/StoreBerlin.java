package Models;

public class StoreBerlin extends Store{

    public StoreBerlin(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaVariation p) {
        if(p == PizzaVariation.Salami) return new PizzaSalami(PizzaLocalVariation.BerlinSalami, StoreLocation.Berlin);
        if(p == PizzaVariation.Calzone) return new PizzaCalzone(PizzaLocalVariation.BerlinCalzone, StoreLocation.Berlin);
        return new PizzaHawaii(PizzaLocalVariation.BerlinHawaii, StoreLocation.Berlin);
    }

    @Override
    public Pizza cook(PizzaVariation p, StoreLocation s) {
        if(p == PizzaVariation.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalVariation.BerlinSalami, StoreLocation.Berlin);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalVariation.HamburgSalami, StoreLocation.Berlin);
            return new PizzaSalami(PizzaLocalVariation.RostockSalami, StoreLocation.Berlin);
        }
        if(p == PizzaVariation.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalVariation.BerlinHawaii, StoreLocation.Berlin);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalVariation.HamburgHawaii, StoreLocation.Berlin);
            return new PizzaHawaii(PizzaLocalVariation.RostockHawaii, StoreLocation.Berlin);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalVariation.BerlinCalzone, StoreLocation.Berlin);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalVariation.HamburgCalzone, StoreLocation.Berlin);
        return new PizzaCalzone(PizzaLocalVariation.RostockCalzone, StoreLocation.Berlin);
        //}
    }

}
