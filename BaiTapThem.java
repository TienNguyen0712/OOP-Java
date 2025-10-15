public class BaiTapThem {
    // BaiTap1 
    class STUDENT {
        private String name;
        private int age;
        private int studentID;
        private float GPA;

        public STUDENT (String name, int age, int studentID, float gpa){
            this.name = name;
            this.age = age;
            this.studentID = studentID;
            this.GPA = gpa;
        }

        public void displayInfo(){
            System.out.println(this);
        }

        public boolean checkScholarship(){
            return GPA > 8.0;
        }
        
        @Override 
        public String toString(){
            return "Student=( ID: " + studentID + ", Name: " + name + ", Age: " + age + ", GPA" + GPA + " )";
        }
    }

    // BaiTap2
    class RECTANGLE {
        protected double height;
        protected double width;

        public RECTANGLE(double h, double w){
            this.height = h;
            this.width = w;
        }

        public double getArea(){
            return height * width;
        }

        public double getPerimeter(){
            return (height + width) * 2;
        }

        @Override
        public String toString(){
            return "Retangle( height: " + height + ", width: " + width + " )";
        }
    }

    class SQUARE extends RECTANGLE {
        private double canh;

        public SQUARE(double height, double width, double canh){
            super(height, width);
            this.canh = canh;
        }

        @Override
        public String toString(){
            return "Square( height: " + height + ", width: " + width + ", cạnh: " + canh + ")";
        }
    }
    // BaiTap 3
    class BANKACCOUNT {
        protected int accountNumber;
        protected String ownerName;
        protected double balance;

        public BANKACCOUNT(int accountNumber, String ownerName, double balance){
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = balance;
        }

        public double deposit(double amount){
            return balance += amount;
        }

        public double withdraw(double amount){
            return balance -= amount;
        }

        public void display(){
            System.out.println(this);;
        }

        @Override
        public String toString(){
            return "BankAccount( Name: " + ownerName + ", Balance: " + balance + ", AccountNumber: " + accountNumber + " )";
        }
    }

    class SAVINGSACCOUNT extends BANKACCOUNT {
        private double interestRate;

        public SAVINGSACCOUNT(int accountNumber, String ownerName, double balance, double rate) {
            super(accountNumber, ownerName, balance);
            this.interestRate = rate;
        }

        public double addInterest(){
            balance += balance * interestRate;
            return balance;
        }
    }

    public static void main(String[] args) {
        BaiTapThem bt = new BaiTapThem();
        // Test BaiTap1
        STUDENT st1 = bt.new STUDENT("Adam", 20, 1, 3.1f);
        st1.displayInfo();
        // Test BaiTap2
        RECTANGLE r1 = bt.new RECTANGLE(1.0, 2.0);
        r1.getArea();
        r1.getPerimeter();
        System.out.println(r1);
        SQUARE s1 = bt.new SQUARE(2.2, 3.0, 1.2);
        System.out.println(s1);
        // Test BaiTap3
        BANKACCOUNT b1 = bt.new BANKACCOUNT(01234567, "Adam", 3000000);
        b1.display();
        b1.deposit(2000000);
        b1.withdraw(2000000);
    }
}
