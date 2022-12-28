/*
Lap trinh mang 1 chieu;
Viet chuong trinh khai bao 1 mang so nguyen, in day so ra theo thi ti nguoc lai;
 */

public class DemoArrayOne {

    public static void main(String[] args) {
        //Khai bao mang 1 chieu a chua cac so nguyen;
        int[] a = {10, 6, 20, 15, 7, 9};

        //In cac so trong mang a ra man hinh;
        System.out.println("Cac so nguyen: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }

        //In cac so trong mang a, theo thu tu nguoc lai;
        System.out.println("\nCac so nguyen theo thu tu dao nguoc: ");
        for (int i = a.length-1; i>=0;i--){
            System.out.printf("%4d ", a[i]);
        }
    }
}