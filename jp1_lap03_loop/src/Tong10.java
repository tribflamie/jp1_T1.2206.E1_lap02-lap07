/*
Lap trinh vong lap: su dung cau truc do-while;
Viet chuong trinh tinh tong 10 so nguyen dau tien;
 */

public class Tong10 {

    public static void main(String[] args) {
        int count=1,sum=0;
        do{
            sum+=count;
            count++;
        }while(count<=10);
        System.out.printf("Tong cua 10 so nguyen dau tien: %d \n", sum);
    }
}
