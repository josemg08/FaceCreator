package sandbox.josegonzalez.fragmentpaplet;

import processing.core.PApplet;
import shiffman.box2d.Box2DProcessing;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends PApplet {

    private Box2DProcessing box2d;

    @Override
    public void setup() {
        fill(255,0,0);
        box2d = new Box2DProcessing(this);
        box2d.createWorld();
        box2d.listenForCollisions();
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
