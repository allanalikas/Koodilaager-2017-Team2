import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class Hero{

    float pos_x = 70;
    float pos_y = 100;

    int box_height = 40;
    int box_width = 40;

    float speed = 1.5f;

    float mouse_X = pos_x;
    float mouse_Y = pos_y;
    public Hero (){}


    public void update(GameContainer gc, int delta, float camera_x, float camera_y, int map_height, int map_width, int tilesize) {
        Input inp = gc.getInput();

        int height = map_height * tilesize;
        int width = map_width * tilesize;

        if (inp.isMousePressed(0b1)) {
            if (((inp.getMouseX() + camera_x) > (width - box_width))){
                mouse_X = width - box_width;
            }
            else if (((inp.getMouseX() + camera_x) < 0)) {
                mouse_X = 0;
            }
            else {
                mouse_X = inp.getMouseX() + camera_x;
            }

            if (((inp.getMouseY() + camera_y) > (height - box_height))){
                mouse_Y = height - box_height;
            }
            else if (((inp.getMouseY() + camera_y) < 0)) {
                mouse_Y = 0;
            }
            else {
                mouse_Y = inp.getMouseY() + camera_y;
            }
        }

        if (Math.round(mouse_X) != Math.round(pos_x)) {
            float dx = (mouse_X - pos_x) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
            pos_x = pos_x + dx;
        }
        if (Math.round(mouse_Y) != Math.round(pos_y)) {
            float dy = (mouse_Y - pos_y) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
            pos_y = pos_y + dy;
        }


        }
<<<<<<< HEAD
    public void render(GameContainer gc, Graphics g, int camera_x, int camera_y){
=======
    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y){
>>>>>>> c53d63570d1a221cacdbe1f39323d3bd83063b4a

        g.setColor(new Color(255, 255, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, box_width, box_height);
    }

}
