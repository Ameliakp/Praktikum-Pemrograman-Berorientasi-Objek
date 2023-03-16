/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BangunGeometri;

/**
 *
 * @author user
 */


import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
     static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        boolean ulang;
        
        do {
            System.out.println("PROGRAM MENGHITUNG LUAS PERMUKAAN DAN VOLUME");
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih :");
            int input = userInput.nextInt();
            
            if (input == 1) {
               hitungBalok();
            } else if (input == 2) {
                hitungTabung();
            } else if (input == 0) {
                System.out.println("Terimakasih telah menggunakan program!");
            } else {
                System.out.println("Opsi tidak valid. Mohon masukkan opsi dengan benar!");
                ulang = true;
            }
            
            System.out.println("Ulangi? (Ya : 1 || Tidak : 0)");
            int input2 = userInput.nextInt();
            
            if(input2 == 1) {
                ulang = true;
            } else {
                ulang = false;
            }
            
        }while (ulang == true);  
    }
    
    static void hitungBalok() {
        System.out.print("\nInput Panjang : ");
        double inputPanjangB = userInput.nextInt();
        System.out.print("Input Lebar : ");
        double inputLebarB = userInput.nextInt();
        System.out.print("Input Tinggi : ");
        double inputTinggiB = userInput.nextInt();
        System.out.println("\n");
        Balok balok = new Balok(inputPanjangB, inputLebarB, inputTinggiB);
        balok.display();
    }
    
    static void hitungTabung() {
        System.out.print("\nInput Tinggi : ");
        double inputTinggiT = userInput.nextInt();
        System.out.print("Input Jari-jari : ");
        double inputJariJariT = userInput.nextInt();
        System.out.println("\n");
        Tabung tabung = new Tabung(inputJariJariT, inputTinggiT);
        tabung.display();
    }
}
    
