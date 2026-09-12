public enum Thang {
    Thang1(31), Thang2(28), // or 29 for leap years
    Thang3(31), Thang4(30), Thang5(31), Thang6(30), Thang7(31), Thang8(31), Thang9(30), Thang10(
            31), Thang11(30), Thang12(31);

    private final int days;

    // Constructor
    Thang(int days) {
        this.days = days;
    }

    // Getter
    public int Days() {
        return days;
    }
}
