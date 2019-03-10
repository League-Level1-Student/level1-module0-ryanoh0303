int y=0;
int score=0;
int x= (int) random(800);
void setup(){
  size(800,800);
  background(255,255,0);

  
  
  
}

void draw(){
  if(y>790){
   x= (int) random(800); 
   y=0;
    
  }
  background(255,255,0);
  fill(255,0,0);
  rect(mouseX,750,200, 50);
  
  y=y+10;
  fill(255,0,255);
  stroke(0,255,0);
  ellipse(x,y,100,100);
  
   
   checkCatch(x,y);
  
}
void checkCatch(int x, int y){
     if (mousePressed==true &&  Math.abs(x-mouseX)<50 && Math.abs(750-y)<50){
           score++;
           println("Your score is now: " + score);
     }
     
     else if (mousePressed==true && Math.abs(x-mouseX)>=50 && Math.abs(750-y)>=50 && score > 0) {
          score--;
          println("Your score is now: " + score);
   
     }
     else{
       
       
     }
     
      
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);}

 
  
  