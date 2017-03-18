import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by koodilaager on 18.03.2017.
 */

public class WorldMap {
    private int mapheight ;
    private int mapwidth ;

    public final int heightstep = 10;
    public final int tilesize = 50;

    public int [][] maptiles;

    private HashMap<Integer, Color> colortable = new HashMap<>();

    public WorldMap() {
        mapheight = 100;
        mapwidth = 100;

        maptiles = new int[mapheight][mapwidth];

        for (int i = 0; i < mapheight; i++) {
            for (int j = 0; j < mapwidth; j++) {
                maptiles[i][j] = 0;
            }
        }

        colortable.put(0, new Color(10, 200, 30));
        colortable.put(1, new Color(20, 195, 35));
    }
    public void render(GameContainer gc, Graphics g, int camera_x, int camera_y){
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