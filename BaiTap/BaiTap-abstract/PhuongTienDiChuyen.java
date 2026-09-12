public abstract class PhuongTienDiChuyen {
    protected String tenPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenPhuongTien, HangSanXuat hangSanXuat) {
        this.tenPhuongTien = tenPhuongTien;
        this.hangSanXuat = hangSanXuat; // thêm dòng này
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void BatDau() {
        System.out.println(tenPhuongTien + " bắt đầu di chuyển.");
    }
    public void DungLai() {
        System.out.println(tenPhuongTien + " dừng lại.");
    }
    public void DiChuyen() {
        System.out.println(tenPhuongTien + " đang di chuyển.");
    }
    public abstract double VanToc();
}