public class BaiTapKeThua {

    class CIRCLE {
        protected double radius;
        private String color;

        public CIRCLE() {
            this.radius = 1.0;
            this.color = "red";
        }

        public CIRCLE(double radius) {
            this.radius = radius;
            this.color = "red";
        }

        public CIRCLE(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Circle(radius= " + radius + ", color= " + color + ")";
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }
    }

    class CYLINDER extends CIRCLE {
        private double height;

        public CYLINDER() {
            super();
            this.height = 1.0;
        }

        public CYLINDER(double height, double radius) {
            super(radius);
            this.height = height;
        }

        public CYLINDER(double height, double radius, String color) {
            super(radius, color);
            this.height = height;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getVolume() {
            return getArea() * height;
        }

        @Override
        public String toString() {
            return "Cylinder(height=" + height + ", radius=" + radius + ", color=" + getColor() + ")";
        }
    }

    public static void main(String[] args) {
        BaiTapKeThua outer = new BaiTapKeThua();
        CYLINDER c = outer.new CYLINDER(5.0, 2.0, "blue");

        System.out.println(c.toString());
        System.out.println("Area = " + c.getArea());
        System.out.println("Volume = " + c.getVolume());
    }
}
