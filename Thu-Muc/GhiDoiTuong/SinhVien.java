
import java.io.Serializable;

public class SinhVien implements Serializable {
    private String HoTen;
    private int id;
    private double DiemSo;

    public SinhVien(String HoTen, int id, double DiemSo) {
        this.HoTen = HoTen;
        this.id = id;
        this.DiemSo = DiemSo;

    }

    public String getHoTen() {
        return HoTen;
    }

    public int getid() {
        return id;
    }

    public double getDiemSo() {
        return DiemSo;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setDiemSo(double DiemSo) {
        this.DiemSo = DiemSo;
    }

    @Override
    public String toString() {
        return "ho va ten: " + HoTen + " id: " + id + " DiemSo: " + DiemSo;
    }


}
