import org.newdawn.slick.state.*;
import org.newdawn.slick.*;


public class InGame extends BasicGameState {
    int map_height = 40;
    int map_width = 40;
    int tilesize = 50;
    float radius;
    WorldMap wmap;
    Hero hero;
    OilSpill oilspill;
    Camera main_camera;
    Money money;
    NPC npc;

    int screen_w;
    int screen_h;

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        wmap = new WorldMap();
        hero = new Hero();
        oilspill = new OilSpill(400, 400, 0);
        money = new Money();
        main_camera = new Camera(gc.getWidth(),gc.getHeight());
        npc = new NPC();
        System.out.println(screen_w);
    }

    public void update(GameContainer gc, StateBasedGame sbg, int Delta) throws SlickException{
        Input inp = gc.getInput();
        hero.update(gc,Delta,main_camera.x,main_camera.y, map_height, map_width, tilesize);
        float mousex = inp.getMouseX();
        float mousey = inp.getMouseY();
        main_camera.update(mousex,mousey,map_height,map_width,tilesize,Delta);

    }
    public void mouseMoved(int oldx,int oldy,int newx,int newy){


    }
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        wmap.render(gc, g,main_camera.x,main_camera.y, map_height, map_width, tilesize);
        hero.render(gc, g,main_camera.x,main_camera.y);
<<<<<<< HEAD
=======
        money.render(gc, g, 10);
>>>>>>> 629e9b2b1a91e5ea8c3ac5a93a8e781585d7b033
        oilspill.render(gc, g, main_camera.x, main_camera.y, radius);
        npc.render(gc, g,main_camera.x,main_camera.y);
    }

    public void mousePressed(int button, int mx, int my) {

    }

    public int getID(){
        return 0;
    }
}