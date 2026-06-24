package VehicleRentalSystem;

public abstract class Vehicle {
    private double vehicleNumber;
    private String vehicleType;

    public double getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(double vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    abstract double calculateRentalCost(int days);

    public void displayVehicleDetails() {

        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle_Type: " + vehicleType);
    }

}
