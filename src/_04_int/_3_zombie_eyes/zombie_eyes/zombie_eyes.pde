
void setup() {
PImage face = loadImage("icture.png");
size(600, 600);
face.resize(600, 600);
image(face, 0, 0);
}
void draw() {
fill(255, mouseX, mouseY);
ellipse(200, 290, 100, 100);
ellipse(400, 290, 100, 100);
fill(0, 0, 0);
ellipse(400, 290, 20, 20);
ellipse(200, 290, 20, 20);
}
