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
public class luas_kerucut_pemdas {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menginput jari-jari dan tinggi kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();

        // Menghitung luas alas kerucut
        double luasAlas = Math.PI * jariJari * jariJari;

        // Menampilkan hasil
        System.out.println("Luas alas kerucut adalah: " + luasAlas + " satuan luas");

        // Menutup Scanner
        input.close();
    }
}

