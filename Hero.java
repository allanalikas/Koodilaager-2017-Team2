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

    float speed = 1.5f;

    float mouse_X = pos_x;
    float mouse_Y = pos_y;
    public Hero (){}


    public void update(GameContainer gc, int delta, float camera_x, float camera_y, int map_height, int map_width, int tilesize) {
        Input inp = gc.getInput();

        if (inp.isMousePressed(0b1)) {
            mouse_X = inp.getMouseX() + camera_x;
            mouse_Y = inp.getMouseY()+ camera_y;
        }
        float dy = (mouse_Y - pos_y) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
        float dx = (mouse_X - pos_x) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
        System.out.println(pos_x +" "+ map_width);
         if(pos_x +  dx > 0. && pos_x < map_width * tilesize) {
             if (mouse_X != pos_x) {
                 pos_x = pos_x + dx;
             }
         }
         System.out.println(pos_y +" "+ map_height);
         if(pos_y + dy> 0 && pos_y < map_height * tilesize) {
             if (mouse_Y != pos_y) {
                 pos_y = pos_y + dy;

             }
         }

        }
    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y){

        g.setColor(new Color(255, 255, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, 40, 45);
    }

}
