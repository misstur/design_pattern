package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();

    // 옵저버에 추가
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    // 옵저버에서 제거
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    // 옵저버들에게 알림
    public void notifyObservers(String msg) {
        for (Observer o:observerList) {
            o.receive(msg);
        }
    }
}
