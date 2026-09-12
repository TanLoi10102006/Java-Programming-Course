public class SinhVien {
    private int id;
    private String name;

    public SinhVien(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getid() {
        return id;

    }

    public void setid() {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id " + id + "name " + name;
    }

}
