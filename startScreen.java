import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends World
{

    /**
     * Constructor for objects of class startScreen.
     * 
     */
    public startScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        showText("Welcome to:", 90, 50);
        addObject(new winSignV2(), 300, 110);
        
        showText("Click the arrow keys the correspond to arrows that correspond", 300, 200);
        showText("with the catcher-arrow. Be sure you don't miss any arrows!", 300, 225);
        showText("You get a random number of lives (for extra unease), and you", 300, 250);
        showText("lose one whenever an arrow gets passed the catchers. The goal", 300, 275);
        showText("is to survive for a minute and a half (or about as close I", 300, 300);
        showText("(could get, seeing as I didn't know the frame rate). Good luck,", 300, 325);
        showText("and happy rip-off games!", 300, 350);
        showText("Type \"Yeet\" to start!", 300, 500);
        
        
    }
}
