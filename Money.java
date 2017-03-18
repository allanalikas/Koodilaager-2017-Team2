import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.lang.Object.*;
import org.newdawn.slick.gui.TextField;


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

    public void render(GameContainer gc, Graphics g, int sum){

        g.drawImage(img, 950, 0);

        String txt = new String(Integer.toString(Math.round(i)));

        if (sum > 0) {
            i = i + sum;
            g.setColor(Color.green);
            g.translate(0, 0);
            g.scale(2, 2);
            g.drawString(txt, 425, 2);
            g.resetTransform();
        }
        else if (sum < 0) {
            i = i + sum;
            g.setColor(Color.red);
            g.translate(0, 0);
            g.scale(2, 2);
            g.drawString(txt, 425, 2);
            g.resetTransform();
        }
        else {
            g.setColor(Color.white);
            i = i - 0.1f;
            g.scale(1,1);
            g.drawString(txt, 900, 15);
        }

    }

}
