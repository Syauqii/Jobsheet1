/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import Latihan.*;
import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class KonversiSuhu {
    public static void main (String[] args){
        Scanner m = new Scanner(System.in);
        int c=78,r,f,k;
        r = c*4/5;
        f = c*9/5 + 32;
        k = c + 273;
        System.out.print("Silahkan pilih konversi reamur(1), fahrenheit(2), kelvin(3) :");
        int p = m.nextInt();
        switch(p){
            case 1 : System.out.println("78C to Reamur =  "+r);
            break;
            case 2 : System.out.println("78C to Fahrenheit =  "+f);
            break;
            case 3 : System.out.println("78C to Kelvin =  " + k);
            break;      
        }
    }
}
