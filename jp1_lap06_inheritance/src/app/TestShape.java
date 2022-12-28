/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import data.Shape;
import data.Circle;
import data.Rectangle;
import java.util.Scanner;

public class TestShape {

    public static void main(String[] args) {
        //tao doi tuong hinh tron;
        Circle c = new Circle();
        c.input();
        
        //tao doi tuong hinh chu nhat;
        Rectangle r = new Rectangle();
        r.input();
        
        //in cac doi tuong;
        c.output();
        r.output();
    }
    
}
