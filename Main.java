/*
Koodilaager 18.03.2017
Team: Karl, Allan, Caspar

*/
import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends StateBasedGame {

    public static int screenW = 1000;
    public static int screenH = 600;
    Hero hero;
    OilSpill oilspill;

    public Main(String AppName){
        super(AppName);
    }

    public void initStatesList(GameContainer gc) throws SlickException {
        this.addState(new InGame());
        hero = new Hero();
        oilspill = new OilSpill();

    }

    public static void main(String[] args) {

        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Main(""));
            appgc.setDisplayMode(screenW, screenH, false);
            appgc.start();
        }
        catch (SlickException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
