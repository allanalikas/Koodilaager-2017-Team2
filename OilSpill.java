import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class OilSpill {

    float OilSpillX = 60;
    float OilSpillY = 50;
    float MoneyLeft;
    float radius;
    float id;


    public void oil () {}

    public OilSpill(float _x, float _y, int _id) {
        OilSpillX = _x;
        OilSpillY = _y;
    }

    public void update (GameContainer gc, int delta) {



    }

    public void render (GameContainer gc, Graphics g, float OilSpillX, float OilSpillY) {

        g.setColor(new Color(0, 0, 0));
        g.fillOval(200, 200, 30,  30);

    }
}
