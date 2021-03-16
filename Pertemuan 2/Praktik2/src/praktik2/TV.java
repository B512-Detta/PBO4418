/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik2;

/**
 *
 * @author acer
 */
public class TV extends Manusia{
    String Nama;
    boolean punyaTV;
    public TV(){
        
    }
    public void NamaSaya(String newnama){
        Nama = newnama;
    }
    public void BeliTV(){
        punyaTV = true;
    }
    public void jualsemuaTV(){
        punyaTV = false;
    }
    public void cekTV(boolean newpunyaTV){
        punyaTV = newpunyaTV;
    }
   
    
        
}
