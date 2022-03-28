package package1;

public class main {
    public static void main(String[] args) {
        Giaovien a = new Giaovien();
        HocSinh b = new HocSinh();
        HocSinh c = new HocSinh();
        a.SuaDiem(b, 10);
        a.SuaDiem(c, 6);
        System.out.println(b.KhoeDiem());
        System.out.println(c.KhoeDiem());
    }
}