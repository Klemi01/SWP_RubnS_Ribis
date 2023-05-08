package Models;

public class StoreRostock extends Store{

    public StoreRostock(StoreLocation l) {
        super(l);
    }

    @Override
    public Pizza cook(PizzaVariation p) {
        if(p == PizzaVariation.Salami) return new PizzaSalami(PizzaLocalVariation.RostockSalami, StoreLocation.Rostock);
        if(p == PizzaVariation.Calzone) return new PizzaCalzone(PizzaLocalVariation.RostockCalzone, StoreLocation.Rostock);
        return new PizzaHawaii(PizzaLocalVariation.RostockHawaii, StoreLocation.Rostock);
    }

    @Override
    public Pizza cook(PizzaVariation p, StoreLocation s) {
        if(p == PizzaVariation.Salami){
            if(s == StoreLocation.Berlin) return new PizzaSalami(PizzaLocalVariation.BerlinSalami, StoreLocation.Rostock);
            if(s == StoreLocation.Hamburg) return new PizzaSalami(PizzaLocalVariation.HamburgSalami, StoreLocation.Rostock);
            return new PizzaSalami(PizzaLocalVariation.RostockSalami, StoreLocation.Rostock);
        }
        if(p == PizzaVariation.Hawaii){
            if(s == StoreLocation.Berlin) return new PizzaHawaii(PizzaLocalVariation.BerlinHawaii, StoreLocation.Rostock);
            if(s == StoreLocation.Hamburg) return new PizzaHawaii(PizzaLocalVariation.HamburgHawaii, StoreLocation.Rostock);
            return new PizzaHawaii(PizzaLocalVariation.RostockHawaii, StoreLocation.Rostock);
        }
        //if(p == PizzaVariation.Calzone){
        if(s == StoreLocation.Berlin) return new PizzaCalzone(PizzaLocalVariation.BerlinCalzone, StoreLocation.Rostock);
        if(s == StoreLocation.Hamburg) return new PizzaCalzone(PizzaLocalVariation.HamburgCalzone, StoreLocation.Rostock);
        return new PizzaCalzone(PizzaLocalVariation.RostockCalzone, StoreLocation.Rostock);
        //}
    }

}
