import java.util.Scanner; 
public class HoaDonCaPhe {
  public  String tenLoaiCaPhe;
  public  double giaTien1Kg;
  public  double KhoiLuong;

  // Constructor có tham số
    public HoaDonCaPhe(String tenLoaiCaPhe, double giaTien1Kg, double KhoiLuong) {
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1Kg = giaTien1Kg;
        this.KhoiLuong = KhoiLuong;
    }
    // Constructor mặc định
    public HoaDonCaPhe() {
    }
    public double tinhTongTien() {
        return giaTien1Kg * KhoiLuong;
    }

    // Phương thức để in hóa đơn
    public void inHoaDon() {
        System.out.println("Hóa đơn cà phê:");
        System.out.println("Tên loại cà phê: " + tenLoaiCaPhe);
        System.out.println("Giá tiền 1 kg: " + giaTien1Kg);
        System.out.println("Khối lượng: " + KhoiLuong);
      //  System.out.println("Tổng tiền: " + tinhTongTien());
    }
    // Phương thức để nhập thông tin hóa đơn
    public void Nhap(){
            Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Nhập tên loại cà phê: ");
            tenLoaiCaPhe = sc.nextLine();
            System.out.print("Nhập giá tiền 1 kg: ");
            giaTien1Kg = sc.nextDouble();
            System.out.print("Nhập khối lượng: ");
            KhoiLuong = sc.nextDouble();
    }
    public boolean KiemTraKhoiLuong(double kl){
        return KhoiLuong > kl;
    }
    public boolean KiemTraTongTien(){
        return tinhTongTien() > 500000;
    }

    // phương thức giảm giá theo phần trăm
    public double giamGia(double phanTramGiam){
        
       return tinhTongTien() * (1 - phanTramGiam / 100);
        
       
    }
} 