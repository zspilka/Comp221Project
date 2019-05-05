//import comp124graphics.Image;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

/**The basic parent class "Feature," which all subclasses will use.
 * Subclasses will need to create their own "createSpriteList" function
 * to be able to be instantiated.*/

abstract public class Feature {

    //the variables include the sprite (image that appears on the canvas),
    //the size of the sprite on the canvas,
    //and a list of all the possible images that the sprite can appear as

    protected ImageIcon sprite;
    protected int size;
    protected ArrayList<ImageIcon> spriteList = new ArrayList<>(9);          //since all spriteLists will be different, the variable is empty here
//    protected Map <String, Image> spriteList;     //spriteList may be used as a Map

    protected Random random = new Random();   //this object will be used to generate random numbers

    Feature() {                 //all subclasses of Feature will automatically have to create their spriteList
//        spriteList = new ArrayList<>();
        createSpriteList();     //and randomize their size and sprite when created, so these have been permanently
        randomizeSize();        //added to the Feature constructor (which the subclasses will use)
        randomizeSprite();
    }

    abstract protected void createSpriteList();     //since every spriteList will be different between
                                                    //the subclasses of Feature, there's no point in
                                                    //defining createSpriteList here

    protected void randomizeSprite() {                  //randomizeSprite uses the variable 'random' to create
        int index = random.nextInt(spriteList.size());  //a random integer less than or equal to the size of
        sprite = spriteList.get(index);                 //spriteList. The sprite variable is then assigned to
    }                                                   // the Image in spriteList at that index

    protected void randomizeSpriteRange(int minLimit, int maxLimit) {
        int index = random.nextInt(maxLimit) + minLimit;
        sprite = spriteList.get(index);
    }


    protected void randomizeSize() {                    //the variable 'random' is used again in randomizeSize
        size = random.nextInt();          //to choose a random decimal between 0 and 1 to represent
    }                                                   //the sprite's size (we can change the range later)

    protected void randomizeSizeRange(int minLimit, int maxLimit) {
        size = random.nextInt(maxLimit) + minLimit;
    }

    protected void randomizeAll() {                     //a simple method that calls all randomizing functions
        randomizeSize();                                //in the Feature class. This can be overridden in any
        randomizeSprite();                              //subclasses that end up having extra randomizing methods
    }

    /**Getter functions*/                               //right now, there's no reason to let other classes set
                                                        //any of the variables, so only "getter" functions have
    public ImageIcon getSprite() {                          //been written
        return sprite;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<ImageIcon> getSpriteList(){
        return spriteList;
    }

    public void printSprite(){
        System.out.println(spriteList.toString());
    }

    public ImageIcon getRandomSprite(){
        randomizeSprite();
        return sprite;
    }
}