package WithoutFactoryDesignPattern;

import WithoutFactoryDesignPattern.PizzaTypes.ChickenPizza;
import WithoutFactoryDesignPattern.PizzaTypes.CheesePizza;
import WithoutFactoryDesignPattern.PizzaTypes.Pizza;
import WithoutFactoryDesignPattern.PizzaTypes.VeggiePizza;
import org.junit.Test;

public class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("chicken")) {
            pizza = new ChickenPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
