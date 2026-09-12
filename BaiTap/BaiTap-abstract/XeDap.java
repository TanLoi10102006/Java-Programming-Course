public class XeDap extends PhuongTienDiChuyen{
    public XeDap(String tenPhuongTien, HangSanXuat hangSanXuat) {
        super("Xe đạp", hangSanXuat);
      
    }
    @Override
    public double VanToc() {
        return 20.0; // giả sử vận tốc của xe đạp là 20 km/h
    }


}