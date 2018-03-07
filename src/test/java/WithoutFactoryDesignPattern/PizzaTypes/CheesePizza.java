package WithoutFactoryDesignPattern.PizzaTypes;

public class CheesePizza implements Pizza
{
    public void prepare() {
        System.out.println("This is cheese pizza without factory pattern");

    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }
}
