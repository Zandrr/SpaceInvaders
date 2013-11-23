import processing.core.*;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;

//javac -classpath core.jar:. Space.java && java -classpath core.jar:. Space

public class Space extends PApplet {
    public static void main(String[] args) {
	PApplet.main(new String[] { "Space" });
    }

    public Player player;
    public Missile missile;
    public Alien[] alien;

    public void setup(){

    	size(800,600);
    	//System.out.println("HEY!");
        this.player = new Player(400,600,this);
        this.missile = new Missile(this);
        this.alien = new Alien[20];

        //makin' aliens
        int numAliens = this.alien.length;
        for (int i=0; i<numAliens; i++){

            this.alien[i] = new Alien(i*50,20,5,this);
        }

    }

    public void draw(){
        background(0);
        if (this.keyPressed)
        {
            
                if (this.key == 'a')
                {
                    this.player.moveLeft();
                }
                if (this.key == 'd')
                {
                    this.player.moveRight();
                }
                if (this.key == 'w')
                {

                    this.missile.x = this.player.x+25;
                    this.missile.y = 525;
                }
      
            }
    
        for(int i=0; i<this.alien.length; i++)
        {   
            this.player.isDead(this.alien[i].x,this.alien[i].y);
            this.alien[i].hit(this.missile.x,this.missile.y);
            this.alien[i].move();
            this.alien[i].display();
            this.player.display();
                }
                    this.missile.display();
                    this.missile.move();
                
              this.text("Space Invaders!",  25,  25);
    }

}	

