package juanma.gametutorial1.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by juan.jusue on 29/01/2018.
 */

public class Game {
    Pelota pelota;

    public Game(){
        pelota = new Pelota();
    }

    public void pintar(SpriteBatch batch, float x, float y){
        pelota.pintar(batch,x,y);
    }
}
