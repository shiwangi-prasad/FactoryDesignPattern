import PizzaTypes.Pizza;
import org.junit.Test;

public class PizzaStore {

//    SimplePizzaFactory factory;
//
//    public PizzaStore(SimplePizzaFactory factory)
//    {
//        this.factory = factory;
//    }

    @Test
    public void OrderPizza()
    {
        Pizza pizza = null;
        SimplePizzaFactory factory = new SimplePizzaFactory();
        pizza = factory.createPizza("veggie");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
