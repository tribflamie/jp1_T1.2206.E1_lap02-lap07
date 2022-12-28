/*
Tao cau truc 1 doi tuong may tinh:
- Feilds: id, thuong hieu, don gia;
- Methods: input(), display()
 */
package data;

import java.util.Scanner;

public class Computer {

    //Khai bao thuoc tinh;
    public String id, brand;
    public int price;

    //Khai bao ham dung co tham so;
    public Computer() {
        id = "C01";
        brand = "Asus";
        price = 100;
    }

    /*
    //Khai bao ham dung khong tham so;
    public Computer(String id, String brand, int price){    
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
     */
    //Ham nhap du lieu;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        id = sc.nextLine().trim();
        System.out.print("Nhap thuong hieu: ");
        brand = sc.nextLine().trim();
        System.out.print("Nhap don gia: ");
        price = Integer.parseInt(sc.nextLine().trim());
    }

    //Ham xuat du lieu ra man hinh;
    public void output() {
        System.out.println("\n=== Thong tin may tinh ===");
        System.out.println("Ma so: " + id);
        System.out.println("Thuong hieu: " + brand);
        System.out.println("Don gia: " + price);
        System.out.println("===========================");
    }
}
