package Sprite;

import javax.swing.*;
import java.awt.*;

public abstract class Sprite {

    protected ImageIcon img;
    protected Point relativePosition;
    protected Point absolutePosition;

    public void draw(Graphics g) {
        img.paintIcon(null, g, absolutePosition.x, absolutePosition.y);
        
    }
}
