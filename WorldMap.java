import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created by koodilaager on 18.03.2017.
 */
public class WorldMap  {
    int mapheight ;
    int mapwidth ;


    //int [][] maptiles;


    public WorldMap() {
    }

    public void render(GameContainer gc, Graphics g, int camera_x, int camera_y, int mapheight, int mapwidth, int tilesize){
        //mapheight = 20;
        //mapwidth = 10;
        int [][] maptiles;
        maptiles = new int[mapheight][mapwidth];

        for (int i = 0; i < mapheight; i++) {
            for (int j = 0; j < mapwidth; j++) {
                maptiles[i][j] = 0;
            }
        }

        for (int i = 0; i < mapheight; i++) {
            for (int j = 0; j < mapwidth; j++) {
                if (maptiles[i][j] == 0) {                }
                    g.setColor(new Color(10, 200, 30));
                    g.fillRect( j * tilesize - camera_x,
                                i * tilesize - camera_y,
                                 tilesize, tilesize);
            }
        }
    }

}