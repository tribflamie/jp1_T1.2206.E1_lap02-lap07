/*
Lap trinh truyen tham so cho phuong thuc - pass by reference
viet chuong trinh tinh va in dien tich hinh tron
 */

class Circle {

    public double radius;
    public double area;
}

public class DemoPassByRef {

    public void calcArea(Circle oCircle, double rad) {
        oCircle.radius = rad;
        oCircle.area = Math.PI * rad * rad;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        DemoPassByRef demo = new DemoPassByRef();

        demo.calcArea(c, 4);
        System.out.printf("Radius of the circle is %.2f\n", c.radius);
        System.out.printf("Area of the circle is %.2f\n", c.area);
    }

}
