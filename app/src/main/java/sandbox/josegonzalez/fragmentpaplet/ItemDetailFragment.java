package sandbox.josegonzalez.fragmentpaplet;

import processing.core.PApplet;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends PApplet {

    @Override
    public void setup() {
        fill(255,0,0);
    }

    @Override
    public void draw() {
        ellipse(30,30,30,30);
    }

    @Override
    public void settings() {
        size(1000, 1000);
    }
}
