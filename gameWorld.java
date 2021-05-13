import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameWorld extends World
{
    String arrows[] = {"up", "down", "left", "right"};
    String arrowImages[] = {"blueArrowUp", "purpleArrowDown", "greenArrowLeft", "redArrowRight"};
    int score = 0;
    
    
    /**
     * Constructor for objects of class gameWorld.
     * 
     */
    public gameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        for(int i = 1; i < 5; i++) {
            addObject(new catchArrow(i * 90), 125 * i, 100);
       }
       
        for (int i = 0; i < 4; i++) {
            addObject(new upArrow(arrows[i], arrowImages[i]), (i+1) * 125, 590);
       }
    }
}
