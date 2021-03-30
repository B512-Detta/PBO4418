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
        GamePlayer hero1 =new GamePlayer();
        hero1.SetDimension(12, 12);
        hero1.SetPosition(10, 220);
        System.out.println("position Player= "+hero1.GetX()+","+hero1.GetY());
        hero1.Run();
        System.out.println("position Player= "+hero1.GetX()+","+hero1.GetY());
        GamePlayer hero2=new GamePlayer();
        hero2.SetDimension(12, 32);
        hero2.SetPosition(10, 10);
        
        GameEnemy monster=new GameEnemy();
        monster.SetDimension(12, 32);
        monster.SetPosition(10, 10);
        
        GameEnviroment scene = new GameEnviroment();
        scene.addPlayer(hero1);
        scene.addPlayer(hero1);
        scene.addPlayer(hero2);
        scene.getAllPlayer();
        scene.removePlayer(hero1);
        scene.getAllPlayer();
        scene.addEnemy(monster);
        scene.Interaction();


    }
    
}
