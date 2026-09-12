public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public XeOto(String tenPhuongTien, HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Xe ô tô", hangSanXuat);
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
        return 120.0; // giả sử vận tốc của xe ô tô là 120 km/h
    }
}