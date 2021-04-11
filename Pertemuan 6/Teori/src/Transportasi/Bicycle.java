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
public class Bicycle {
    double speed;
    String color;
    int size;
    public void sepeda(){
        System.out.println("Sepeda akan berjalan maju..");
    }
    public void GetColor(String newColor){
        color = newColor;
        System.out.println("Warna Sepeda : " + color);
    }
    public void GetSpeed(double newSpeed){
        speed = newSpeed;
        System.out.println("Kecepatan Sepeda : " + speed);
    }
    public void GetSize(int newSize){
        size = newSize;
        System.out.println("Ukuran Sepeda : " + size);
    }
}
