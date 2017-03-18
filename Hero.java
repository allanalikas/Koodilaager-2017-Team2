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

    float speed = 1.5f;
    float direction = 0; //  ?? 0-up, 1-right, 2-down, 4-left??

    float mouse_X = pos_x;
    float mouse_Y = pos_y;
    public Hero (){}


    public void update(GameContainer gc, int delta, int camera_x, int camera_y) {
        Input inp = gc.getInput();


        if (inp.isMousePressed(0b0)) {
            mouse_X = inp.getMouseX() + camera_x;
            mouse_Y = inp.getMouseY()+ camera_y;
            System.out.print(mouse_X);
            System.out.print(" - ");
            System.out.println(mouse_Y);

            System.out.println("munni");
        }

        if (mouse_X != pos_x) {
            float dx = (mouse_X - pos_x) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
            pos_x = pos_x + dx;
        }
        if (mouse_X != pos_x) {
            float dy = (mouse_Y - pos_y) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
            pos_y = pos_y + dy;
        }


        }
    public void render (GameContainer gc, Graphics g, int camera_x, int camera_y){

        g.setColor(new Color(255, 255, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, 40, 45);
    }

}
