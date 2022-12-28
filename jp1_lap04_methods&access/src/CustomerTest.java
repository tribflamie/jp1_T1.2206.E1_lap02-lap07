/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

public class CustomerTest {

    public static void main(String[] args) {
        Customer c = new Customer("c01", "Bean", 8412456);
        c.setPincode(303);

        System.out.println("Thong tin khach hang");
        System.out.printf("- id: %s\n", c.id);
        System.out.printf("- ten: %s\n", c.name);
        System.out.printf("- phone: %d\n", c.getPhone());
        System.out.printf("- pin code: %d\n", c.getPincode());
    }

}
