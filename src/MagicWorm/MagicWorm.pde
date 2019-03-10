
void setup(){
 
 size(800,800);
 background(0,255,0);
 
  
}

void draw(){
   background(0,255,0);
  for(int i=0; i<300; i++){
    float x= (float) random(800);
    float y= (float) random(800);
    fill(255,0,0);
    ellipse(x,y,20,20);
  }

  
  
}

float frequency = .001;
float noiseInterval = PI;

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