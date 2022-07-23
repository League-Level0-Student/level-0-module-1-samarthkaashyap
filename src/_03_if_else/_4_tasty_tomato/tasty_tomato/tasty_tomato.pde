void setup() {
    size(500, 500);
}
void draw() {
    fill(#FA0011);
    background(200, 200, 200);
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#05FF13);
    rect(176, 103, 12, 32); 
    fill(#FFFFFF);
    if (mousePressed == true) {
      ellipse(80, 200, 50, 50);
}
}
