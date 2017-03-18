import org.newdawn.slick.*;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.lang.Object.*

/**
 * Created by Jako on 18/03/17.
 */
public class Money {
    Image img = new Image("images/money.png");


    public Money() throws SlickException {

    }
    public void init(){

    }

    public void update(GameContainer gc, int delta) {
        Input inp = gc.getInput();


    }

    public void render(GameContainer gc, Graphics g){
        g.drawImage(img, 950, 0);
    }

}
