import processing.core.PApplet;

public class Sketch extends PApplet {

  int counter = width/2;
  float height2 = height/2;
  double colour = 255/height2;
  double checker = 2.8;

  int difference = height/2;
  int tendiff = difference/10;

  public void settings() {
	// put your size call here
    size(800, 800);

  }

  public void setup() {
    background(255);
  }

  public void draw() {

    int dark = 0;

    //bottom right corner, gradient
      for(int i = 0; i <= height/2; i++){
        stroke(dark);
        line(i, height, i, (height/2)); 

        dark = dark + 1;
        //System.out.println(counter);
        //counter--;
        }

    //bottom left corner

      for(int b = 8; b >= 1; b--){
        stroke(0);
        fill(255,190,0);
        ellipse(height/1.33f,height/1.14f,height/16,height/6);
        stroke(0);
        fill(255,190,0);
        ellipse(height/1.33f,height/1.6f,height/16,height/6);
        stroke(0);
        fill(255,190,0);
        ellipse(height/1.6f,height/1.33f,height/6,height/16);
        stroke(0);
        fill(255,190,0);
        ellipse(height/1.14f,height/1.33f,height/6,height/16);
        }

        stroke(0);
        fill(150,75,0);
        ellipse(height/1.33f,height/1.33f,height/10,height/10);
  
    //top left corner, lines
      for(int x = height/20; x <= height/2-(height/20);x += height/20){
        //int xcoord = x*tendiff;

        stroke(0);
        line(x,0,x,height/2);
        stroke(0);
        line(0,x,height/2,x);
      }

    //top right corner, circles
      for(int circlex = height/2 + height/12; circlex <= (height/2) + ((height/12)*5); circlex += height/12){
        stroke(0);
        ellipse(circlex, height/12, height/20, height/20);
        stroke(0);
        ellipse(circlex, (height/12)*2, height/20, height/20);
        stroke(0);
        ellipse(circlex, (height/12)*3, height/20, height/20);
        stroke(0);
        ellipse(circlex, (height/12)*4, height/20, height/20);
        stroke(0);
        ellipse(circlex, (height/12)*5, height/20, height/20);
      }
      

  }

  
  // define other methods down here.
}