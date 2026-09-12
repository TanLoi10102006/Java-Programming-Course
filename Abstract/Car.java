public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("xe "+brand+" "+model+" đang chạy với "+numberOfDoors+" cửa.");
    }

    @Override
    public void stop() {
        System.out.println("xe "+brand+" "+model+" đang dừng lại.");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("số cửa của xe  " + numberOfDoors);
    }
}