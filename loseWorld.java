import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class loseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loseWorld extends World
{

    /**
     * Constructor for objects of class loseWorld.
     * 
     */
    public loseWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        showText("You lost, better luck next time.", 300, 120);
        addObject(new winSign(), 300, 210);
    }
}
