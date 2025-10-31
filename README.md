### Bài tập Phương pháp lập trình hướng đối tượng
#### **Mục lục**
* **[Java là gì](#1)**
* **[Tại sao phải dùng Java](#2)**
* **[Các khái niệm cơ bản](#3)**
* **[Inheritance (Kế thừa)](#4)**
* **[Constructor (Bộ khởi tạo)](#5)**
* **[Encapsulation (Đóng gói)](#6)**

<a id="1"><h2> Java là gì?</h2></a>
Là một ngôn ngữ lập trình, tạo ra vào năm 1995 có hơn 3 tỷ thiết bị chạy Java được sử dụng cho (Mobile, Desktop, Web, Games, ... )
<a id="2"><h2> Tại sao phải dùng Java </h2></a>
* Làm việc nhiều thiết bị
* Một trong những ngôn ngữ phổ bién
* Cộng đồng lớn cho dev
* Java viết dựa trên OOP đưa ra một cấu trúc gọn gàng và chấp nhận việc tái sử dụng với các dev giá tri thấo 
* Giống với C++ và C# dễ dàng để có thể đổi qua Java
<a id="3"><h2> Các khái niệm cơ bản </h2></a>
##### *Lớp (Classes)*
Là một tập hợp nhiều đối tượng được viết trong chương trình, lớp mô tả một lớp có thể và không thể làm gì được
Mỗi đối tượng được xem là một `instance` của class và chỉ thuộc duy nhất một class. Ví dụ ta có 2 đối tượng Moto1 và Moto2 thì hai đối tượng này chỉ thuộc duy nhất một class Bicycle, một khi Class được định nghĩa nó có thể tạo nhiều instance đối tượng phụ thuộc theo chương trình muốn cài đặt 

Trong UML thì Class được biểu diễn bằng hình chữ nhật bao quanh các Object thuộc Class đó
##### *Đối tượng (Object)*
Là một dạng vật thể mà ta có thể miêu tả được. Trong OOP nó chứa các định nghĩa về nó và các phương thức chính để tương tác được với nó
> Ví dụ: Ta có Object `Student` thì định nghĩa của nó sẽ bao gồm `Tên, Ngày sinh, ... ` các phương thức `getName(), getAge(), ...`

Trong sơ đồ UML thì Object được biểu diễn là một hình chữ nhật
##### *Message*
Được định nghĩa như các phương thức để các đối tượng có thể giao tiếp với nhau 
##### *Method (Phương thức)*
Định nghĩa các Message thực hiện như thế nào?, với những đối tượng gì?. Phương thức định nghĩa cho Class được gọi là `Class Method`, định nghĩa cho Object được gọi là `Instance Method`. Gía trị khi được truyền vào message để Method có thể gọi ta gọi đó là `argument` tham số của message. Lưu ý rằng tên của message phải chung tên với method

Trong UML được biểu diễn bằng chữ trên dấu mũi tên
```
getDistance()
---------------->
giả trị distance
```
##### *Instance Data Value (Biến của Object)*
Là thành phần được khởi tạo nằm trong Object
##### *Class Data Value (Biến của Class)*
Là thành phần được khởi tạo trong Class và có thể chia sẻ cho các instance nằm trong lớp đó 
##### *Variables and Constant (Biến và hàm số)*
Giá trị có thể thay đổi được gọi là biến và không thể thay đổi được gọi là hàm số
<a id="4"><h2>Inheritance (Kế thừa)</h2></a>
Là kiểu thiết kế trong OOP thừa kế lại các giá trị trong một lớp (Thiết kế hai hoặc nhiều thực thể khác nhau những vẫn có thể chia sẻ các đặc trưng chung). Ta gọi lớp chung là `superclass` các lớp kế thừa lại từ nó thì gọi là `subclasses`. Nhiều lớp có thể kế thừa với nhau. Được biểu diễn bằng dấu mũi tên với phần mũi tên hướng về lớp được thừa kế. Một hệ thống phần mềm được biểu diễn như sau 
```
Phân tích --- Thiết kế --- Coding --- Kiểm tra --- Debugging --- Operation (Bảo trì và tái sử dụng)
```
<a id="5"><h2>Lớp (Classes)</h2></a>
##### *Constructor (Bộ khởi tạo)*
Phương thức đầu tiên định nghĩa lên một lớp được gọi là bộ khởi tạo. Một `constructor` là một phương thức đặc biệt khi một đối tượng mới được tạo nó sẽ được gọi đến, bộ khởi tạo sẽ không có giá trị trả về, phạm vi truy cập không phải lúc nào cũng là `public` nhưng việc không `public` cũng ít khi được sử dụng. Nhưng lại rất phổ biến việc truyền vào nhiều tham số ở lớp khởi tạo. Khi ta truyền tham số vào trong hàm khởi tạo thì nếu khởi tạo một đối tượng mới ta bắt buộc phải truyền tham số ứng với số lượng tham số truyền vào hàm khởi tạo của đối tượng đó nêu không sẽ gây ra lỗi thiếu tham số 

Cú pháp để thực hiện việc khởi tạo
```Java
public <tên class> ( <tham số> ) {
  < mệnh đề>
}
```
##### *Phương thức truy cập (accesstor)*
Là phương thức trả về thông tin của một đối tượng còn được gọi là phương thức `get`
##### *Phương thức điều chỉnh (mutator)*
Là phương thức có thể điều chỉnh hay tạo mới một thuộc tính của đối tượng còn được gọi là phương thức `set`
**Một đối tượng hoàn chỉnh sẽ bao gồm:**
```Java
class Student {
  // Dữ liệu
  private String name;
  private int age;
  // Bộ khởi tạo
  public Student(String studentName, int studentAge){
        name = studentName;
        age = studentAge;
  }
  // Trả về tên học sinh
  public String getName(){
      return name;
  }
  // Trả về tuổi học sinh
  public String getAge(){
      return age;
  }
}
```
<a id="6"><h2>Encapsulation (Tính đóng gói)</h2></a>
Là phương thức cho phép xây dựng dữ liệu sao cho tách biệt với mỗi phần với mỗi lớp. Giúp bảo toàn dữ liệu từ truy cập bên ngoài. Nhằm dảm bảo sự mạch lạc trong code
. Tính đóng gỏi được thể hiện ở việc kiểm soát các mức độ truy cập thông qua từ khóa `public` và `private` giúp đảm bảo tính an toàn và tái sử dụng khi thực hiện chương trình với dâu (-) biểu diễn cho private và dấu (+) biểu diễn cho public.
    



