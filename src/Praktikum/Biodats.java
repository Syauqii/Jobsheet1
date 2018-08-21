/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author SYSTEM
 */
public class Biodats {
public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = inputan.next();
        System.out.println("NIS : ");
        int nis = inputan.nextInt();
        System.out.println("Tempat Lahir : ");
        String ttl = inputan.next();
        System.out.println("Tanggal Lahir : ");
        String tgl = inputan.next();
        System.out.println("Jenis Kelamin : ");
        String jk = inputan.next();
        System.out.println("Alamat di Malang : ");
        String alamat = inputan.next();
        System.out.println("Motto Hidup : ");
        String motto = inputan.next();
        System.out.println("==========================");
        System.out.println("        Data Lengkap      ");
        System.out.println("Nama            : " +nama);
        System.out.println("NIS             : " +nis);
        System.out.println("Tempat Lahir    : " +ttl);
        System.out.println("Tanggal Lahir   : " +tgl);
        System.out.println("Jenis Kelamin   : " +jk);
        System.out.println("Alamat di Malang: " +alamat);
        System.out.println("Motto Hidup     : " +motto);
        System.out.println("==========================");
    }

    
}
