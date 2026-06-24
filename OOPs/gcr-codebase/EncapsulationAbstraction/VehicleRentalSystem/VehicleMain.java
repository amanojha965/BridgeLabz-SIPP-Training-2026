package VehicleRentalSystem;

public class VehicleMain {
    public static void main(String[] args) {
        int days = 5;
        Car car = new Car();
        System.out.println("=== CAR DETAILS ===");
        car.setVehicleNumber(101);
        car.setDailyRate(1500);

        car.setVehicleType("Car");

        car.displayVehicleDetails();
        // System.out.println("Vehicle Number: " + car.getVehicleNumber());
        System.out.println("Rental Cost: " + car.calculateRentalCost(days));

        System.out.println("=== BIKE DETAILS ===");
        Bike bike = new Bike();
        bike.setVehicleNumber(102);
        bike.setDailyRate(500);
        bike.setVehicleType("Bike");

        bike.displayVehicleDetails();
        // System.out.println("Vehicle Number: " + bike.getVehicleNumber());
        System.out.println("Rental Cost: " + bike.calculateRentalCost(days));

        System.out.println("=== TRUCK DETAILS ===");
        Truck truck = new Truck();
        truck.setVehicleNumber(103);
        truck.setDailyRate(3000);
        truck.setLoadingCharge(500);
        truck.setVehicleType("Truck");

        truck.displayVehicleDetails();
        // System.out.println("Vehicle Number: " + truck.getVehicleNumber());
        System.out.println("Rental Cost: " + truck.calculateRentalCost(days));
    }
}