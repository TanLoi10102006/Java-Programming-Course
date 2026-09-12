public enum CoffeeMenu {
    ESPRESSO("Espresso", 30000), LATTE("Latte", 40000), CAPPUCCINO("Cappuccino",
            45000), MOCHA("Mocha", 50000);

    private String ten;
    private int gia;

    // Constructor
    CoffeeMenu(String ten, int gia) {
        this.ten = ten;
        this.gia = gia;
    }

    // Getter
    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    // hiện thị thông tin sản phẩm
    public void showInfo() {
        System.out.println(ten + "|" + gia);
    }

    // tính tổng số tiền

    public int TinhTongTien(int n) {
        int Tien = n * gia;
        if (n >= 5) {
            Tien -= Tien * 0.1;
        }
        return Tien;
    }

}
