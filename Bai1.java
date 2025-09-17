import java.lang.reflect.Method;

public class Bai1 {
    //Đặt tên class phải chung với tên file luôn bắt đầu bằng in hoa
    // Chương trình chính trong Java chính là main
    // Và phải luôn kết thúc bằng ;
    public static void main(String[] args) {
        // Phương thức main là bắt buộc và là hàm chính để Java có thể chạy code
        System.out.println("Hello World"); // in kết quả và xuống dòng
        // Biến trong Java ta sử dụng dấu ngoặc kép khi biểu diễn String, để khai báo biến 
        int n = 1; // Tạo biến n kiểu dữ liệu int giới giá trị bằng 1
        // Không muốn ghi đề biến đã tồn tại dùng final trước biến ( thường được sử dụng để định nghĩa hăng số )
        // Để xuất biến cùng String sử dụng dấu + 
        String name = "John";
        System.out.println("Hello" + name);
        // Có thẻ khai báo nhiều biến 
        int n1 = 1, n2 = 2, n3 = 3 // hay 
        int x, y, z;
        x = y = z = 50;

        var n = 5; // var tự động chọn kiểu dữ liệu khi khai báo biến sử dụng ArrayList hoặc HashMap var nhanh và dẽ để đọc
        // CÓ hai cách ép kiểu 
        // Cách 1: 
        int n = 9;
        double myDouble = n;
        // Cách 2:
        double n = 10;
        int myInt = (int) n;
        // Các phép toán cũng giống như các ngôn ngữ lập trình khác
        // ++n tăng số lượng giữ biến ban đầu n++ tăng số lượng lưu lại biến
        // Dùng hàm length() để lấy độ dài của chuỗi in hoá toUpperCase() chuỗi thường hoá toLowerCase() indexOf() trả về vị trí đầu tiên có trong string 
        // charAt() tìm kiếm ký tự ở vị trí nhập vào so sánh chuỗi dùng equals() loại bỏ khoảng trắng dùng trim() hợp chuỗi dùng "+" hoặc hàm concat()
        // Để in được số thì phải ép kiểu về String
        // Ký tự đặc biệt: \' -> ', \" -> ", \\ -> \
        Math.min(x, y) // Tìm số nhỏ nhất trong x và y
        Math.max(x, y) // Tìm số lớn nhất trong x và y
        Math.sqrt(x) // Tìm căn x
        Math.abs(x) // Tìm trị tuyệt đối của x
        Math.pow(x, y) // x mũ y
        Math.round(x) // Làm tròn đến số gần nhất
        Math.ceil(x) // Làm tròn trên
        Math.floor(x) // Làm tròn xuống
        Math.random() // Số ngẫu nhiên mặc định trả về double có thể ép kiểu để có thể trả về đa dạng hơn

        if(condition){state} else if (condition1) {state1} else {state2}; // Điều kiện 
        variable = (condition) ? stateTrue : stateFalse; // Điều kiện rút gọn

        switch (condition) {
            case value:
                
                break;
                        // Switch case trong Jave
            default:
                break;
        }


        while(condition) {}; // Lặp while

        do {
                // Do while
        }  
        while (condition) 

        for (condition; condition1; condition2) {
            state; // Lặp for
        }
        
        for (kiểu dữ liệu tenBien : tenMang) {
            // Lặp foreach
        };

        break; // Kết thúch lặp ngay 
        continue; // Bỏ qua nếu gặp phải

        // Mảng
        Kiểu dữ liệu[] arr; // Cú pháp tạo mảng
        arr[0] // Truy cập mảng bằng index có thay đổi dữ liệu bằng cách gán ngược
        arr.length // Tìm độ dài của mảng
        String[] cars = new String[4] // Tạo thêm mảng kích thước = 4
        int[][] num; // Tạo mảng 2 chiều
        // Method khai báo vào hàm Bai1.java và chạy ở main gốc 
    }
}