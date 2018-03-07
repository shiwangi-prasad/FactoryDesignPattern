package PizzaTypes;

public class ChickenPizza implements Pizza {
    public void prepare()
    {
        System.out.println("Chicken pizza is being prepared");
    }

    public void bake()
    {
        System.out.println("Chicken pizza is being baked");
    }

    public void cut()
    {
        System.out.println("Chicken pizza is being cut");
    }

    public void box()
    {
        System.out.println("Chicken pizza is being boxed");
    }
}
