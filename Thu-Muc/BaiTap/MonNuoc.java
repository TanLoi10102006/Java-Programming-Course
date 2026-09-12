public enum MonNuoc {

    CAPHE_SUA("Ca phe sua", 25000), BAC_XIU("Bac xiu", 30000), TRA_DAO("Tra dao",
            35000), MATCHA_LATTE("Matcha Latte", 45000), HONG_TRA("Hong tra", 28000);

    private final String tenMon;
    private final int gia;

    MonNuoc(String tenMon, int gia) {
        this.tenMon = tenMon;
        this.gia = gia;
    }

    public String getTenMon() {
        return tenMon;
    }

    public int getGia() {
        return gia;
    }
}
