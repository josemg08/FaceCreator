package sandbox.josegonzalez.fragmentpaplet;

import processing.core.PApplet;

/**.___
 * Created by jose on 22/09/16.
 __.*/
public class FaceContainerFragment extends PApplet {

    hexa

    @Override
    public void setup() {
        background(#cccccc);
        fill(255,0,0);
    }

    @Override
    public void draw() {}

    @Override
    public void settings() {
        size(1000, 1000);
    }

    @Override
    public void mousePressed(){
        ellipse(mouseX, mouseY, 30, 30);
    }

}
//.___ End of FaceContainerFragment __./
