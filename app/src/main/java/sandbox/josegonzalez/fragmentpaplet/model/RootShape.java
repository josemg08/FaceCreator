package sandbox.josegonzalez.fragmentpaplet.model;

import processing.core.PApplet;

/**.___
 * Created by Jose Gonzalez
 *
 * Argentina Oct 2016
 __.*/

public class RootShape extends Shape{

    public RootShape(int positionX, int positionY, String imageSrc) {
        super(positionX, positionY, imageSrc);
    }

    public void drawShape(PApplet pApplet){
        pApplet.ellipse(positionX, positionY, 130, 130);
    }

}
//.___ End of RootShape __./