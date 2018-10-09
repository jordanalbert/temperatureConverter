/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package albert_project3.pkg1_temperatureconverter;

import java.util.*;
import java.text.*;

/*
 *Jordan Albert
 *September 8th, 2018
 *Project 3-1 Temperature converter
 */
public class Albert_Project31_temperatureConverter {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        float f;
        float c;
        String a;
        
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();
        do {
            System.out.print("Enter degrees in Fahrenheit: ");
        
            f = sc.nextFloat(); // show degrees in celsius here
            c = ((f-32) * 5/9);
            System.out.println("Degrees in Celsius is: " + c);


            System.out.println("Continue? (y/n): ");
            a = sc.next();
        }
        while (a.equalsIgnoreCase("y")); 
        
        
    }
    
}
