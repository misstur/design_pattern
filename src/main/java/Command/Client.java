package Command;

/**
 * https://victorydntmd.tistory.com/295?category=719467
 */
public class Client {
    public static void main(String args[]) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();

        Command heaterOnCommand = new HeaterOnCommand(heater);
        Command lampOnCommand = new LampOnCommand(lamp);
        OKGoogle okGoogle = new OKGoogle();

        // 램프 켠다
        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();

        // 히터 켠다
        okGoogle.setCommand(heaterOnCommand);
        okGoogle.talk();
    }
}
