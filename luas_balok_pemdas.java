/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshoptif__;

/**
 *
 * @author Acer
 */
import java.util.Scanner;
public class luas_balok_pemdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menginput panjang, lebar, dan tinggi balok
        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        // Menghitung luas alas balok
        double luasAlas = panjang * lebar;

        // Menampilkan hasil
        System.out.println("Luas alas balok adalah: " + luasAlas + " satuan luas");

        // Menutup Scanner
        input.close();
    }
}

