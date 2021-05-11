/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1;

/**
 *
 * @author acer
 */
public class UjiUniversitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double y;
        double x;
        double hasil;
        //Universitas kampus1 = new Universitas();
        Dosen kampus2 = new Dosen();
        Mahasiswa kampus3 = new Mahasiswa();
        Matakuliah kampus4 = new Matakuliah();
        Nilai kampus5 = new Nilai();
        MatakuliahPokok kampus6 = new MatakuliahPokok();
        MatakuliahTambahan kampus7 = new MatakuliahTambahan();
        kampus2.GetName();
        kampus2.GetNamaDosen("Bapak Andreas");
        kampus2.GetIDDosen(120728394);
        kampus2.GetNamaDosen("Ibu Ratna");
        kampus2.GetIDDosen(120845693);
        System.out.println("\n");
        kampus3.GetNamaMhs("Bernadetta Sri Endah D P ");
        kampus3.GetNim("A11201911678");
        System.out.println("A. Matakuliah yang diambil Mahasiswa atas nama Bernadetta Sri Endah : ");
        kampus4.GetNamaMatkul("Pemrogaman Berbasis Objek");
        kampus4.GetNamaMatkul("Kriptografi");
        kampus4.GetNamaMatkul("Sistem Operasi");
        System.out.println("1. Matakuliah Pokok dari Matakuliah yang diambil Bernadetta Sri Endah : ");
        kampus6.GetNamaMatkul("Pemrogaman Berbasis Objek");
        kampus6.GetNilai(85);
        kampus6.GetNamaMatkul("Sistem Operasi");
        kampus6.GetNilai(75);
        x = 85+75;
        y = x/2;
        hasil = y+60/100;
        System.out.println("Nilai Akhir : " + hasil);
        System.out.println("2. Matakuliah Tambahan dari Matakuliah yang diambil Bernadetta Sri Endah : ");
        kampus7.GetNamaMatkul("Kriptografi");
        kampus7.GetNilai(90);
        hasil = kampus7.Nilai+40/100;
        System.out.println("Nilai Akhir : " + hasil);
        kampus5.GetPredikat('A');
        System.out.println("\n");
        kampus3.GetNamaMhs("Sonia Kusumaningtiyas");
        kampus3.GetNim("A11201912067");
        System.out.println("A. Matakuliah yang diambil Mahasiswa atas nama Sonia Kusumaningtiyas : ");
        kampus4.GetNamaMatkul("Kriptografi");
        kampus4.GetNamaMatkul("Pemrogaman Berbasis Objek");
        kampus4.GetNamaMatkul("Logika Informatika");
        System.out.println("1. Matakuliah Pokok dari Matakuliah yang diambil Bernadetta Sri Endah : ");
        kampus6.GetNamaMatkul("Pemrogaman Berbasis Objek");
        kampus6.GetNilai(86);
        kampus6.GetNamaMatkul("Logika Informatika");
        kampus6.GetNilai(70);
        x = 86+70;
        y = x/2;
        hasil = y+60/100;
        System.out.println("Nilai Akhir : " + hasil);
        System.out.println("2. Matakuliah Tambahan dari Matakuliah yang diambil Bernadetta Sri Endah : ");
        kampus7.GetNamaMatkul("Kriptografi");
        kampus7.GetNilai(85);
        hasil = kampus7.Nilai+40/100;
        System.out.println("Nilai Akhir : " + hasil);
        kampus5.GetPredikat('A');
    }
    
}
