/*
Lap trinh dieu kien, su dung cau truc if;
Viet chuong trinh tinh nghiem phuong trinh bac 2: ax2+bx+c=0;
 */

import java.util.*;

public class PTB2 {
    
    public static void main(String[] args) {
        //Ham nhap so nguyen a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        int a = sc.nextInt();
        System.out.print("Nhap he so b: ");
        int b = sc.nextInt();
        System.out.println("Nhap he so c: ");
        int c = sc.nextInt();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem!");
        } else if (delta == 0) {
            double x = -b / (2.0 * a);
            System.out.printf("PT co nghiem kep: %f \n", x);
        } else {
            delta = Math.sqrt(delta);
            double x1 = (-b - delta) / (2 * a);
            double x2 = (b + delta) / (2 * a);
            System.out.println("PT co 2 nghiem: ");
            System.out.printf("x1=%.2f, x2=%.2f \n", x1, x2);
        }
    }
}
