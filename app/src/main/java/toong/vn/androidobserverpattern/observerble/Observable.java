package toong.vn.androidobserverpattern.observerble;

import toong.vn.androidobserverpattern.observer.Observer;

public interface Observable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers(); // phương thức này được gọi để thông báo cho tất cả các observer một khi trạng thái của Observable được thay đổi.
}