package Models;

public class StoreHamburg extends Store{

    public StoreHamburg(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaVariation p) {
        if(p == PizzaVariation.Salami) return new PizzaSalami(PizzaLocalVariation.HamburgSalami, StoreLocation.Hamburg);
        if(p == PizzaVariation.Calzone) return new PizzaCalzone(PizzaLocalVariation.HamburgCalzone, StoreLocation.Hamburg);
        return new PizzaHawaii(PizzaLocalVariation.HamburgHawaii, StoreLocation.Hamburg);
    }

    @Override
    public Pizza cook(PizzaVariation p, StoreLocation s) {
        if(p == PizzaVariation.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalVariation.BerlinSalami, StoreLocation.Hamburg);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalVariation.HamburgSalami, StoreLocation.Hamburg);
            return new PizzaSalami(PizzaLocalVariation.RostockSalami, StoreLocation.Hamburg);
        }
        if(p == PizzaVariation.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalVariation.BerlinHawaii, StoreLocation.Hamburg);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalVariation.HamburgHawaii, StoreLocation.Hamburg);
            return new PizzaHawaii(PizzaLocalVariation.RostockHawaii, StoreLocation.Hamburg);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalVariation.BerlinCalzone, StoreLocation.Hamburg);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalVariation.HamburgCalzone, StoreLocation.Hamburg);
        return new PizzaCalzone(PizzaLocalVariation.RostockCalzone, StoreLocation.Hamburg);
        //}
    }
}
