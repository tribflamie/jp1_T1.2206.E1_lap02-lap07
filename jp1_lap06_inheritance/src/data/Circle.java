/*
Circle la lop con cua lop Shape;
Override cac methods: getArea(), getPeripheral(), input(), output();
 */
package data;

import java.util.Scanner;

public class Circle extends Shape {

    public float radius;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh hinh tron: ");
        radius = Float.parseFloat(sc.nextLine().trim());
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public double getPeripheral() {
        return 2 * PI * radius;
    }

    @Override
    public void output() {
        System.out.println("\n=== Hinh tron ===");
        super.output();
    }
}
