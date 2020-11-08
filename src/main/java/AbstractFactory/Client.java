package AbstractFactory;

/**
 * https://victorydntmd.tistory.com/300
 */
public class Client {
    public static void main(String args[]) {
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("LG");

        factoryOfComputerFactory.createComputer("Samsung");
    }
}
