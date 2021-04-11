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
public class Car extends MotorVehicle {
    private boolean seatbelt = false;
    public Car(){
    }
    public void SetSeatBelt(boolean newSeatBelt){
        seatbelt = newSeatBelt;
        System.out.println("Sabuk pengaman " + seatbelt);
    }
    public boolean GetSeatBelt(){
        return seatbelt;
    }
}
