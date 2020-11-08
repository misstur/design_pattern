package FactoryMethod;

/**
 * https://victorydntmd.tistory.com/300
 */
public class Client {
    public static void main(String args[]) {
        ComputerFactory computerFactory = new ComputerFactory();
        computerFactory.createComputer("LG");

        computerFactory.createComputer("Samsung");
    }
}
