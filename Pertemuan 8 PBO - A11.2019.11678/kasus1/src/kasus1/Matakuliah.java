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
public class Matakuliah extends Mahasiswa {
    String NamaMatkul;
    Matakuliah(){
    }
    public void GetNamaMatkul(String newNamaMatkul){
        NamaMatkul = newNamaMatkul;
        System.out.println("Nama Matakuliah : " + NamaMatkul);
    }
}
