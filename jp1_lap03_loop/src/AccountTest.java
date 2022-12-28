/*
Tao lop kiem thu AccountTest.java, bao gom:
    - Methods: menu(), main();
 */

import java.util.*;

public class AccountTest {

    void menu() {
        Scanner in = new Scanner(System.in);
        Account a = new Account();
        int option = 0, amt = 0;

        do {
            System.out.println("=== He thong rut/goi tien tu dong === ");
            System.out.println("1. goi tien");
            System.out.println("2. rut tien");
            System.out.println("3. xem so du");
            System.out.println("4. thoat");
            System.out.println("======================================");
            System.out.print("Chon ma chuc nang [1-4]: ");
            option = in.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Nhap so tien muon goi: ");
                    amt = in.nextInt();
                    a.deposit(amt);
                    break;
                case 2:
                    //Thong bao yeu cau nhap so tein muon rut;
                    //Goi phuong thuc rut tien;
                    break;
                case 3:
                    System.out.printf("So du = %d\n", a.getBalance());
                    break;
            }
        } while (option != 4);
                
        System.out.println("Cam on da su dung he thong! Bye Bye ...");   
    }

    public static void main(String[] args) {
        AccountTest o = new AccountTest();
        o.menu();
    }
}
