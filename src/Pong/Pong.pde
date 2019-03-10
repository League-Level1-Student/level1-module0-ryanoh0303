import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int x=50;
int y=150;
int speedforx=20;
int speedfory=20;

void setup(){
  
minim = new Minim (this);
sound = minim.loadSample("pong.wav", 128);
  size(800,800);
 backgroundImage=loadImage("photo.jpeg");
  
  
  
}

void draw(){image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
   
  fill(0,0,255);
  stroke(0,0,0);
  ellipse(x,y,100,100);
  
  fill(0,255,0);
  rect(mouseX,780,200,20);
  
  y=y+speedfory;
 
    x=x+speedforx;
     
  if(x<=5 || x>=790){
    speedforx=-speedforx;  
     
   }
   if(y<=5 || y>=791){
     sound.trigger();
     speedfory=-speedfory;

   }
  if(intersects(x,y,mouseX,780,200)==true){
    sound.trigger();
     speedforx=-speedforx;
     speedfory=-speedfory;
    
  }

}  
 boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}