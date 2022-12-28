/*
Fields: accNo, balance;
Constructors: Account(), Accoutn(String, int);
Methods: deposit(), withdraw(), getBalance();
 */

public class Account {

    String accNo;
    int balance;

    public Account() {
        accNo = "ACC01";
        balance = 100;
    }

    public Account(String acc, int bal) {
        this.accNo = acc;
        this.balance = bal;
    }

    public void deposit(int amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Giao dich thanh cong.");
        } else {
            System.out.println("Khong the goi tien am !...");
        }
    }

    public void withdraw(int amt) {
        if (amt > 0 && amt < balance) {
            //update so du;
            //notify giao dich thanh cong;
        } else {
            //notify giao dich that bai;
        }
    }
    
    public int getBalance(){
        return balance;
    }
    
    @Override
    public String toString(){
        return String.format("%s : %d",accNo, balance);
    }
}
