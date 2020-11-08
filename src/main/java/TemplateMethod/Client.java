package TemplateMethod;

/**
 * https://victorydntmd.tistory.com/298?category=719467
 */
public class Client {
    public static void main(String args[]) {
        ChildA childA = new ChildA();
        childA.someMethod();

        System.out.println("-------------------------");

        ChildB childB = new ChildB();
        childB.someMethod();
    }
}
