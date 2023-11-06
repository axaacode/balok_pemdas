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
public class luas_kubus_pemdas {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menginput panjang sisi kubus
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        // Menghitung luas alas kubus
        double luasAlas = sisi * sisi;

        // Menampilkan hasil
        System.out.println("Luas alas kubus adalah: " + luasAlas + " satuan luas");

        // Menutup Scanner
        input.close();
    }
}

