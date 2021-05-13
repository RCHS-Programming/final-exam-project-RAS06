import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class upArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class upArrow extends Actor
{
    String arrows;
    String arrowImages;
    public upArrow(String arrowDirection, String setArrowImages) {
        arrows = setArrowImages;
        arrowImages = arrowDirection;
    }
    /**
     * Act - do whatever the upArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() - 5);
        testCatch();
    }    
    public void testCatch (){
        if(Greenfoot.isKeyDown(arrows)) {
            getWorld().removeObject(this);
            
            if(getY() > 95 && getY() < 105) {
                
            }
        }
    }
}

