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
public class Beasiswa {
    public static void main (String[] args){
        Scanner m = new Scanner (System.in);
        System.out.print("Masukkan nilai TPA :");
        int tpa = m.nextInt();
        System.out.print("Masukkan nilai Bahasa Inggris :");
        int bi = m.nextInt();
        if ((tpa > 85) && (bi > 80))
            System.out.println("Siswa dapat beasiswa");
        else
            System.out.println("Siswa tidak dapat beasiswa");
    }
}
