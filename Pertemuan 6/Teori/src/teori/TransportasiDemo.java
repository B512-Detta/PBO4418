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
//package Teori.teori;
import Transportasi.Mobil;
import Transportasi.Bicycle;
public class TransportasiDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil kendaraan1 = new Mobil();
        kendaraan1.Mobil();
        kendaraan1.GetSpeed(25);
        kendaraan1.GetColor("Red");
        kendaraan1.GetPlate("B 3812 AI");
        System.out.println("\n");
        
        Bicycle kendaraan2 = new Bicycle();
        kendaraan2.sepeda();
        kendaraan2.GetSpeed(15);
        kendaraan2.GetColor("Blue");
        kendaraan2.GetSize(128);
    }
    
    
}
