import org.newdawn.slick.Input;
import org.newdawn.slick.state.*;
import java.awt.MouseInfo;
import org.newdawn.slick.*;

/**
 * Created by karl_ on 18/03/2017.
 */
public class Camera {
    float edge_break = 50;
    float x = 0 ;
    float y = 0 ;
    float speed = 1.5f;
    int screen_w;
    int screen_h;
    public Camera(int screen_w, int screen_h){
        this.screen_w = screen_w;
        this.screen_h = screen_h;
    }
    public void update(float mousex, float mousey, int map_height, int map_width, int tilesize,int Delta){
        //System.out.println(x+" "+y+" "+mousex+" "+mousey+" "+screen_w+" "+screen_h);


            if (mousex > screen_w - edge_break) {
                if (x + Delta * speed> map_width*tilesize-screen_w){
                }else {
                    x += Delta * speed;
                }
            }
            if (mousey > screen_h - edge_break) {
                if (y + Delta * speed > map_height*tilesize-screen_h) {
                }else{
                    y += Delta * speed;
                }

            }
            if (mousex < edge_break) {
                if (x - Delta * speed< 0) {
                }else {
                    x -= Delta * speed;
                }
            }
            if (mousey - Delta * speed < edge_break) {
                if (y < 0){
                }else {
                    y -= Delta * speed;
                }
            }

    }
}