public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public MayBay(String tenPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Máy bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }
    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
    @Override
    public double VanToc() {
        return 800.0; // giả sử vận tốc của máy bay là 800 km/h
    }
    public void CatCanh() {
        System.out.println(tenPhuongTien + " đang cất cánh.");
    }
    public void HaCanh() {
        System.out.println(tenPhuongTien + " đang hạ cánh.");
    }
}