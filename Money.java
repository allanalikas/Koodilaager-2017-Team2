import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;


/**
 * Created by Jako on 18/03/17.
 */
public class Money {
    Image img = new Image("images/money.png");
    float i = 2000;

    public Money() throws SlickException {

    }

    public void update(GameContainer gc, int delta) {
        Input inp = gc.getInput();


    }

    public void render(GameContainer gc, Graphics g, int pos_y, int pos_x, int sum){

        g.drawImage(img, 950, 0);
        i = i - 0.1f;
        String txt = new String(Integer.toString(Math.round(i)));
        g.setColor(Color.white);
        if (sum > 0) {
            g.setColor(Color.green);
            g.translate(0, 0);
            g.scale(2, 2);
            g.drawString(txt, 425, 2);
            g.resetTransform();
        }
        if (sum < 0) {
            g.setColor(Color.red);
            g.translate(0, 0);
            g.scale(2, 2);
            g.drawString(txt, 425, 2);
            g.resetTransform();
        }
        else {
            g.scale(1,1);
            g.drawString(txt, 900, 15);
        }

    }

}
