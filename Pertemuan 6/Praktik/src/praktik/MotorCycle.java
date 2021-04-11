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
public class MotorCycle extends MotorVehicle {
    private int numGear = 0;
    public MotorCycle(){
    }
    public void SetGearFoot(int newNumGear){
        numGear = newNumGear;
        System.out.println("Jumlah kopling : " +numGear);
    }
    public int GetGearFoot(){
        return numGear;
    }
}
