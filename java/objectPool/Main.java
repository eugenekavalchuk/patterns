package objectPool;

public class Main {

    public static void main(String[] args) {
        Pool<Notification> pool = new NotificationPool();

        var n1 = pool.checkOut();
        var n2 = pool.checkOut();

        n1.draw();
        n2.draw();

        pool.checkIn(n1);
        pool.checkIn(n2);
    }
}
