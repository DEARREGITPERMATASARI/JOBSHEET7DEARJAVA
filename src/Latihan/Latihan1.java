/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author Nita
 */
public class Latihan1 {
    public static void main(String[] args) {
        String identitas = "nama lengkap / kelas/ no";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nIF.. 1");
        if ( a < 5 ) 
            System.out.println("nilai a kurang dari 5 ");
        
        System.out.println("\nIF..2");
        
        if ( a == 5) 
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF..3");
        if ( a > 5) {
            System.out.println("isi variable a : " + a);
        
            System.out.println("nilai a lebih besar dari 5");
        }
        
    }
    
}
