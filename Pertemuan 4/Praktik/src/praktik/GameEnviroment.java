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
import java.util.ArrayList;
public class GameEnviroment extends TestGame {
    private double width;
    private double height;
    private ArrayList<GamePlayer>arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy>arrEnemy = new ArrayList<GameEnemy>();
    
    public GameEnviroment(){    
    }
    public GameEnviroment(double width,double height){
        this.width = width;
        this.height = height;
    }
    public void addPlayer(GamePlayer newPlayer ){
        //GamePlayer newPlayer = new GamePlayer();
        arrPlayer.add(newPlayer);
    }
    public void removePlayer(GamePlayer newPlayer){
        //GamePlayer newPlayer = new GamePlayer();
        arrPlayer.remove(newPlayer);
    }
    public void getAllPlayer(){
        GamePlayer newPlayer = new GamePlayer();
        arrPlayer.contains(newPlayer);
    }
    public void addEnemy(GameEnemy newEnemy){
        //GameEnemy newEnemy = new GameEnemy();
        arrEnemy.add(newEnemy);
    }
    public void removeEnemy(GameEnemy newEnemy){
        //GameEnemy newEnemy = new GameEnemy();
        arrEnemy.remove(newEnemy);
    }
    public void getAllEnemy(){
        GameEnemy newEnemy = new GameEnemy();
        arrEnemy.contains(newEnemy);
    }
    public void Interaction(){
        if (arrPlayer == null|arrEnemy == null){
            System.out.println("Player or Enemy not sets");
        }
        for(int i = 0; i < arrPlayer.size(); i++){
            for(int j = 0; j < arrEnemy.size(); j++){
                if (arrPlayer.get(i).GetX() != arrEnemy.get(j).GetY()){
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position");
                }
                if (EuclideanDistance(arrPlayer.get(i).GetX(), arrPlayer.get(i).GetY(), arrEnemy.get(j).GetX(), arrEnemy.get(j).GetY()) < 2){
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                }
                else{
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("\ncurrent x position =  " + arrPlayer.get(i).GetX() +" <==");
                }
            }
        }
    }
    public double EuclideanDistance(int x1,int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
