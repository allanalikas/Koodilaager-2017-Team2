import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class Hero {

    float pos_x = 70;
    float pos_y = 100;

    float speed = 1;
    float direction = 0; //  ?? 0-up, 1-right, 2-down, 4-left??

    public Hero (float _x, float _y){
        pos_x = _x;
        pos_y = _y;
    }
    public void update(GameContainer gc, int delta) {


    }
    public void render (GameContainer gc, Graphics g, int camera_x, int camera_y){

        g.setColor(new Color(255, 255, 30));
        g.fillRect (90, 90, 40, 45);
    }

}