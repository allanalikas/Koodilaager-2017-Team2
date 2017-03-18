import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class OilSpill {

    float pos_x;
    float pos_y;
    float MoneyLeft;
    float radius;
    float id;


    public OilSpill(float _x, float _y, int _id) {
        pos_x = _x;
        pos_y = _y;
        id = _id;
    }

    public void update (GameContainer gc, int delta) {



    }

    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y) {

        g.setColor(new Color(255, 255, 255));
        g.fillOval(pos_x - camera_x , pos_y - camera_y, 50, 50);

    }
}