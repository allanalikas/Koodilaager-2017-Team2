import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class NPC {

    float pos_x = 250;
    float pos_y = 250;

    float speed = 1.5f;

    public void update () {

    }

    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y) {
        g.setColor(new Color(255, 60, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, 40, 45);
    }



}
