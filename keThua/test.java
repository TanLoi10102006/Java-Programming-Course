public class test {
    public static void main(String[] args) {
        ConNguoi cn = new ConNguoi();
        cn.Nhap();
        System.out.println(cn);
        cn.an();
        cn.ngu();
        cn.Uong();
        HocSinh hs = new HocSinh();
        hs.Nhap();
        System.out.println(hs);
        hs.LamBaiTap();        
        hs.an();
        hs.ngu();
        hs.Uong();
    }
}