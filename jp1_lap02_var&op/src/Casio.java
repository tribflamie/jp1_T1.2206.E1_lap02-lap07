/*
Khai bao bien, su dung cac phep toan so hoc;
Viet chuong trinh nhap 2 so nguyen a, b. Tinh tong, hieu, tich, thuong cua 2 so do;
 */

import java.util.*;

public class Casio {

    public static void main(String[] args) {
        //Nhap 2 so nguyen n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen thu 1: ");
        int n1 = sc.nextInt();
        System.out.print("Nhap so nguyen thu 2: ");
        int n2 = sc.nextInt();

        //In ket qua cac phep toan + = * /;
        System.out.printf("%d + %d = %d \n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d \n", n1, n2, n1 - n2);
        System.out.printf("%d * %d = %d \n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
    }
}
