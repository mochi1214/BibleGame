package GameView;

import java.awt.*;
import java.util.ArrayList;
import Sprite.*;

import javax.swing.*;

public abstract class GameView {

    protected ArrayList<Sprite> elements;
    protected Door door;
    protected ImageIcon img;

    public void drawView(Graphics g) {
        img.paintIcon(null, g, 0, 0);
        for (Sprite s: elements) {
            s.draw(g);
        }
    }
}
