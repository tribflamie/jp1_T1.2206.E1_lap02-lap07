/*
Lap trinh vong lap: su dung cau truc while;
Viet chuong trinh in ban cuu chuong N;
 */

import java.util.Scanner;

public class BangCuuChuong {

    public static void main(String[] args) {
        //Ham nhap so nguyen N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N: ");
        int n = sc.nextInt();
        //Ham in ban cuu chuong N;
        int i = 1;
        while(i<=10){
            System.out.printf("%2d * %2d = %3d \n", n, i, n*i);
            i++;
        }
    }
}
