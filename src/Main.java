//Aaron Mcfail-Luttrel, John Siebenmorgen, Seth Arnold

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Vehicle("v6", 105);
        vehicles[1] = new Car("inline 4 cylinder", 170,
                "white", true, true);
        vehicles[2] = new Truck("Big Block v8", 225, 0.5);
        vehicles[3] = new Plane("Big turbine", 1005, 700);
        vehicles[4] = new Car("Inline 4 cylinder", 110,
                "blue", false, false);
        vehicles[5] = new Car("Flat 4 cylinder", 180,
                "red", true, false);

        for (Vehicle v : vehicles) {
            System.out.printf("%s\n", v.toString());
        }
    }
}