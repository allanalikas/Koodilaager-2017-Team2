import org.newdawn.slick.state.*;
import java.awt.MouseInfo;
import org.newdawn.slick.*;


public class InGame extends BasicGameState {

    int camera_x = -50 ;
    int camera_y = -60 ;
    float speed = 1.0f;
    int edge_break = 50;

    WorldMap wmap;
    Hero hero;

    int screen_w;
    int screen_h;
    int delta2;
    int xxx;
    int yyy;

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        wmap = new WorldMap();
        hero = new Hero();
        screen_h = gc.getHeight();
        screen_w = gc.getWidth();

    }

    public void update(GameContainer gc, StateBasedGame sbg, int Delta) throws SlickException{
        Input inp = gc.getInput();
        hero.update(gc,Delta,camera_x,camera_y);
        float mousex = inp.getMouseX();
        float mousey = inp.getMouseY();
        delta2 = Delta;
    }
    public void mouseMoved(int oldx,int oldy,int newx,int newy){


    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        wmap.render(gc, g,camera_x,camera_y);
        hero.render(gc, g,camera_x,camera_y);
    }

    public void mousePressed(int button, int mx, int my) {

    }

    public int getID(){
        return 0;
    }
}