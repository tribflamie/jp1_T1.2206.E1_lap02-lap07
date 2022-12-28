/*
Mo ta cau tru cua 1 doi tuong cong nhan, bao gom:
feild du lieu: ma so, ho ten, luong cb, so ngay lam viec, HD thoi vu;
phuong thuc xu ly: nhap(), xuat();
 */
package basic;

import java.util.Scanner;

public class Worker implements IPayable {

    public String id, name;
    public int salary, wdays;
    public boolean partime;

    public Worker() {
        id="a00";
        name="unknown";
        salary=100;
        wdays=30;
        partime=true;
    }

    public Worker(String id, String name, int salary, int wdays, boolean partime) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.wdays = wdays;
        this.partime = partime;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma so: ");
        id = sc.nextLine().trim();
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine().trim();

        while (true) {
            try {
                System.out.print("Nhap luong co ban: ");
                salary = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nhap so ngay lam viec: ");
                wdays = Integer.parseInt(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.print("Hop dong thoi vu (y/n) ?: ");
        partime = sc.nextLine().trim().equalsIgnoreCase("y");
    }

    public void output() {
        System.out.println("\n=== Bang luong cong nhan ===");
        System.out.println("id: " + id);
        System.out.println("ten: " + name);
        System.out.println("luong cb: " + salary);
        System.out.println("so ngay lam viec: " + wdays);
        System.out.println("thoi vu: " + partime);
        System.out.println("============================");
        System.out.println("luong thang: " + getSalary());
        System.out.println("thue thu thap: " + getTax());
        System.out.println("thuc lanh: " + (getSalary() - getTax()));
    }

    @Override
    public float getSalary() {
        return salary * wdays / 24.0f;
    }

    @Override
    public float getTax() {
        float temp = 0;
        if (partime == false && getSalary() > 500) {
            temp = getSalary() * 0.1f;
        }
        return temp;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %.2f", id, name, getSalary() - getTax());
    }

}
