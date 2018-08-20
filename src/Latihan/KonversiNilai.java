/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class KonversiNilai {
    public static void main (String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("Masukan nilai web : ");
        int n = m.nextInt();
        if(n >= 90)
            System.out.println("Nilai A");
               else if(n >= 75)
            System.out.println("Nilai B");
                       else if(n >= 50)
            System.out.println("Nilai A");
                               else if(n >= 35)
            System.out.println("Nilai A");
        else
                                   System.out.println("Nilai E");
    }
    
}
