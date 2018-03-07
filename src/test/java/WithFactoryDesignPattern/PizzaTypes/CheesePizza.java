package WithFactoryDesignPattern.PizzaTypes;

public class CheesePizza implements Pizza
{
    public void prepare()
    {
        System.out.println("Cheese pizza is being prepared");
    }

    public void bake()
    {
        System.out.println("Cheese pizza is being baked");
    }

    public void cut()
    {
        System.out.println("Cheese pizza is being cut");
    }

    public void box()
    {
        System.out.println("Cheese pizza is being boxed");
    }

}
