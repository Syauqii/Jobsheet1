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
public class kondisi {
    public static void main (String[] args){
    Scanner m = new Scanner(System.in);
    int n;
    System.out.print("Masukkan nilai akhir PBO :");
    n = m.nextInt();
    if(n<70) System.out.println("Siswa tidak lulus");
    if(n>70) System.out.println("Siswa lulus");
    }
}
