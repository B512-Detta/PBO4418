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
public class GamePlayer extends TestGame {
    private double width;
    private double height;
    private int positionX;
    private int positionY;
    public GamePlayer(){
    }
    public GamePlayer(double width,double height){
        this.width = width;
        this.height = height;
    }
    public GamePlayer(double width,double height,int positionX,int positionY){
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    public void SetDimension(double width,double height){
        this.width = width;
        this.height = height;
    }
    public void SetPosition(int positionX,int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
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
        System.out.println("Player is running");
    }
    public void Run(int IncrementX){
    }   
}
