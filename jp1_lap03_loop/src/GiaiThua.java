/*
Lap trinh vong lap, su dung cau truc for;
Viet chuong trinh tinh giai thua cua 1 so nguyen N;
 */

import java.util.*;
        
public class GiaiThua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen N [<16]: ");
        int n = sc.nextInt();
        
        if(n>15){
            System.out.println("So nhap khong hop le!");
        }else{
            long kq=1;
            for(int i=1; i<=n;i++){
                kq*=i;
            }
            System.out.printf("%d!=%d\n", n, kq);
        }
    }   
}
