package WithoutFactoryDesignPattern.PizzaTypes;

public class ChickenPizza implements Pizza {
    public void prepare() {
        System.out.println("This is chicken pizza without factory pattern");
    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }
}
