/*
Lap trinh tham so cho phuong thuc - Variable Argument;
Viet chuong trinh inn tong cua n - so nguyen;
 */

/**
 *
 * @author bumga
 */
public class DemoVarArgs {

    //Phuong thuc add() voi so luong doi so nguyen bat ky
    public void add(int... num) {
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        System.out.printf("Sum of numbers is " + sum);
    }

    public static void main(String[] args) {
        //Tao doi tuong obj thuoc class DemoVarArgs
        DemoVarArgs obj = new DemoVarArgs();

        //Goi phuong thuc add();
        obj.add(10, 30, 20, 40);
    }

}
