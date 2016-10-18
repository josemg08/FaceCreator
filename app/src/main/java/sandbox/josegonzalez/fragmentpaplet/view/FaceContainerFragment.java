package sandbox.josegonzalez.fragmentpaplet.view;

import processing.core.PApplet;
import sandbox.josegonzalez.fragmentpaplet.model.RootShape;

/**.___
 * Created by Jose Gonzalez
 *
 * Argentina Sep 2016
 __.*/
public class FaceContainerFragment extends PApplet {

    private int backgroundColor = 0xCEBCB1;

    private RootShape rootShape;

    @Override
    public void setup() {
        fill(255,0,0);
        rootShape = new RootShape(120, 120, "");
    }

    @Override
    public void draw() {
        background(backgroundColor);
        rootShape.drawShape(this);
    }

    @Override
    public void settings() {
        size(1000, 1000);
    }

    /*@Override
    public void mousePressed(){
        ellipse(mouseX, mouseY, 30, 30);
    }*/

}
//.___ End of FaceContainerFragment __./
