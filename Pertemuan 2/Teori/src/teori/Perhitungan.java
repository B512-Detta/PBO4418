/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Perhitungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumalahan");
        System.out.print("Masukan Angka pertama : ");
        int penjumlahan = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherPenjumlahan = scanner.nextInt();
        int result1 = penjumlahan + anotherPenjumlahan;
        System.out.println("Hasilnya adalah : " + result1);
        System.out.println("======================");
        System.out.println("Program pengurangan");
        System.out.print("Masukan Angka pertama : ");
        int pengurangan = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherPengurangan = scanner.nextInt();
        int result2 = pengurangan - anotherPengurangan;
        System.out.println("Hasilnya adalah : " + result2);
        System.out.println("======================");
        System.out.println("Program perkalian");
        System.out.print("Masukan Angka pertama : ");
        int perkalian = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherPerkalian = scanner.nextInt();
        int result3 = perkalian * anotherPerkalian;
        System.out.println("Hasilnya adalah : " + result3);
        System.out.println("======================");
        System.out.println("Program pembagian");
        System.out.print("Masukan Angka pertama : ");
        int pembagian = scanner.nextInt();
        System.out.print("Masukan Angka kedua : ");
        int anotherPembagian = scanner.nextInt();
        int result4 = pembagian / anotherPembagian;
        System.out.println("Hasilnya adalah : " + result4);
    }
    
}
       