import PizzaTypes.Pizza;
import org.junit.Test;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore()
    {
        this.factory = new SimplePizzaFactory();
    }

    @Test
    public void OrderPizza()
    {
        Pizza pizza = null;
        pizza = factory.createPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
