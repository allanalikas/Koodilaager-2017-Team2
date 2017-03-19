import org.newdawn.slick.*;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

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

        float dy = (mouse_Y - pos_y) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);
        float dx = (mouse_X - pos_x) / ((float) Math.sqrt((float) Math.pow(mouse_X - pos_x, 2) + (float) Math.pow(mouse_Y - pos_y, 2)) / speed);

         if(pos_x +  dx > 0. && pos_x < map_width * tilesize) {
             if (Math.round(mouse_X) != Math.round(pos_x)) {
                 pos_x = pos_x + dx;
             }
         }

         if(pos_y + dy> 0 && pos_y < map_height * tilesize) {
             if (Math.round(mouse_Y) != Math.round(pos_y)) {
                 pos_y = pos_y + dy;

             }
         }

        }
    public void render(GameContainer gc, Graphics g, float camera_x, float camera_y){

        g.setColor(new Color(255, 255, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, box_width, box_height);
    }

}
