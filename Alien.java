import processing.core.*;




public class Alien{

public float x;
public float y;
public float speed;
private PApplet canvas;
protected boolean dead = false;
	
	public Alien(float x, float y, float speed, PApplet canvas){
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.canvas = canvas;
	}


	public void move(){

		this.x+=this.speed;

		if(this.x >= 800)
		{

			this.x = 800;
			this.speed *= -1; //flip direction
			this.y += 25; //go down a row

		}
		if (this.x <= 0)
		{
			this.x = 0;
			this.speed *= -1;
			this.y +=25;
		}

	}

	public void display(){
		if(this.dead == false)
		{
		//this.canvas.fill(255,0,0);
		this.canvas.rect(this.x, this.y, 20, 20);
		}
	}

	public void hit(float nx, float ny){
		float distance = this.canvas.dist(this.x,this.y,nx,ny);

			if(distance < 20)
			{
				this.dead = true;
			}

	}






}