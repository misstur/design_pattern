package State;

public class Off implements PowerState {
    public void powerPush() {
        System.out.println("절전 모드");
    }
}
