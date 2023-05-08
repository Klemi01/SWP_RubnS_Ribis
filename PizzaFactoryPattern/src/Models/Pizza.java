package Models;

public abstract class Pizza {

    protected PizzaLocalVariation _type;
    protected StoreLocation _storeWhereCooked;

    public PizzaLocalVariation getPizza(){
        return this._type;
    }

    public StoreLocation getStore(){
        return this._storeWhereCooked;
    }

    public Pizza(PizzaLocalVariation t, StoreLocation s){
        this._type = t;
        this._storeWhereCooked = s;
    }

    @Override
    public String toString(){
        return "type=" + this._type + ", location where cooked=" + this._storeWhereCooked;
    }

}
