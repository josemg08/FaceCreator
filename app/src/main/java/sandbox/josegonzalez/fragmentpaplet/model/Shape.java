package sandbox.josegonzalez.fragmentpaplet.model;

/**
 * Created by jose on 17/10/16.
 */

public abstract class Shape {

    int positionX;
    int positionY;

    String imageSrc;

    public Shape(int positionX, int positionY, String imageSrc){
        this.positionX = positionX;
        this.positionY = positionY;
        this.imageSrc = imageSrc;
    }

}
