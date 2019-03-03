int y=0;
int score=0;
int x= (int) random(width);
void setup(){
  size(800,800);
  background(255,255,0);
  System.out.println(x);
  
  
  
}

void draw(){
  background(255,255,0);
  fill(255,0,0);
  rect(mouseX,750,200, 50);
  
  y=y+3;
  fill(255,0,255);
  stroke(0,255,0);
  ellipse(x,y,100,100);
   
   checkCatch(x,y);
  
}
void checkCatch(int x, int y){
     if (mousePressed==true &&  Math.abs(x-mouseX)<50 && Math.abs(750-y)<20){
          score++;
           println("Your score is now: " + score);
     }
     else if(mousePressed==false){
      score=score; 
       
     }
     else if (score > 0) {
          score--;
     println("Your score is now: " + score);
   
     }
      
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);}
