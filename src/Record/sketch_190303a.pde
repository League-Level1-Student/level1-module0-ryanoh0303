PImage pictureOfRecord;
int angle=100;

import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable



void setup(){
  minim = new Minim(this);  //in the setup method
  song = minim.loadFile("awsome.wav",512);//in the setup method
  
size(600,600);
pictureOfRecord= loadImage("71mvS9D5MQL._SX425_.jpg");
pictureOfRecord.resize(400,400);
   background(255,0,0);
  
}
void rotateImage(PImage image,int AmounttoRotate){
  translate(width/2,height/2);
  rotate(AmounttoRotate*TWO_PI/360);
  translate(-image.width/2,-image.height/2);
  
  
}
void draw(){
    background(255,0,0);
  angle+=1;
  if(mousePressed==true){
  rotateImage(pictureOfRecord,angle);
  song.play();
 
  }
  else{
   song.pause(); 
  }
   image(pictureOfRecord,100,100);
  
}