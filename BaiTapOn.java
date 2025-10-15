public class BaiTapOn {
    // LopPerson
    class Person {
        protected String name;
        protected int age;
        protected String address;

        public Person(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public String getAddress(){
            return address;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void display(){
            System.out.println(this);
        }

        @Override
        public String toString(){
            return "Person( Name: " + name + ", Age: " + age + ", Address: " + address + " )";
        }
    }
    // LopStudent 
    class Student extends Person {
        private double gpa;

        public Student(String name, int age, String address, double gpa){
            super(name, age, address);
            this.gpa = gpa;
        }

        public double getGpa(){
            return this.gpa;
        }

        public void setGpa(double gpa){
            this.gpa = gpa;
        }

        public void display(){
            System.out.println(this);
        }

        @Override
        public String toString(){
            return "Student( Name: " + name + ", Age: " + age + ", Address: " + address + ", GPA: " + gpa + " )";
        }
    }

    // Lop Teacher
    class Teacher extends Person {
        private int salary;

        public Teacher(String name, int age, String address, int salary){
            super(name, age, address);
            this.salary = salary;
        }

        public int getSalary(){
            return this.salary;
        }

        public void setSalary(int salary){
            this.salary = salary;
        }

        public void display(){
            System.out.println(this);
        }

        @Override
        public String toString(){
            return "Teacher( Name: " + name + ", Age: " + age + ", Address: " + address + ", Salary: " + salary + " )";
        }
    }

    public static void main(String[] args) {
        // Test 
        BaiTapOn bto1 = new BaiTapOn();
        BaiTapThem btt1 = new BaiTapThem();
        // Lơp Person
        BaiTapThem.STUDENT sd1 = btt1.new STUDENT("Adam", 23, 1234, 3.1f);
        sd1.displayInfo();

        Person p1 = bto1.new Person("Adam", 21, "Ho Chi Minh");
        p1.display();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getAddress());

        p1.setName("Eva");
        p1.setAge(22);
        p1.setAddress("Ha Noi");
        p1.display();
        // Lop Student
        Student s1 = bto1.new Student("Adam", 20, "Ha Noi", 3.1);
        s1.display();
        s1.setGpa(3.2);
        s1.display();
        // Lop Teacher
        Teacher t1 = bto1.new Teacher("Eva", 31, "Ho Chi Minh", 6000);
        t1.display();
        t1.setSalary(3000);
        t1.display();
    }
}
