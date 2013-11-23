import processing.core.*;
//import java.awt.event.KeyEvent;


public class Player{

    public float x;
    public float y;
    private PApplet shape;
    protected boolean dead = false;

    public Player(float x, float y, PApplet shape){
        this.x = x;
        this.y = y;
        this.shape = shape;

    }

    public void moveLeft(){
        if(this.x <= 0){
            this.x = this.x;
        }
        else
        {
            this.x -=5;
        }
    }

    public void moveRight(){
        if(this.x >= 750)
        {
         this.x = this.x;
        }
        else
        {
        this.x +=5;
        }
    }

    public void display(){
        //this.shape.fill(50,50);
        if(this.dead == false)
        {
        this.shape.rect(x,550,50,50);
        }
    }

    public void isDead(float nx, float ny)
    {
        float distance = this.shape.dist(this.x,this.y,nx,ny);

        if (distance < 100)
        {
            this.dead = true;
        }

    }



}
