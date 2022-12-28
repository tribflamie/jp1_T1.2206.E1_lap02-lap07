/*

 */

/**
 *
 * @author bumga
 */
public class DemoPassByValue {

    //Phuong thuc tham so n - argument by value
    public void setVal(int n) {
        n += 10;
    }

    public static void main(String[] args) {
        //Khai bao bien cuc bo
        int n = 10;
        
        //Khai bao bien khoi tao cua class [DemoPassValue]
        DemoPassByValue obj = new DemoPassByValue();
        
        //Goi phuong thuc setVal() voi tham so [num1]
        obj.setVal(n);
        
        //in va kiem tra gia tri n
        System.out.println("Value of n after invoking setVal() is " + n);
    }
}
