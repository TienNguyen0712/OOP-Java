public class Chuong1 {
    // Hình tròn
    public static class Circle {
        private double radius;
        private String color;

        public Circle(double radius, String color) {
            // Khai báo thuộc tính
            this.radius = radius;
            this.color = color;
        }

        @Override
        // Hiển thị mặc định
        public String toString(){
            return "Hình tròn R = " + radius + ", Color = " + color;
        }

        // Xuất ra màn hình bán kính
        public double getRadius(){
            return radius;
        }

        // Xuất ra màn hình diện tích 
        public double getArea(){
            return Math.PI * radius * radius;
        }

        // Đặt lại màu
        public void setColor(String color){
            this.color = color;
        }

        // Đặt lại bán kính
        public void setRadius(double radius){
            this.radius = radius;
        }
    }

    // Lớp PHANSO
    public static class PHANSO {
        private int tu;
        private int mau;

        public PHANSO(int tu, int mau){
            this.tu = tu;
            this.mau = mau;
        }

        @Override
        public String toString(){
            return tu + "/" + mau;
        }

        public String add(PHANSO s1){
            int tu_sum = tu*s1.mau + mau*s1.tu;
            int mau_sum = mau*s1.mau; 
            return tu_sum + "/" + mau_sum;
        }
    }

    // Lớp Circle2
    public static class Circle2 {
        private double x;
        private double y;

        public Circle2(double x, double y){
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString(){
            return "Đường tròn ( x = " + x + ", y = " + y + " )"; 
        } 

        public int compare(Circle2 c1){
            if (Math.sqrt((c1.x - x)*(c1.y - y)) + ((c1.y - y)*(c1.y - y)) == 0){
                return 1;
            } else if(Math.sqrt((c1.x - x)*(c1.y - y)) + ((c1.y - y)*(c1.y - y)) == 0){
                return 0;
            }
            return -1;
        }
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(12, "red");
        Circle2 c2 = new Circle2(1, 2);
        Circle2 c3 = new Circle2(3, 4);
        PHANSO s1 = new PHANSO(1, 2);
        PHANSO s2 = new PHANSO(2, 3);

        // Thay đổi màu
        c1.setColor("green");
        System.out.println("Tổng của hai phân số: " + s1.add(s2)); // Cộng phân số 
        System.out.println("Phân số " + s1); // Xuất phân số
        System.out.println(c2); // Xuất điểm tâm đường tròn
        System.out.println(c2.compare(c3)); // So sánh khoảng cách
        System.out.println(c1); // Xuất bán kính và màu của đường tròn
        System.out.println("Diện tích là: " + c1.getArea()); // Lấy diện tích
    }
}
