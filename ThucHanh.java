public class ThucHanh {
    // BaiTap1 
    static class CIRCLE {
        private double radius = 1;
        private String color = "red";

        // CIRCLE 1
        CIRCLE(double radius){
            this.radius = radius;
        }

        // CIRCLE 2
        CIRCLE(double radius, String color){
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor(){
            return color;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public void setColor(String color){
            this.color = color;
        }

        public double getArea(){
            return radius * radius * Math.PI;
        }

        @Override
        public String toString(){
            return "Circle[radius=" + radius + ", color="  + color + "]";
        }
    }

    // BaiTap2
    static class CIRCLE1 {
        private double radius = 1;

        CIRCLE1(double radius){
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public double getArea(){
            return radius * radius * Math.PI;
        }

        public double getCircumference(){
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString(){
            return "Circle[radius= " + radius + "]"; 
        }
    }

    // BaiTap3
    static class RECTANGLE {
        private float length = 1.0f;
        private float width = 1.0f;

        RECTANGLE(float length, float width){
            this.length = length;
            this.width = width;
        }

        public float getLength(){
            return length;
        }

        public void setLength(float len){
            this.length = len;
        }

        public float getWidth(){
            return width;
        }

        public void setWidth(float wid){
            this.width = wid;
        }
        
        public double getArea(){
            return width * length;
        }

        public double getPerimeter(){
            return (width + length) * 2;
        }

        @Override
        public String toString(){
            return "Rectangle[length= " + length + ", width=" + width + "]";
        }
    }

    // BaiTap4
    static class EMPLOYEE {
        private int id;
        private String firstName;
        private String lastName;
        private int salary;


        EMPLOYEE(int id, String fName, String lName, int salary){
            this.id = id;
            this.firstName = fName;
            this.lastName = lName;
            this.salary = salary;
        }

        public int getID(){
            return id;
        }

        public String getfirstName(){
            return firstName;
        }

        public String getlastName(){
            return lastName;
        }

        public String getName(){
            return firstName + " " + lastName;
        }

        public int getSalary(){
            return salary;
        }

        public void setSalary(int salary){
            this.salary = salary;
        }

        public int getAnnualSalary(){
            return salary * 12;
        }

        public int raiseSalary(int percent){
            return salary += salary  * percent/100; 
        }

        @Override
        public String toString(){
            return "Employee[id= " + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
        }
    }

    // BaiTap5
    static class INVOICEITEM {
        private String id;
        private String desc;
        private int qty;
        private double unitPrice;

        INVOICEITEM(String id, String desc, int qty, double unitprice){
            this.id = id;
            this.desc = desc;
            this.qty = qty;
            this.unitPrice = unitprice;
        }

        public String getID(){
            return id;
        }

        public String getDesc(){
            return desc;
        }

        public int getQty(){
            return qty;
        }

        public void setQty(int qty){
            this.qty = qty;
        }

        public double getUnitPrice(){
            return unitPrice;
        }

        public void setUnitPrice(double unit){
            this.unitPrice = unit;
        }

        public double getTotal(){
            return unitPrice * qty; 
        }

        @Override
        public String toString(){
            return "InvoiceItem[id= " + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice= " + unitPrice + "]";
        }
    }

    // BaiTap6
    static class ACCOUNT {
        private String id;
        private String name;
        private int balance = 0;

        ACCOUNT(String id, String name){
            this.id = id;
            this.name = name;

        }

        
        ACCOUNT(String id, String name, int balance){
            this.id = id;
            this.name = name;
            this.balance = balance;

        }

        public String getID(){
            return id;
        }

        public String getName(){
            return name;
        }

        public int getBalance(){
            return balance;
        }

        public int credit(int amount){
            return balance += amount;
        }

        public int debit(int amount){
            if (amount <= balance){
                balance -= amount;
            } else {
                System.out.println("amount exceeded");
            }

            return balance;
        }

        public int transferTo(ACCOUNT temp, int amount){
            if (amount <= balance){
                temp.balance += amount;
                balance -= amount;
            } else {

            }
            return balance;
        }

        @Override
        public String toString(){
            return "Account[id= " + id + ", name=" + name + ", balance=" + balance + "]";
        }
    }

    // BaiTap7
    static class DATE {
        private int day;
        private int month;
        private int year;

        DATE(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay(){
            return day;
        }

        public int getMonth(){
            return month;
        }

        public int getYear(){
            return year;
        }

        public void setDay(int day){
            this.day = day;
        }
        
        public void setMonth(int month){
            this.month = month;
        }
        
        public void setYear(int year){
            this.year = year;
        }

        public void setDate(int day, int month, int year){
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public String toString() {
            return String.format("%02d/%02d/%04d", day, month, year);
        }
    }
    // BaiTap8
    static class TIME {
        private int hour;
        private int minute;
        private int second;

        TIME(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public int getHour(){
            return hour;
        }

        public int getMinute(){
            return minute;
        }
        
        public int getSecond(){
            return second;
        }

        public void setHour(int hour){
            this.hour = hour;
        }
        
        public void setMinute(int minute){
            this.minute = minute;
        }

        public void setSecond(int second){
            this.second = second;
        }

        public void setTime(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

        public TIME nextSecond(){
            if (second < 59){
                second += 1;
            } else {
                if (minute < 59){
                    minute += 1;   
                    second = 0;
                } else {
                    hour += 1;
                    minute = 0;
                    second = 0;
                }
            }
            return this;
        }

        public TIME previousSecond(){
            if (second == 0){
                second = 59;
                minute -= 1;
            } else {
                if (minute < 23){
                    minute -= 1;   
                    second = 0;
                } else {
                    hour -= 1;
                    minute = 0;
                    second = 0;
                }
            }
            return this;
        }

        @Override 
        public String toString(){
            return String.format("%2d:%2d:%2d", hour, minute, second);
        }
    }

    // BaiTap9
    static class BALL {
        private float x;
        private float y;
        private int radius;
        private float xDelta;
        private float yDelta;

        BALL(float x, float y, int radius, int xDelta, int yDelta){
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.xDelta = xDelta;
            this.yDelta = yDelta;
        }

        public float getX(){
            return x;
        }

        public void setX(float x){
            this.x = x;
        }

        public float getY(){
            return y;
        }

        public void setY(float y){
            this.y = y;
        }

        public int getRadius(){
            return radius;
        }

        public void setRadius(int radius){
            this.radius = radius;
        }

        public float getXDelta(){
            return xDelta;
        }

        public void setXDelta(float xDelta){
            this.xDelta = xDelta;
        }

            
        public float getYDelta(){
            return yDelta;
        }

        public void setYDelta(float yDelta){
            this.yDelta = yDelta;
        }

        public void move(){
            x += xDelta;
            y += yDelta;
        }

        public void reflectHorizontal(){
            xDelta = -xDelta;
        }

        public void reflectVertical(){
            yDelta = -yDelta;
        }

        @Override
        public String toString(){
            return "Ball[(" + x + ", " + y + ", speed=(" + xDelta + ", " + yDelta + ")]";
        }
    }

    class Main {
        public static void main(String[] args) {
            ThucHanh.CIRCLE c = new CIRCLE(5, "blue");
            System.out.println(c + " area=" + c.getArea());

            // Test B2
            ThucHanh.CIRCLE1 c1 = new CIRCLE1(3);
            System.out.println(c1 + " area=" + c1.getArea() + " circumference=" + c1.getCircumference());

            // Test B3
            ThucHanh.RECTANGLE r = new RECTANGLE(4, 6);
            System.out.println(r + " area=" + r.getArea() + " perimeter=" + r.getPerimeter());

            // Test B4
            ThucHanh.EMPLOYEE e = new EMPLOYEE(1, "John", "Doe", 3000);
            System.out.println(e + " annual=" + e.getAnnualSalary());
            e.raiseSalary(10);
            System.out.println("After raise: " + e);

            // Test B5
            ThucHanh.INVOICEITEM item = new INVOICEITEM("A01", "Book", 2, 50);
            System.out.println(item + " total=" + item.getTotal());

            // Test B6
            ThucHanh.ACCOUNT acc1 = new ACCOUNT("101", "Alice", 1000);
            ThucHanh.ACCOUNT acc2 = new ACCOUNT("102", "Bob", 500);
            acc1.transferTo(acc2, 200);
            System.out.println(acc1);
            System.out.println(acc2);

            // Test B7
            ThucHanh.DATE d = new DATE(27, 9, 2025);
            System.out.println("Date=" + d);

            // Test B8
            ThucHanh.TIME t = new TIME(23, 59, 59);
            System.out.println("Time=" + t);
            t.nextSecond();
            System.out.println("After nextSecond=" + t);
            t.previousSecond();
            System.out.println("After previousSecond=" + t);

            // Test B9
            ThucHanh.BALL b = new BALL(1, 1, 5, 2, 3);
            System.out.println(b);
            b.move();
            System.out.println("After move: " + b);
            b.reflectHorizontal();
            b.reflectVertical();
            System.out.println("After reflect: " + b);
        }
    }
}