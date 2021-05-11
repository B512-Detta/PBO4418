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
public class Dosen implements Universitas {
    String NamaDosen;
    int ID_IDN;
    Dosen(){
    }
    public void GetNamaDosen(String newNamaDosen){
        NamaDosen = newNamaDosen;
        System.out.println("Nama Dosen : " + NamaDosen);
    }
    public void GetIDDosen(int newID_IDN){
        ID_IDN = newID_IDN;
        System.out.println("ID Dosen : " + ID_IDN);
    }
    public void GetName(){
        System.out.println("Nama Universitas : Universitas Dian Nuswantoro");
    }
}
