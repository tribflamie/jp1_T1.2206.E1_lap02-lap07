/*
Tao java main class EmployeeTest, de tao doi tuong Employee va kiem thu 
cac chuc nang nhap thong tin va in bang luong
 */

public class EmployeeTest {

    public static void main(String[] args) {
        //case 1: tao doi tuong Employee e1 - bang ham dung khong tham so;
        Employee e1 = new Employee();
        e1.output();

        //case 2: tao doi tuong Employee e2 - bang ham dung co tham so;
        Employee e2 = new Employee("E02", "Allice", 1000, 20);
        e2.output();
        
        //case 3: tao doi tuong Employee e3 - bang ham dung khong tham so;
        Employee e3 = new Employee();
        
        e3.input(); //Nhap thong tin nhan vien e3
        e3.output(); //In bang luong nhan vien e3
    }
}
