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
public class UjiKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle kendaraan1 = new Vehicle();
        Bicycle kendaraan2 = new Bicycle();
        MotorVehicle kendaraan3 = new MotorVehicle();
        MotorCycle kendaraan4 = new MotorCycle();
        Car kendaraan5 = new Car();
        System.out.println("--Kendaraan Pertama--");
        kendaraan1.TurnLeft();
        kendaraan1.GoStraight();
        kendaraan1.TurnLeft();
        kendaraan1.TurnRight();
        System.out.println("Warna kendaraan tersebut adalah " + kendaraan1.color +
        " dan kecepatan kendaraan tersebut adalah " +kendaraan1.speed);
        System.out.println("\n");
 
        System.out.println("--Kendaraan Kedua--");
        kendaraan2.GoStraight();
        kendaraan2.TurnLeft();
        kendaraan2.RingBell();
        kendaraan2.GoStraight();
        kendaraan2.TurnRight();
        kendaraan2.GetColor("Red");
        kendaraan2.GetSpeed(25);
        System.out.println("\n");
    
        System.out.println("--Kendaraan Ketiga--");
        System.out.println("Plat Kendaraan Ketiga " + kendaraan3.LicencePlate);
        System.out.println("Ukuran mesin kendaraan " + kendaraan3.SizeOfEngine);
        System.out.println("Pemilik mengganti plat kendaraan dan ukuran mesin menjadi : ");
        kendaraan3.GetLicencePlate("H 3271 KN");
        kendaraan3.GetSizeOfEngine(20);
        kendaraan3.GoStraight();
        kendaraan3.TurnRight();
        kendaraan3.GetColor("Gray");
        kendaraan3.GetSpeed(37);
        System.out.println("\n");
        
        System.out.println("--Kendaraan Keempat--");
        kendaraan4.GoStraight();
        kendaraan4.TurnRight();
        System.out.println("Jumlah Kopling : " +kendaraan4.GetGearFoot());
        System.out.println("Sesudah jumlah kopling diset ");
        kendaraan4.SetGearFoot(2);
        kendaraan4.GetColor("Pink");
        kendaraan4.GetSizeOfEngine(12);
        kendaraan4.GetLicencePlate("H 0162 KI");
        System.out.println("\n");
        
        System.out.println("--Kendaraan Kelima--");
        kendaraan5.TurnLeft();
        kendaraan5.GoStraight();
        kendaraan5.TurnLeft();
        System.out.println("Apakah menggunakan sabuk pengaman?" + kendaraan5.GetSeatBelt());
        System.out.println("Sesudah diset");
        kendaraan5.SetSeatBelt(true);
        kendaraan5.GetColor("Rainbow");
        kendaraan5.GetSizeOfEngine(42);
        kendaraan5.GetLicencePlate("N 5128 LG");
    }
    
}
