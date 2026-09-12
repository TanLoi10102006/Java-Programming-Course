import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDon {
    private KhachHang khachhang;
    private MonNuoc monNuoc;
    private Size size;
    private int soLuong;
    private LocalDateTime dt;

    // Constructor có tham số
    public HoaDon(KhachHang khachhang, MonNuoc monNuoc, Size size, int soLuong, LocalDateTime dt) {
        this.khachhang = khachhang;
        this.monNuoc = monNuoc;
        this.size = size;
        this.soLuong = soLuong;
        this.dt = dt;
    }

    // Constructor không tham số
    public HoaDon() {
        this.khachhang = new KhachHang(); // tạo mặc định để tránh null
        this.monNuoc = null;
        this.size = null;
        this.soLuong = 0;
        this.dt = LocalDateTime.now();
    }

    // Getter & Setter
    public KhachHang getKhachhang() {
        return khachhang;
    }

    public MonNuoc getMonNuoc() {
        return monNuoc;
    }

    public Size getSize() {
        return size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }

    public void setMonNuoc(MonNuoc monNuoc) {
        this.monNuoc = monNuoc;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    // Tính tiền
    public int tinhTien() {
        if (monNuoc == null || size == null)
            return 0;
        int gia1Ly = monNuoc.getGia() + size.getphuThu();
        return gia1Ly * soLuong;
    }

    // Nhập dữ liệu
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        // Nhập khách hàng
        khachhang = new KhachHang();
        khachhang.nhap();

        // Chọn món nước
        System.out.println("=== MENU ===");
        MonNuoc[] ds = MonNuoc.values();
        for (int i = 0; i < ds.length; i++) {
            System.out.println((i + 1) + ". " + ds[i].getTenMon() + " - " + ds[i].getGia());
        }
        System.out.print("Mời bạn chọn món: ");
        int luaChon = sc.nextInt();
        monNuoc = ds[luaChon - 1];

        // Chọn size
        System.out.println("=== SIZE ===");
        Size[] dsSize = Size.values();
        for (int i = 0; i < dsSize.length; i++) {
            System.out.println((i + 1) + ". " + dsSize[i] + " - Phụ thu: " + dsSize[i].getphuThu());
        }
        System.out.print("Mời bạn chọn size: ");
        int chonSize = sc.nextInt();
        size = dsSize[chonSize - 1];

        // Nhập số lượng
        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();

        // Ngày giờ lập hóa đơn
        dt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Khách hàng: " + (khachhang != null ? khachhang.gettenKhachHang() : "Chưa có")
                + "\nMón nước: " + (monNuoc != null ? monNuoc.getTenMon() : "Chưa chọn")
                + "\nSize: " + (size != null ? size : "Chưa chọn") + "\nSố lượng: " + soLuong
                + "\nĐơn giá: "
                + (monNuoc != null && size != null ? (monNuoc.getGia() + size.getphuThu()) : 0)
                + "\nThành tiền: " + tinhTien() + "\nNgày lập: " + dt.format(fmt);
    }
}
