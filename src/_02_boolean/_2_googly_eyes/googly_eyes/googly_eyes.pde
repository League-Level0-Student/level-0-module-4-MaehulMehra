PImage face;
void setup() {
  face = loadImage ("index.jpeg");
  size (800, 600);
  face.resize (width, height);
}
int minX = 280;
int minY = 94;
int maxX = 320;
int maxY = 184;
int leftX = 300;
int leftY = 140;
void draw() {
  background (face);
  if (mousePressed) {
  println (mouseX + "," + mouseY);
  }
  fill (250, 250, 250);
  ellipse (300, 140, 100, 150);
  if (mouseX < minX){
   leftX = minX; 
  }
  else if (mouseX > maxX){
    leftX = maxX;
  }
  else {
   leftX = mouseX; 
  }
  if (mouseY < minY){
   leftY = minY;
  }
  else if (mouseY > maxY){
   leftY = maxY; 
  }
  else { 
    leftY = mouseY;
  }
  fill (0);
  ellipse (leftX, leftY, 50, 50);
  fill (250, 250, 250);
  ellipse (400, 150, 100, 150);
  fill (0);
  ellipse (leftX + 100, leftY + 20, 50, 50);
}
