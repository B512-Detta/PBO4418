/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;

/**
 *
 * @author acer
 */
//package Teori.Transportasi;
public class Mobil {
    double speed ;
    String color;
    String Plate;
    public Mobil(){
    }
    public void Mobil(){
        System.out.println("Mobil akan bergerak ke kanan..");
    }
    public void GetColor(String newColor){
        color = newColor;
        System.out.println("Warna Mobil : " + color);
    }
    public void GetSpeed(double newSpeed){
        speed = newSpeed;
        System.out.println("Kecepatan Mobil : " + speed);
    }
    public void GetPlate (String newPlate){
        Plate = newPlate;
        System.out.println("Plat Mobil : " + Plate);
    }
}
