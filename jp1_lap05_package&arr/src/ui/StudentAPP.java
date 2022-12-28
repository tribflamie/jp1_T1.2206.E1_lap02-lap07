/*
Chuong trinh quan ly sinh vien, bao gom cac chuc nang:
1. Them sinh vien moi
2. Liet ke danh sach sinh vien
3. Tim kiem sinh vien theo ten
4. Xoa sinh vien ra khoi danh sach theo ma so
5. Thoat
 */
package ui;

import data.Student;
import java.util.*;

public class StudentAPP {

    //Khai bao hang chua so luong sv toi da trong mang;
    final int max = 10;

    //Khai bao mang ds chua danh sach sinh vien;
    Student[] ds = new Student[max];

    //Khai bao bien dem so sv hien dang luu tru trong mang ds;
    int index = 0;

    public static void main(String[] args) {
        StudentAPP app = new StudentAPP();
        Scanner sc = new Scanner(System.in);
        String op = "";
        
        while(true){
            System.out.println("\n=== MENU ===");
            System.out.println("1. Them sinh vien");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo ten");
            System.out.println("4. Xoa sinh vien theo ma so");
            System.out.println("5. Thoat");
            System.out.println("============");
            
            System.out.print("Vui long chon chuc nang [1-5]: ");
            op = sc.nextLine().trim();
            
            switch(op){
                case "1":
                    app.add();
                    break;
                case "2":
                    app.display();
                    break;
                case "3":
                    System.out.print("Nhap ten sinh vien muon tim: ");
                    String ten = sc.nextLine().trim();
                    app.search(ten);
                    break;
                case "4":
                    System.out.println("Nhap ma so sinh vien muon xoa: ");
                    String maso = sc.nextLine().trim();
                    app.remove(maso);
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Nhap sai ma chuc nang! Vui long nhap lai.");
            }
        }
    }

    //them 1 sinh vien moi vo mang;
    public void add() {
        //kiem tra mang ds co con cho trong hay khong;
        if (index == max) {
            System.out.println("Het dung luong du tru!");
            return;
        }

        //tao bien doi tuong sv kieu Student;
        Student sv = new Student();
        sv.input();
        ds[index] = sv;
        index++;
    }

    //in danh sach sinh vien
    public void display() {
        //kiem tra mang ds co du lieu hay khong;
        if (index == 0) {
            System.out.println("He thong chua co du lieu!");
            return;
        }

        System.out.println("\n=== Danh sach sinh vien ===");
        for (int i = 0; i < index; i++) {
            System.out.println(ds[i]);
        }
    }

    //tim va in ra thong tin sinh vien theo ten
    public void search(String tenSV) {
        //kiem tra mang ds co du lieu hay khong;
        if (index == 0) {
            System.out.println("He thong chua co du lieu!");
            return;
        }
        System.out.println("\n=== Danh sach sinh vien ===");
        int cntTen = 0;
        for (int i = 0; i < index; i++) {
            if (ds[i].name.contains(tenSV)) {
                ds[i].output();
                cntTen++;
            }
        }
        if (cntTen == 0) {
            System.out.println("Khong tim thay sinh vien co ten" + tenSV);
        }
    }

    //tim va xoa sinh vien ra khoi mang theo ma so;
    public void remove(String ms) {
        //Kiem tra mang ds co du lieu hay khong;
        if (index == 0) {
            System.out.println("He thong chua co du lieu!");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (ds[i].id.equals(ms)) {
                /*
                tim thay sv co ma so muon xoa, 
                xoa sinh vien  ra khoi danh sach bang cach
                giam vi tri sinh vien xuong 1 hang
                 */
                for (int k = i; k < index - 1; k++) {
                    ds[k] = ds[k + 1];
                }
                index--;
                System.out.println("Da xoa sinh vien co ma so " + ms);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co ma so " + ms);
    }
}
