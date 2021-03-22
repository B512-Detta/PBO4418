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
public class GameEnemy extends TestGame{
   double width;
    double height;
    int positionX;
    int positionY;
    public GameEnemy(){
    }
    public GameEnemy(double newwidth,double newheight){
        width = newwidth;
        height = newheight;
    }
    public GameEnemy(double newwidth,double newheight,int newpositionX,int newpositionY){
        width = newwidth;
        height = newheight;
        positionX = newpositionX;
        positionY = newpositionY;
    }
    public void SetDimension(double newwidth,double newheight){
        width = newwidth;
        height = newheight;
    }
    public void SetPosition(int newpositionX,int newpositionY){
        positionX = newpositionX;
        positionY = newpositionY;
    }
    public double GetWidth(){
        return width;
    }
    public double GetHeight(){
        return height;
    }
    public int GetX(){
        return positionX;
    }
    public int GetY(){
        return positionY;
    }
    public void Run(){
        System.out.println("Enemy is running");
    }
}
