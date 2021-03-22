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
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GamePlayer game1 = new GamePlayer();
        game1.SetDimension(0.6, 1.5);
        game1.SetPosition(10, 5);
        game1.GetHeight();
        game1.GetWidth();
        game1.GetX();
        game1.GetY();
        
        GameEnemy game2 = new GameEnemy();
        game2.SetDimension(0.2, 0.3);
        game2.SetPosition(7, 4);
        game2.GetHeight();
        game2.GetWidth();
        game2.GetX();
        game2.GetY();
        
        System.out.println("Game Player height is "+game1.height+" and width is "+game1.width);
        System.out.println("Game Player in position x is "+game1.positionX+" and position y is "+game1.positionY);
        
        System.out.println("Game Enemy height is "+game2.height+" and width is "+game2.width);
        System.out.println("Game Enemy in position x is "+game2.positionX+" and position y is "+game2.positionY);
    }
    
}
