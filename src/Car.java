//Aaron Mcfail-Luttrel, John Siebenmorgen, Seth Arnold
public class Car extends Vehicle {
    private String color;
    private boolean bigStereo;
    private boolean turbo;

    Car(String engineType, int horsePower, String color, boolean bigStereo, boolean turbo) {
        super(engineType, horsePower);
        this.setColor(color);
        this.setBigStereo(bigStereo);
        this.setTurbo(turbo);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasBigStereo() {
        return bigStereo;
    }

    public void setBigStereo(boolean bigStereo) {
        this.bigStereo = bigStereo;
    }

    public boolean hasTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "A " + this.getColor() + " car with a " +
                (this.hasTurbo() ? "turbo " : "naturally aspirated ") +
                this.getEngineType() + " engine with " +
                this.getHorsePower() + " horsepower" +
                (this.hasBigStereo() ? " containing a big stereo" : "");
    }
}
