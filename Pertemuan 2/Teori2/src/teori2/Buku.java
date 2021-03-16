/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teori2;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Buku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BukuDemo buku1 = new BukuDemo();
        buku1.setJudul("Pemrogaman Berbasis Objek dengan Java");
        buku1.setPengarang("Indrajani");
        buku1.setPenerbit("Elexmedia Komputindo");
        buku1.setTahun(2007);
        
        BukuDemo buku2 = new BukuDemo();
        buku2.setJudul("Dasar Pemrogaman Java");
        buku2.setPengarang("Abdul Kadir");
        buku2.setPenerbit("Andi Offset");
        buku2.setTahun(2004);
        
        System.out.println("--BUKU PERTAMA--");
        System.out.println("Judul : " + buku1.Judul);
        System.out.println("Pengarang : " + buku1.Pengarang);
        System.out.println("Penerbit : " + buku1.Penerbit);
        System.out.println("Tahun : " + buku1.Tahun);
        
        System.out.println("--BUKU KEDUA--");
        System.out.println("Judul : " + buku2.Judul);
        System.out.println("Pengarang : " + buku2.Pengarang);
        System.out.println("Penerbit : " + buku2.Penerbit);
        System.out.println("Tahun : " + buku2.Tahun);
    }
    
}
