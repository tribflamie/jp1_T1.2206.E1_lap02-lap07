/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.Scanner;

public class Rectangle extends Shape {

    public int width, length;

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPeripheral() {
        return (width + length) * 2;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        length = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        width = Integer.parseInt(sc.nextLine().trim());
    }

    @Override
    public void output() {
        System.out.println("\n=== Hinh chu nhat ===");
        super.output();
    }

}
