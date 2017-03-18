import org.newdawn.slick.state.*;
import java.awt.MouseInfo;
import org.newdawn.slick.*;


public class InGame extends BasicGameState {

    int camera_x = 0 ;
    int camera_y = 0 ;

    WorldMap wmap;
    Hero hero;

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        wmap = new WorldMap();
        hero = new Hero();
    }
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        wmap.render(gc, g, camera_x, camera_y);
        hero.render(gc, g, camera_x, camera_y);
    }

    public void mousePressed(int button, int mx, int my) {

    }

    public int getID(){
        return 0;
    }
}