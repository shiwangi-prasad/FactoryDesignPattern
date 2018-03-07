package WithoutFactoryDesignPattern.PizzaTypes;

public class VeggiePizza implements Pizza {
    public void prepare() {
        System.out.println("This is veggie pizza without factory pattern");
    }

    public void bake() {

    }

    public void cut() {

    }

    public void box() {

    }
}
