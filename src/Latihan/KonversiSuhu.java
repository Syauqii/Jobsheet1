/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author SYSTEM
 */
public class KonversiSuhu {
    public static void main (String[] args){
        int c=78,r,f,k;
        r = c*4/5;
        f = c*9/5 + 32;
        k = c + 273;
        System.out.println("78C to Reamur =  "+r);
        System.out.println("78C to Fahrenheit =  "+f);
        System.out.println("78C to Kelvin =  "+k);
    }
}
