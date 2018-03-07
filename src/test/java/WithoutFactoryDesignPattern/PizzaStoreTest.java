package WithoutFactoryDesignPattern;

import org.junit.Test;

public class PizzaStoreTest {

    @Test
    public void orderAPizza(){
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
