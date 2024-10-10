package objectPool;

public class NotificationPool extends Pool<Notification> {
    @Override
    protected Notification create() {
        return new Notification();
    }
}
