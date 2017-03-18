import org.newdawn.slick.Input;
import org.newdawn.slick.state.*;
import java.awt.MouseInfo;
import org.newdawn.slick.*;

/**
 * Created by karl_ on 18/03/2017.
 */
public class Camera {
    float x = -50 ;
    float y = -60 ;
    float speed = 1.5f;
    float edge_break = 50;

    int screen_w;
    int screen_h;
    public Camera(int screen_w, int screen_h){
        this.screen_w = screen_w;
        this.screen_h = screen_h;
    }
    public void update(float mousex, float mousey, int map_height, int map_width, int tilesize,int Delta){
        //System.out.println(x+" "+y+" "+mousex+" "+mousey+" "+screen_w+" "+screen_h);
        if (mousex == map_width*tilesize || mousex == 0 || mousey == 0 || mousey == map_height*tilesize){
            return;
        }else {
            if (mousex > screen_w - edge_break) {
                x += Delta * speed;
            }
            if (mousey > screen_h - edge_break) {
                y += Delta * speed;
            }
            if (mousex < edge_break) {
                x -= Delta * speed;
            }
            if (mousey < edge_break) {
                y -= Delta * speed;
            }
        }
    }
}