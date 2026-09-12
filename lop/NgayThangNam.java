package lop;
public class NgayThangNam {
    private int ngay;
    private int thang;
    private int nam;

    public NgayThangNam(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public void Ngay(){
        System.out.println("Ngày: " + ngay);
    }

    public void Thang(){
        System.out.println("Tháng: " + thang);
    }

    public void Nam(){
        System.out.println("Năm: " + nam);
    }

    public void hienThi() {
        System.out.println(ngay + "/" + thang + "/" + nam);
    }
}