/*
Lap trinh phuong thuc;
Viet chuong trinh in ket qua cac phep toan so hoc cong tru nhan chia bang 
cach viet cac phuong thuc tuong ung;
 */

public class Calculator {

    //Phuong thuc cong 2 so;
    public void add(int n1, int n2) {
        int r = n1 + n2;
        System.out.printf("%d + %d = %d\n", n1, n2, r);
    }

    //Phuong thuc nhan 2 so;
    public void mul(int n1, int n2) {
        int r = n1 * n2;
        System.out.printf("%d * %d = %d\n", n1, n2, r);
    }

    //Phuong thuc tru 2 so;
    public void sub(int n1, int n2) {
        int r = n1 - n2;
        System.out.printf("%d - %d = %d\n", n1, n2, r);
    }

    public static void main(String[] args) {
        //tao doi tuong the hien cua class Calculator [oCalc];
        Calculator oCal = new Calculator();

        //goi cac phuong thuc cong, tru, nhan voi cac tham so tuong ung
        int n1 = 4, n2 = 7;
        oCal.add(10, 15);
        oCal.sub(20,8);
        oCal.mul(n1, n2);
    }
}
