import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.particles.ConfigurableEmitter;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class NPC {

    float pos_x = 250;
    float pos_y = 250;
    float radius = 10000;
    float speed = 1.5f;
    State state = State.have_targets;
    OilSpill spill;


    public void update (ArrayList<OilSpill> spillList) {
        switch (state) {
            case harvesting:
                System.out.println("harvesting");
                harvest(spill);
                break;

            case have_target:
                System.out.println("have_target");
                spill = SelectTarget(spillList);
                state = State.moving;
                break;

            case moving:
                System.out.println("moving");
                moving();
                break;
        }

    }

    public void render (GameContainer gc, Graphics g, float camera_x, float camera_y) {
        g.setColor(new Color(255, 60, 30));
        g.fillRect(pos_x - camera_x , pos_y - camera_y, 40, 45);
    }

    public OilSpill SelectTarget(ArrayList<OilSpill> OilList){
        for(int i = 0; i < OilList.size(); i++){
            int length = (int) Math.sqrt( Math.pow((float)(OilList.get(i).pos_x - pos_x),2) + Math.pow(OilList.get(i).pos_y  - pos_y,2));
            if(length > radius){
                OilList.remove(i);
            }
        }
        Random rn = new Random();
        int answer = rn.nextInt(10) + 1;
        return OilList.get(answer);
    }


    public void harvest(OilSpill spill){
        if(Float.isNaN(spill.harvest(20,1))){
            state = State.have_target;
        }
    }


    public void moving(){

        float dy = (spill.pos_x - pos_y) / ((float) Math.sqrt((float) Math.pow(spill.pos_x - pos_x, 2) + (float) Math.pow(spill.pos_y - pos_y, 2)) / speed);
        float dx = (spill.pos_x - pos_x) / ((float) Math.sqrt((float) Math.pow(spill.pos_x - pos_x, 2) + (float) Math.pow(spill.pos_y - pos_y, 2)) / speed);

            if (spill.pos_x != pos_x) {
                pos_x = pos_x + dx;
            }
            if (spill.pos_y != pos_y) {
                pos_y = pos_y + dy;
            }
        int length = (int) Math.sqrt( Math.pow((float)(spill.pos_x - pos_x),2) + Math.pow(spill.pos_y  - pos_y,2));
            if(length < 50){
            state = State.harvesting;
            }
    }

    public enum State {
        harvesting, have_target, moving
    }

}
