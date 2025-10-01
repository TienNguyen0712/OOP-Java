import java.util.Random;

public class ThucHanh2 {
    // BaiTap1
    class PHANSO {
        int tu;
        int mau;

        public PHANSO(int tu, int mau){
            this.tu = tu;
            this.mau = mau;
        }

        public PHANSO cong(PHANSO ps){
            int tu_moi = tu*ps.mau + ps.tu*mau;
            int mau_moi = mau*ps.mau;

            return new PHANSO(tu_moi, mau_moi);
        }

        public int usc(int a, int b){
            if (b == 0){
                return Math.abs(a);
            } return usc(b, a % b);
        }

        public int sosanh(PHANSO ps){
            if (tu*ps.mau > ps.tu*mau){
                return 1;
            } if (tu*ps.mau == ps.tu*mau) {
                return 0;
            } else {
                return -1;
            }
        }

        public void rutgon(){
            tu /= usc(tu, mau);
            mau /= usc(tu, mau);
        }

        @Override 
        public String toString(){
            return tu + "/" + mau;
        }
    }

    class MANG_PS {
        PHANSO[] mang;
        int n;
        public MANG_PS(int length) {
            n = length;
            mang = new PHANSO[n];
            Random r = new Random(); // Sinh số ngẫu nhiên 
            for (int i = 0; i < n; i++) {
                int t = r.nextInt(10);   // tử số
                int m = r.nextInt(10) + 1; // mẫu số khác 0
                mang[i] = new PHANSO(t, m); // Đôi tượng phân số, lúc này mới là đối tượng
            }
        }

        public int timkiem(PHANSO ps) { // tìm kiếm phân số ps trong mảng, nếu có trả về vị trí, không có trả về -1
            for (int i = 0; i < n; i++) {
                if (mang[i].sosanh(ps) == 0) // Phương thức so sánh của lớp phân số
                    return i;
            }
            return -1; // Nếu ko có trả về -1, nếu có trả về vị trí
        }

        @Override
        public String toString() { // Phương thức  cha của các lớp , to String của mảng phan số
            String temp = "";
            for (int i = 0; i < n; i++) {
                temp += mang[i].toString() + " "; // to String cảu phân số
            }
            return temp;
        }
    }

    // BaiTap2
    class DATE {
        int day;
        int month;
        int year;
        
        public DATE(int d, int m, int y){
            this.day = d;
            this.month = m;
            this.year = y;
        }

        @Override
        public String toString(){
            return String.format("%2d/%2d/%4d", day, month, year);
        }
    }

    class STUDENT {
        String name;
        DATE birthday;
        
        public STUDENT(String name, DATE b){
            this.name = name;
            this.birthday = b;
        }

        @Override
        public String toString(){
            return name + " - " + birthday;
        }
    }

    class STUDENT_ARR {
        int n;
        STUDENT[] mang;
        public STUDENT_ARR(int length){
            this.n = length;
            mang = new STUDENT[length];
        }
        
        public void setStudent(int index, STUDENT s) {
            if (index >= 0 && index < n) {
                mang[index] = s;
            }
        }
        
        @Override
        public String toString() { // Phương thức  cha của các lớp , to String của mảng phan số
            String temp = "";
            for (int i = 0; i < n; i++) {
                temp += mang[i].toString() + " "; // to String cảu phân số
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        ThucHanh2 outer = new ThucHanh2();

        // Test phân số
        PHANSO ps1 = outer.new PHANSO(2, 4);
        PHANSO ps2 = outer.new PHANSO(3, 6);
        System.out.println("ps1 = " + ps1);
        System.out.println("ps2 = " + ps2);
        System.out.println("Tổng = " + ps1.cong(ps2));

        // Test mảng phân số
        MANG_PS arr = outer.new MANG_PS(5);
        System.out.println("Mảng phân số: " + arr);

        // Test sinh viên
        DATE d = outer.new DATE(1, 1, 2000);
        STUDENT s = outer.new STUDENT("Nguyen Van A", d);
        STUDENT_ARR sArr = outer.new STUDENT_ARR(2);
        sArr.setStudent(0, s);
        sArr.setStudent(1, outer.new STUDENT("Tran Thi B", outer.new DATE(5, 5, 2001)));
        System.out.println("Danh sách sinh viên:\n" + sArr);
    }
}