public class test{
    public static void main(String[] args) {
        HangSanXuat honda = new HangSanXuat("Honda", "Nhật Bản");
        XeOto oto = new XeOto("Xe ô tô", honda, "Xăng");
        System.out.println("Tên phương tiện: " + oto.getTenPhuongTien());
        System.out.println("Hãng sản xuất: " + oto.getHangSanXuat().getTenHang()); 
        System.out.println("Quốc gia: " + oto.getHangSanXuat().getQuocGia());
        System.out.println("Loại nhiên liệu: " + oto.getLoaiNhienLieu());
        System.out.println("Vận tốc: " + oto.VanToc() + " km/h");
        oto.BatDau();
        oto.DiChuyen();
        oto.DungLai();
        MayBay mayBay = new MayBay("Máy bay", honda, "Dầu");
        System.out.println("\nTên phương tiện: " + mayBay.getTenPhuongTien());
        System.out.println("Hãng sản xuất: " + mayBay.getHangSanXuat().getTenHang());
        System.out.println("Quốc gia: " + mayBay.getHangSanXuat().getQuocGia());
        System.out.println("Loại nhiên liệu: " + mayBay.getLoaiNhienLieu());
        System.out.println("Vận tốc: " + mayBay.VanToc() + " km/h");
        mayBay.BatDau();
        mayBay.CatCanh();
        mayBay.HaCanh();
        mayBay.DungLai();
        XeDap xeDap = new XeDap("Xe đạp", honda);
        System.out.println("\nTên phương tiện: " + xeDap.getTenPhuongTien());
        System.out.println("Hãng sản xuất: " + xeDap.getHangSanXuat().getTenHang());
        System.out.println("Quốc gia: " + xeDap.getHangSanXuat().getQuocGia());
        System.out.println("Vận tốc: " + xeDap.VanToc() + " km/h");
        xeDap.BatDau();
    }
}