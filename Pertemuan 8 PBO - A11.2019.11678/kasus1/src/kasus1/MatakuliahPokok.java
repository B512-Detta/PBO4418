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
public class MatakuliahPokok extends Matakuliah {
    int Nilai;
    MatakuliahPokok(){
    }
    public void GetNilai(int newNilai){
        Nilai = newNilai;
        System.out.println("Nilai : " + Nilai);
    }
}
