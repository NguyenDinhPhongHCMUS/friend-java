package package1;

public class HocSinh {
    private float DiemBaiKiemTra = 5;

    public class key { // class key
        private key() {
        }; // Hàm khởi tạo key để private vì sẽ chỉ có class HocSinh tạo được key.
           // Điều này có nghĩa là chỉ HocSinh mới có quyền cho phép một ai đó có key để
           // truy cập vào dữ liệu private của mình

        public void Suadiem(float x) // Phương thức này dùng để sửa điểm bài kiểm tra qua class key
        {
            DiemBaiKiemTra = x;
        }
    }

    public key key = new key(); // Khai báo thuộc tính key của HocSinh

    public float KhoeDiem() // Show điểm
    {
        return DiemBaiKiemTra;
    }
}