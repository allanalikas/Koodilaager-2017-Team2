import org.newdawn.slick.Input;
import org.newdawn.slick.state.*;
import java.awt.MouseInfo;
import org.newdawn.slick.*;

/**
 * Created by karl_ on 18/03/2017.
 */
public class Camera {
    float camera_x = -50 ;
    float camera_y = -60 ;
    float speed = 1.5f;
    float edge_break = 50;

    int screen_w;
    int screen_h;
    int delta2;

    public void update(float mousex, float mousey, maphei){
        Input inp = gc.getInput();
        float mousex = inp.getMouseX();
        float mousey = inp.getMouseY();
        delta2 = Delta;

        if (mousex >  screen_w-edge_break) {
            camera_x += delta2*speed;
        }
        if (mousey >  screen_h-edge_break) {
            camera_y += delta2*speed;
        }
        if (mousex < edge_break){
            camera_x -= delta2*speed;
        }
        if (mousey < edge_break) {
            camera_y -= delta2*speed;
        }
    }
}
