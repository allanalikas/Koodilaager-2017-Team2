import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by koodilaager on 18.03.2017.
 */

public class WorldMap  {
    public int [][] maptiles;
    private HashMap<Integer, Color> colortable = new HashMap<>();

    public WorldMap() {
    }

    public void render(GameContainer gc, Graphics g, float camera_x, float camera_y, int mapheight, int mapwidth, int tilesize){


        maptiles = new int[mapheight][mapwidth];

        for (int i = 0; i < mapheight; i++) {
            for (int j = 0; j < mapwidth; j++) {
                maptiles[i][j] = 0;
            }
        }
        colortable.put(0, new Color(10, 200, 30));
        colortable.put(1, new Color(20, 195, 35));

        for (int i = 0; i < mapheight; i++) {
            for (int j = 0; j < mapwidth; j++) {
                g.setColor(colortable.get(maptiles[i][j]));
                g.fillRect(j * tilesize - camera_x,
                        i * tilesize - camera_y,
                        tilesize,
                        tilesize);
            }
        }




    }

}