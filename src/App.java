import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(10010);
    }

    public void draw() {
        stroke(0);
        strokeWeight(30);

        fill(20, 100, 0);
        ellipse(200, 150, 75, 100);

        stroke(0);
        strokeWeight(25);

        fill(140, 0, 50);
        rect(50, 235, 50, 50);

        stroke(0);
        strokeWeight(10);

        line(75, 250, 190, 150);
        
    }
}
