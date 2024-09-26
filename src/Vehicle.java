//Aaron Mcfail-Luttrel, John Siebenmorgen, Seth Arnold
public class Vehicle {
    private String engineType;
    private int horsePower;

    Vehicle(String engineType, int horsePower) {
        this.setEngineType(engineType);
        this.setHorsePower(horsePower);
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}