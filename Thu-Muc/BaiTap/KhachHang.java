import java.util.Scanner;

public class KhachHang {
    private int maKhachHang;
    private String tenKhachHang;
    private String sdt;

    public KhachHang(int maKhachHang, String tenKhachHang, String sdt) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.sdt = sdt;
    }

    public KhachHang() {
        this.maKhachHang = 0;
        this.tenKhachHang = "";
        this.sdt = "";
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public String gettenKhachHang() {
        return tenKhachHang;
    }

    public String getsdt() {
        return sdt;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập mã khách hàng: ");
        maKhachHang = sc.nextInt();
        sc.nextLine(); // bỏ ký tự xuống dòng còn lại

        System.out.print("Mời bạn nhập tên: ");
        tenKhachHang = sc.nextLine();

        System.out.print("Mời bạn nhập số điện thoại: ");
        sdt = sc.nextLine();
    }
}
