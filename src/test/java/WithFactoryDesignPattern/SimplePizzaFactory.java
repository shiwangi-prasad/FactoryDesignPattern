package WithFactoryDesignPattern;

import WithFactoryDesignPattern.PizzaTypes.CheesePizza;
import WithFactoryDesignPattern.PizzaTypes.ChickenPizza;
import WithFactoryDesignPattern.PizzaTypes.Pizza;
import WithFactoryDesignPattern.PizzaTypes.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("chicken")) {
            pizza = new ChickenPizza();
        }

        return pizza;
    }
}