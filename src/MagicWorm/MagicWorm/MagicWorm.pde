
void setup(){
 
 size(800,800);
 background(0,255,0);
 
  
}

void draw(){
   background(0,255,0);
   makeMagical();
  for(int i=0; i<300; i++){
    float x= getWormX(i);
    float y= getWormY(i);
    fill(frameCount,i,i*2);
    ellipse(x,y,40,40);
 }

  
  
}

float frequency = .01;
float noiseInterval = PI*2;

void makeMagical(){
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}