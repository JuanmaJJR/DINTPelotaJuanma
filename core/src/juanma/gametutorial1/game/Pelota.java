package juanma.gametutorial1.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by juan.jusue on 29/01/2018.
 */

public class Pelota {

    Texture img;
   // int x=50;
    // int y=50;

    public Pelota(){
        img= new Texture("pelota.png");
    }

    public void pintar(SpriteBatch batch,float x,float y){
        batch.draw(img,x,y);
    }
}
