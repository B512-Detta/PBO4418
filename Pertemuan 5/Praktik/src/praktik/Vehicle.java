/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik;

/**
 *
 * @author acer
 */
public class Vehicle {
    double speed = 0;
    String color = "orange";
    public Vehicle(){    
    }
    public void GoStraight(){
        System.out.println("Maju..");
    }
    public void TurnLeft(){
        System.out.println("Belok kiri");
    }
    public void TurnRight(){
        System.out.println("Belok kanan");
    }
    public void GetColor(String newColor){
        color = newColor;
        System.out.println("Warna Kendaraan :  " +color);
    }
    public void GetSpeed(double newSpeed){
        speed = newSpeed;
        System.out.println("Warna Kendaraan :  " +speed);
    }
}
