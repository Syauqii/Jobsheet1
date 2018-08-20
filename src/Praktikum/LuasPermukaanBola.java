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
public class LuasPermukaanBola {
    public static void main (String[] args){
        Scanner m = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari : ");
                float r = m.nextFloat();
                System.out.println("Hasil " + (r*r*3.14*4) );
    }
}
