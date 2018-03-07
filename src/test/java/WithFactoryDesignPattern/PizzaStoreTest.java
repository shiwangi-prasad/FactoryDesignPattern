package WithFactoryDesignPattern;

import org.junit.Test;

public class PizzaStoreTest {

    @Test
    public void ShouldOrderACheesePizza()
    {
        PizzaStore dominos = new PizzaStore();
        dominos.OrderPizza("cheese");
    }
}
