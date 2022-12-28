/*
Lap trinh ArrayList;
Viet chuong trinh nhap danh sach ten sinh vien va in ra theo thu tu alphabet
*/

import java.util.*;

public class DemoArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        
        //Khai bao ArrayList [ds] chua ten cua cac sinh vien
        ArrayList ds = new ArrayList();
        
        //Vong lap nhap ten n-sinh vien
        for(int i = 0; i<n;i++){
            System.out.printf("Nhap ten sinh vien thu %d: ", i+1);
            String ten = sc.nextLine();
            ds.add(ten);
        }
        
        //Sap xep lai theo thu tu a-z
        Collections.sort(ds);
        
        //In ds ten sinh vien sau khi da sap xep thu tu
        System.out.printf("\n Danh sach ten SV - theo thu tu a-z");
        for (int i = 0; i < ds.size(); i++){
            System.out.printf("\n\t%s", ds.get(i));
        }
    }
    
}
