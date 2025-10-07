public class ThucHanhKeThua {
    class POINT {
        private int x; 
        private int y; 

        public POINT(){
            this.x = 0;
            this.y = 0;
        }

        public POINT(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }

        public int getY(){
            return y;
        }

        public void setX(int x){
            this.x = x;
        }

        public void setY(int y){
            this.y = y;
        }

        public double distance(POINT p){
            return Math.sqrt((p.x - x)*(p.x - x) + (p.y - y)*(p.y - y));
        }

        @Override
        public String toString(){
            return "Point( " + x + "; " + y + " )";
        }
    }

    class LINE {
        private POINT a;
        private POINT b;


        public LINE(POINT a, POINT b){
            this.a = a;
            this.b = b;
        }

        public POINT getA(){
            return a;
        }

        public void setA(POINT a){
            this.a = a;
        }

        public POINT getB(){
            return b;
        }

        public void setB(POINT b){
            this.b = b;
        }

        public double distance(){
            double dx = b.getX() - a.getX();
            double dy = b.getY() - a.getY();
            return Math.sqrt(dx * dx + dy * dy);
        }

        public double interceot(){
            return (b.getY() - a.getY()) / (b.getX()- a.getX());
        }

        @Override
        public String toString() {
            return "LINE[A=" + a + ", B=" + b + "]";
        }
    }

    class CIRCLE {
        protected POINT center;
        private int r;

        public CIRCLE(POINT p, int r){
            this.center = p;
            this.r = r;
        }

        public POINT getCenter(){
            return center;
        }

        public void setCenter(POINT p){
            this.center = p;
        }

        public int getR(){
            return r;
        }

        public void setR(int r){
            this.r = r;
        }

        public double getArea(){
            return Math.PI * r * r;
        }

        @Override
        public String toString(){
            return "Circle( Center=( " + center.x + "; " + center.y + " ) Radius = " + r + ")";  
        }
    }

    class CYLINDERCON extends CIRCLE {
        private int height;

        public CYLINDERCON(POINT p, int r, int height){
            super(p, r);
            this.height = height;
        } 

        public int getHeight(){
            return height;
        }

        public void setHeight(int height){
            this.height = height;
        }

        public double getArea(){
            return 2 * Math.PI * getR() * (getR() + height);
        }

        public double getVolume(){
            return Math.PI * getR() * getR() * height;
        }

        @Override
        public String toString(){
            return "Cylinder(Center=" + center + ", Radius=" + getR() +
                   ", Height=" + height + ")";
        }
    }

    public static void main(String[] args) {
        ThucHanhKeThua outer = new ThucHanhKeThua(); // cần outer để tạo inner class

        // Test POINT
        POINT p1 = outer.new POINT(1, 2);
        POINT p2 = outer.new POINT(4, 6);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("Khoảng cách giữa p1 và p2 = " + p1.distance(p2));

        // Test LINE
        LINE line = outer.new LINE(p1, p2);
        System.out.println("\n" + line);
        System.out.println("Độ dài đoạn thẳng: " + line.distance());

        // Test CIRCLE
        CIRCLE c = outer.new CIRCLE(p1, 5);
        System.out.println("\n" + c);
        System.out.println("Diện tích hình tròn: " + c.getArea());

        // Test CYLINDERCON
        CYLINDERCON cyl = outer.new CYLINDERCON(p1, 5, 10);
        System.out.println("\n" + cyl);
        System.out.println("Diện tích hình trụ: " + cyl.getArea());
        System.out.println("Thể tích hình trụ: " + cyl.getVolume());
    }
}
