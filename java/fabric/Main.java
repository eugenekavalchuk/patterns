package fabric;

public class Main {
    public static void main(String[] args) {
        TransportFactory tf = new TransportFactoryImpl();

        Transport car = tf.createCar();
        Transport aircraft = tf.createAircraft();
        Transport cycle = tf.createCycle();

        car.move();
        aircraft.move();
        cycle.move();
    }
}