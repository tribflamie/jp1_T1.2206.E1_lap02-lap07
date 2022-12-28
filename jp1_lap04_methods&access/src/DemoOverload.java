/*
Lap trinh phuong thuc overload;
Viet chuong trinh tinh tong 2 so nguyen;
 */

import java.util.*;

public class DemoOverload {

    //cong 2 so nguyen
    void add(int a, int b) {
        System.out.printf("%d + %d = %d \n", a, b, a + b);
    }

    //cong 3 so thuc
    void add(float a, float b, float c) {
        System.out.printf("%.2f + %.2f + %.2f = %.2f \n", a, b, c, a + b + c);
    }

    public static void main(String[] args) {
        DemoOverload demo = new DemoOverload();
        demo.add(10, 20);
        demo.add(2.5f, 15, 34.83f);
    }

}
