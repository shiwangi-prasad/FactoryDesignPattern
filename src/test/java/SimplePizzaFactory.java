import PizzaTypes.CheesePizza;
import PizzaTypes.ChickenPizza;
import PizzaTypes.Pizza;
import PizzaTypes.VeggiePizza;

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