/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.*;

public class Student {

    //Khai bao fields du lieu
    public String id, name;
    public int yob;

    //Ham dung khong tham so
    public Student() {
        id = "A00";
        name = "unknown";
        yob = 2006;
    }

    public Student(String id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
    }

    //Ham nhap thong tin sinh vien;
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma so: ");
        id = sc.nextLine().trim();

        System.out.print("Nhap ho ten: ");
        name = sc.nextLine().trim();

        while (true) {
            System.out.print("Nhap nam sinh: ");
            yob = Integer.parseInt(sc.nextLine().trim());
            if (yob <= 2006) {
                break;
            }
            System.out.println("Nam sinh khong hop le!");
        }
    }

    //Ham xuat thong tin sinh vien;
    public void output() {
        System.out.println("=== Thong tin sinh vien ===");
        System.out.println("id: " + id);
        System.out.println("ho ten: " + name);
        System.out.println("nam sinh: " + yob);
        System.out.println("===========================");
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", id, name, yob);
    }

}
