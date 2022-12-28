/*
Lap trinh dieu kien, su dung cau truc swithcase
Viet chuong trinh nhap 1 so nguyen [0-6], in ra thu trong tuan tuong ung
 */
import java.util.*;

public class DayofWeek {
    
    public static void main(String[] args) {
        //Ham nhap 1 so nguyen [0-6];
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number [0-6]: ");
        int day = sc.nextInt();
        //Su dung cau truc swithcase
        String s;
        switch(day){
            case 0: 
                s = "Sunday";
                break;
            case 1:
                s = "Monday";
                break;
            case 2:
                s = "Tuesday";
                break;
            case 3:
                s = "Wednesday";
                break;
            case 4:
                s = "Thusday";
                break;
            case 5:
                s = "Friday";
                break;
            case 6:
                s = "Saturday";
                break;
            case 7:
                s = "Sunday";
                break;
            default:
                s = "Invalid day";
                break;
        }
        System.out.println(s);
    }
}
