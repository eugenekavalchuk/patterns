package fabric;

public class TransportFactoryImpl implements TransportFactory{
    @Override
    public Transport createCar() {
        return new Car();
    }

    @Override
    public Transport createAircraft() {
        return new Aircraft();
    }

    @Override
    public Transport createCycle() {
        return new Cycle();
    }
}
