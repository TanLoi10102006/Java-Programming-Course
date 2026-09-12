public enum Size {
    S(0), M(5000), L(10000);

    private final int phuThu;

    Size(int phuThu) {
        this.phuThu = phuThu;
    }

    public int getphuThu() {
        return phuThu;
    }

}
