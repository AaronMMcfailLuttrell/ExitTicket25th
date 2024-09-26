//Aaron Mcfail-Luttrel, John Siebenmorgen, Seth Arnold
public class Plane extends Vehicle {
    private int passengerCapacity;

    Plane(String engineType, int horsePower, int passengerCapacity) {
        super(engineType, horsePower);
        this.setPassengerCapacity(passengerCapacity);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "A Plane with a " + this.getEngineType() +
                " engine with " + this.getHorsePower() +
                " horsepower and a passenger capacity of " +
                this.getPassengerCapacity() + " passengers";
    }
}
