/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import data.Computer;
import data.Laptop;
import java.util.Scanner;

public class TestLaptop {

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.input();
        c1.output();
        System.out.println("");

        Laptop la = new Laptop();
        la.input();
        la.output();
        System.out.println("");
    }

}
