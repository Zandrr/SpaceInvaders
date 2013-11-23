import processing.core.*;

public class Missile{

		public float x;
		public float y;
		PApplet shoot;

		public Missile(PApplet shoot)
		{
			this.shoot = shoot;
		}

		public void move()
		{
			this.y -=5;
		}

		public void display(){
			this.shoot.rect(this.x, this.y, 5,10);
		}

















}