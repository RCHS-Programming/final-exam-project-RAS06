import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameWorld extends World
{

    /**
     * Constructor for objects of class gameWorld.
     * 
     */
    public gameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        for(int i = 1; i < 5; i++) {
            //addObject(new catchArrow(90), 125 * i, 100);
       }
    }
}
