public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, String model, int year, boolean hasCarrier) {
        super(brand, model, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void start() {
        System.out.println("xe "+brand+" "+model+" đang chạy.");
    }

    @Override
    public void stop() {
        System.out.println("xe "+brand+" "+model+" đang dừng lại.");
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("có giá chở hàng: " + (hasCarrier ? "có" : "không"));
    }
}