/*
Su dung bo tu truy xuat cho bien va phuong thuc trong class
Viet chuong trinh input(), output() thong tin khach hang
 */

public class Customer {

    public String id, name;
    protected int phone;
    private int pinCode;

    //Ham dung co tham so
    public Customer() {
        id = "C01";
        name = "Nguyen A";
    }

    //Ham dung khong tham so
    public Customer(String id, String name, int phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    //Lay ma pin
    public int getPincode() {
        return pinCode;
    }

    //Lay ma pin
    public void setPincode(int pinCode) {
        this.pinCode = pinCode;
    }

    //Lay phone number
    public int getPhone() {
        return phone;
    }

}
