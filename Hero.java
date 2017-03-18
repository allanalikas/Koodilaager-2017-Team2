import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class Hero {

    float pos_x = 70;
    float pos_y = 100;

    float speed = 1;
    float direction = 0; //  ?? 0-up, 1-right, 2-down, 4-left??

    public Hero (){
    }

    public void update(GameContainer gc, int delta) {

        Input inp = gc.getInput();
        float dx = speed * delta;
        float dy = speed * delta;
        float mouse_X = inp.getMouseX();
        float mouse_y = inp.getMouseY();
        if (inp.isMousePressed(1)) {

        }

        }
    public void render (GameContainer gc, Graphics g, int camera_x, int camera_y){

        g.setColor(new Color(255, 255, 30));
        g.fillRect (pos_x, pos_y, 40, 45);
    }

}