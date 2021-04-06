/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author acer
 */
import java.util.*;
public class TestStack {
    static void Push(Stack stck , int x){
        stck.push(new Integer(x));
        System.out.println("push(" + x + ")");
        System.out.println("stack : " +stck);
    }
    static void Pop(Stack stck){
        System.out.println("Pop -> ");
        Integer x = (Integer) stck.pop();
        System.out.println(x);
        System.out.println("Stack : " +stck);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       Stack stck = new Stack();
       System.out.println("Stack : " + stck);
       Push(stck, 10);
       Push(stck, 20);
       Push(stck, 30);
       Pop(stck);
       Pop(stck);
       Pop(stck);
       try{
           Pop(stck);
       } catch (EmptyStackException e){
           System.out.println("Empty Stack");
       }
    }

    
    
}
