package WithFactoryDesignPattern.PizzaTypes;

import WithFactoryDesignPattern.PizzaTypes.Pizza;

public class VeggiePizza implements Pizza {
    public void prepare()
    {
        System.out.println("Veggie pizza is being prepared");
    }

    public void bake()
    {
        System.out.println("Veggie pizza is being baked");
    }

    public void cut()
    {
        System.out.println("Veggie pizza is being cut");
    }

    public void box()
    {
        System.out.println("Veggie pizza is being boxed");
    }
}
