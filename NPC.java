import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class NPC {

    float pos_x = 250;
    float pos_y = 250;
    float radius = 500;
    float speed = 1.5f;

    /*public void update () {
        float dy = (target_X - pos_y) / ((float) Math.sqrt((float) Math.pow(target_X - pos_x, 2) + (float) Math.pow(target_Y - pos_y, 2)) / speed);
        float dx = (target_X - pos_x) / ((float) Math.sqrt((float) Math.pow(target_X - pos_x, 2) + (float) Math.pow(target_Y - pos_y, 2)) / speed);
        System.out.println(pos_x +" "+ map_width);
            if (target_X != pos_x) {
                pos_x = pos_x + dx;
            }
        }
        System.out.println(pos_y +" "+ map_height);
            if (mouse_Y != pos_y) {
                pos_y = pos_y + dy;

            }



    }
    */

    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y) {
        g.setColor(new Color(255, 60, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, 40, 45);
    }



}
