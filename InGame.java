import org.newdawn.slick.state.*;
import org.newdawn.slick.*;


public class InGame extends BasicGameState {

    int camera_x = -50 ;
    int camera_y = -60 ;

    WorldMap wmap;
    Hero hero;

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        wmap = new WorldMap();
        hero = new Hero(50, 50);
    }
    public void update(GameContainer gc, StateBasedGame sbg, int Delta) throws SlickException{

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