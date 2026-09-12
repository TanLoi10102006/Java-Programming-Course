import java.util.Scanner;
public class TenHoaDon {
    public static void main(String[] args) {
       HoaDonCaPhe hoaDon = new HoaDonCaPhe();
        hoaDon.Nhap();
        hoaDon.inHoaDon();
      //  System.out.println("Tổng giá tiền của "+hoaDon.KhoiLuong + hoaDon.tinhTongTien());
        System.out.print("Nhập khối lượng để kiểm tra: ");
        Scanner sc = new Scanner(System.in);
        double kl = sc.nextDouble();

        // kiểm tra khối lượng
        if(hoaDon.KiemTraKhoiLuong(kl)){
            System.out.println("Khối lượng bạn nhập lớn hơn  " + kl);
        } else {
            System.out.println("Khối lượng của bạn nhập nhỏ hơn  " + kl);
        }

        // kiểm tra tổng tiền
        if(hoaDon.KiemTraTongTien()){
            System.out.println("Tổng tiền của bạn lớn hơn 500000");
            System.out.println("Tổng tiền của bạn lớn hơn là: "+(hoaDon.tinhTongTien()-500000));
        } else {
            System.out.println("Tổng tiền của bạn nhỏ hơn 500000");
            System.out.println("Tổng tiền của bạn nhỏ hơn là: "+(500000-hoaDon.tinhTongTien()));
        }

        // giảm giá
        if (hoaDon.tinhTongTien() > 500000) {
            System.out.print("Nhập phần trăm giảm giá: ");
            double phanTramGiam = sc.nextDouble();
            double tongTienSauGiam = hoaDon.giamGia(phanTramGiam);
            System.out.println("Tổng tiền sau khi giảm giá: " + tongTienSauGiam);
        } else {
            System.out.println("Không đủ điều kiện để giảm giá.");
            System.out.println("Tổng tiền của bạn là: " + hoaDon.tinhTongTien());
        }
    }
}