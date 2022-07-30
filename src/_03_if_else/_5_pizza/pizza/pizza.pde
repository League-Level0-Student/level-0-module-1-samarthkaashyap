
void setup() {
size(500, 500);    

fill(#FAB97C);
    ellipse(250, 250, 250, 250);
    fill(#FF0015);
    ellipse(250, 250, 230, 230);
    fill(#F9FC4C);
    ellipse(250, 250, 210, 210);
    
}
void draw() {
  PImage pepperoni = loadImage("pepperoni.png");
  PImage olive = loadImage("olive.png");
  PImage mushroom = loadImage("mushroom.png");
  pepperoni.resize(40,40);
  image(pepperoni, 200, 200);
  olive.resize(35, 35);
  image(olive, 300, 200);
  mushroom.resize(35, 35);
  image(mushroom, 250, 150);
  image(pepperoni, 300, 240);
  image(olive, 200, 300);
  image(mushroom, 150, 270);
  image(mushroom, 250, 250);

}
