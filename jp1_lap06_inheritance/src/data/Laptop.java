/*
Mo ta cau truc cua 1 doi tuong laptop la lop con cua Computer, bao gom:
- Methods: cua lop cha, them kich thuoc, trong luong;
- Override: input(), output() cua lop cha;
 */
package data;

import java.util.Scanner;

public class Laptop extends Computer {

    public float size, weight;

    @Override
    public void input() {
        //goi ham super.input() cua lop cha Computer de nhap gia tri cho 3 thuoc tinh id, brand, price;
        super.input();

        //nhap gia tri cho 2 thuoc tinh moi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuoc: ");
        size = Float.parseFloat(sc.nextLine().trim());

        System.out.print("Nhap trong luong: ");
        weight = Float.parseFloat(sc.nextLine().trim());
    }

    @Override
    public void output() {
        //goi ham super.output() cua lop cha Computer de xuat gia tri cho 3 thuoc tinh id, brand, price;
        super.output();

        //xuat gia tri cho 2 thuoc tinh moi;
        System.out.println("Kich thuoc: " + size);
        System.out.println("Trong luong: " + weight);
    }
}
