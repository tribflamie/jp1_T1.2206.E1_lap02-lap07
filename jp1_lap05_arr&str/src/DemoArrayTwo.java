/*
Lap trinh mang 2 chieu;
Viet phuong trinh tao 1 ma tran so nguyen 2 chieu. In so lon nhat va ma tran ra ma hinh;
 */

public class DemoArrayTwo {

    public static void main(String[] args) {
        //Khai bao mang 2 chieu a[][]
        int a[][] = {{10, 2, 3}, {29, 34, 5}, {8, 22, -6}};
        int max = a[0][0];

        //In ma tran va tim so nhat;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d", a[i][j]);
                if (max < a[i][j]) {
                    max = a[i][j];
                }
            }
            System.out.println("\n");
        }
        System.out.println("So lon nhat: " + max);
    }
}
