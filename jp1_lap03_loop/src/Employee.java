/*
Dinh nghia class, khai bao va su dung bien object;

Viet chuong trinh nhap thong tin cua 1 nhan vien, in ra bang luong cua nhan vien nay;

Thong tin nhan vien se duoc mo ta trong class Employee, bao gom cac:
    - Feilds: id, name, baseSalary, workDays;
    - Methods: input(), output();

 */

import java.util.*;

public class Employee {

    //Thuoc tinh cua nhan vien;
    public String id, name;
    public int baseSalary;
    public int workDays;

    //Ham dung khong tham so
    public Employee() {
        id = "E01";
        name = "Nguyen A";
        baseSalary = 500;
        workDays = 26;
    }
    
    //Ham dung co tham so
    public Employee(String id, String name, int baseSalary, int workDays) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.workDays = workDays;
    }
    
    //Ham nhap thong tin nhan vien
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap luong CB: ");
        baseSalary = sc.nextInt();
        System.out.print("Nhap so ngay lam viec: ");
        workDays = sc.nextInt();
    }
    
    //Ham xuat bang luong chi tiet
    public void output(){
        System.out.println("=== Bang luong nhan vien ===");
        System.out.println("id: " + id);
        System.out.println("ten: " + name);
        System.out.println("luong CB: " + baseSalary);
        System.out.println("so ngay lam viec: " + workDays);
        System.out.println("============================");
        
        float income = baseSalary + workDays / 26.0f;
        System.out.printf("luong thuc lanh: %.2f \n", income);
    }
}
