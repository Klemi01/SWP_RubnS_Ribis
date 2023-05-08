import Models.*;

public class Main {

    public static void main(String[] args) {

        Store store = StoreFactory.newLocation(StoreLocation.Berlin);

        Pizza normalPizza = store.cook(PizzaVariation.Calzone);
        Pizza overloadPizza = store.cook(PizzaVariation.Calzone, StoreLocation.Rostock);

        System.out.println("normal method: " + normalPizza.toString());
        System.out.println("overloaded method: " + overloadPizza.toString());

    }

}
