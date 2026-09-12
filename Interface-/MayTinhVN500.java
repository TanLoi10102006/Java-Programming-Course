public class MayTinhVN500 implements MayTinhBoTui {

    @Override
    public double tinhTong(double a, double b) {
        return a + b;
    }

    @Override
    public double tinhHieu(double a, double b) {
        return a - b;
    }

    @Override
    public double tinhTich(double a, double b) {
        return a * b;
    }

    @Override
    public double tinhThuong(double a, double b) {
        if (b == 0) {
            System.out.println("Không thể chia cho 0");
            return 0;
        }
        return a / b;
    }
}