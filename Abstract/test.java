

public class test {
    public static void main(String[] args) {
     //   Vehicle car=new Vehicle(); // Lỗi: không thể khởi tạo đối tượng của lớp trừu tượng
        Vehicle car = new Car("Toyota", "Camry", 2020, 4);
        Vehicle bike = new Bike("Yamaha", "MT-07", 2021, true);

        System.out.println("Thông tin xe hơi:");
        car.displayInfo();
        car.start();
        car.stop();

        System.out.println("\nThông tin xe máy:");
        bike.displayInfo();
        bike.start();
        bike.stop();
    }
        
}
