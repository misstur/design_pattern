package Decorator;

public class PickleDecorator extends ToppingDecorator {
    public PickleDecorator(Sandwich sandwich) {
        super(sandwich);
    }

    public void make() {
        super.make();
        addLettuce();
    }

    private void addLettuce() {
        System.out.println(" + 피클");
    }
}
