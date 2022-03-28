package package1;

public class Giaovien {
    private HocSinh.key keygiaovien; // khai báo thuộc tính key cho giáo viên

    public void SuaDiem(HocSinh a, float diem) {
        keygiaovien = a.key; // Trao quyền truy cập đến dữ liệu private của học sinh a
        keygiaovien.Suadiem(diem); // Thay đổi điểm học sinh a qua thuộc tính key
    }
}