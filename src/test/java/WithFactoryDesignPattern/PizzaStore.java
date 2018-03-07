package WithFactoryDesignPattern;

import WithFactoryDesignPattern.PizzaTypes.Pizza;
import org.junit.Test;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore()
    {
        this.factory = new SimplePizzaFactory();
    }

    public void OrderPizza(String type)
    {
        Pizza pizza = null;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
