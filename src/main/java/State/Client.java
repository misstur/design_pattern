package State;

/**
 * https://victorydntmd.tistory.com/294?category=719467
 */
public class Client {
    public static void main(String args[]) {
        Laptop laptop = new Laptop();
        On on = new On();
        Off off = new Off();
        Saving saving = new Saving();

        laptop.powerPush();
        laptop.setPowerState(on);
        laptop.powerPush();
        laptop.setPowerState(saving);
        laptop.powerPush();
        laptop.setPowerState(off);
        laptop.powerPush();
        laptop.setPowerState(on);
        laptop.powerPush();
    }
}
