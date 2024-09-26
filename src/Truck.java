//Aaron Mcfail-Luttrel, John Siebenmorgen, Seth Arnold
public class Truck extends Vehicle {
    private double towingCapacity;

    Truck(String engineType, int horsePower, double towingCapacity) {
        super(engineType, horsePower);
        this.setTowingCapacity(towingCapacity);
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public String toString() {
        return "A Truck with a " + this.getEngineType() +
                " engine with " + this.getHorsePower() +
                " horsepower and a towing capacity of " +
                this.getTowingCapacity() + " tons";
    }
}
