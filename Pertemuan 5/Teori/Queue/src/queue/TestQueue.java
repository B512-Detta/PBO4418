/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author acer
 */
import java.util.LinkedList;
import java.util.Queue;
public class TestQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<Integer> queue = new LinkedList<>();
        //menambah elemen
        for (int i = 0 ; i<5 ; i++){
            queue.add(i);
        }
        System.out.println("Elemen Queue : " +queue);
        //melihat kepala elemen
        int y = queue.peek();
        System.out.println("Kepala Elemen : " + y);
        //mengurangi elemen
        int x = queue.remove();
        System.out.println("Elemen yang Terhapus : " + x);
        System.out.println(queue);
        //melihat kepala elemen setelah dikurangi
        int z = queue.peek();
        System.out.println("Kepala Elemen Saat Ini: " + z);
        //mengedit elemen
    }
    
}
