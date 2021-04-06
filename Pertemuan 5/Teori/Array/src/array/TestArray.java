/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author acer
 */
import java.util.ArrayList;
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String>arrArray = new ArrayList<String>();
        System.out.println("--Menambah elemen--");
        //menambah elemen
        arrArray.add("Elemen ke - 1");
        arrArray.add("Elemen ke - 2");
        arrArray.add("Elemen ke - 3");
        arrArray.add("Elemen ke - 4");
        arrArray.add("Elemen ke - 5");
        //menampilkan elemen tambah
        System.out.println(arrArray.get(0));
        System.out.println(arrArray.get(1));
        System.out.println(arrArray.get(2));
        System.out.println(arrArray.get(3));
        System.out.println(arrArray.get(4));
        System.out.println("\n");
        
        //mengurangi elemen
        System.out.println("--Mengurangi elemen--");
        arrArray.remove(0);
        System.out.println(arrArray);
        arrArray.remove(3);
        System.out.println(arrArray);        
        System.out.println("\n");
        
        //mengedit elemen
        System.out.println("--Mengedit Elemen--");
        arrArray.set(0, "Elemen ke - 6");
        arrArray.set(2, "Elemen ke - 7");
        System.out.println(arrArray.get(0));
        System.out.println(arrArray.get(2));
        }
    }
    

