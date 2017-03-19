import jdk.nashorn.internal.objects.Global;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class OilSpill {

    int pos_x = (int)(Math.random()*2000);
    int pos_y = (int)(Math.random()*2000);
    float MoneyLeft;
    float radius;
    float id;
    float hero_xx, hero_yy;
    Money money;

    public OilSpill(float _x, float _y, int _id) {
    }

    public void update (GameContainer gc, int delta, float hero_x, float hero_y) {
        hero_xx = hero_x;
        hero_yy = hero_y;

    }

    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y, float radius) throws SlickException {
        if ((pos_x - 25 < hero_xx) && (hero_xx < pos_x + 25)){
            pos_x = (int)(Math.random()*2000);
            pos_y = (int)(Math.random()*2000);
            money = new Money();
            money.render(gc, g, pos_y, pos_x, (int)Math.random());
        }

        g.setColor(new Color(255, 255, 255));
        g.fillOval(pos_x - camera_x , pos_y - camera_y, 50, 50);

    }
}