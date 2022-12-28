/*
Day la 1 lop truu tuong mo ta cau truc 1 doi tuong hinh hoc, bao gom:
- 1 thuoc tinh: PI;
- 3 ham truu tuong: tinh dien tich, tinh chu vi va ham nhap lieu;
- 1 ham xuat dien tich va chu vi;
 */
package data;

public abstract class Shape {

    public double PI = 3.14;

    //ham truu tuong tinh dien tich;
    public abstract double getArea();

    //ham truu tuong tinh chu vi;
    public abstract double getPeripheral();

    //ham truu tuong nhap du lieu cho 1 doi tuong hinh hoc;
    public abstract void input();

    //ham xuat dien tich va chu vi 
    public void output() {
        System.out.printf("Dien tich: %.2f\n", getArea());
        System.out.printf("Chu vi: %.2f\n", getPeripheral());
    }
}
