import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class winSignV2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winSignV2 extends Actor
{
    /**
     * Act - do whatever the winSignV2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("t")){
            Greenfoot.setWorld(new gameWorld());
            Greenfoot.playSound("bensoundDainty-HippieMusic.mp3");
        }
    }    
}
