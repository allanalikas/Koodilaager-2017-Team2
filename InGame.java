import org.newdawn.slick.state.*;
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
        hero = new Hero(50, 50);
        screen_h = gc.getHeight();
        screen_w = gc.getWidth();

    }
    public void update(GameContainer gc, StateBasedGame sbg, int Delta) throws SlickException{
        Input inp = gc.getInput();
        System.out.println(camera_x+" "+camera_y+" "+edge_break);
        float mousex = inp.getMouseX();
        float mousey = inp.getMouseY();
        delta2 = Delta;
        if (mousex >  screen_w-edge_break) {
            camera_x += delta2*speed*(edge_break/mousex);
        }
        if (mousey >  screen_h-edge_break) {
            camera_y += delta2*speed;
        }
        if (mousex < edge_break){
            camera_x -= delta2*speed;
        }
        if (mousey < edge_break) {
            camera_y -= delta2 * speed;
        }
    }

    public void mouseMoved(int oldx,int oldy,int newx,int newy){
        /*
           if (newx <  screen_w && newx > screen_w-20) {
               camera_x -= delta2*speed;
           }
           if (newy <  screen_h && newy > screen_h-20) {
               camera_y -= delta2*speed;
           }
           if (newx > 0 && newx < 20){
               camera_x += delta2*speed;
           }
           if (newy > 0 && newy < 20){
               camera_y += delta2*speed;
        }
        if (newx >  screen_w-edge_break) {
            camera_x += delta2*speed;
        }
        if (newy >  screen_h-edge_break) {
            camera_y += delta2*speed;
        }
        if (newx < edge_break){
            camera_x -= delta2*speed;
        }
        if (newy < edge_break) {
            camera_y -= delta2 * speed;
        }
        */

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