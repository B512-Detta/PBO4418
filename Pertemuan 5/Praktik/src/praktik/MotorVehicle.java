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
public class MotorVehicle extends Vehicle {
    int SizeOfEngine = 1;
    String LicencePlate = "H 1 IDN";
    public MotorVehicle(){
    }
    public MotorVehicle(int newSizeOfEngine , String newLicencePlate){
        SizeOfEngine = newSizeOfEngine;
        LicencePlate = newLicencePlate;
    }
    public void GetSizeOfEngine(int newSizeOfEngine){
        SizeOfEngine = newSizeOfEngine;
        System.out.println("ukuran mesin " +SizeOfEngine);
    }
    public void GetLicencePlate(String newLicencePlate){
        LicencePlate = newLicencePlate;
        System.out.println("Plat kendaraan " +LicencePlate);
    }
}
