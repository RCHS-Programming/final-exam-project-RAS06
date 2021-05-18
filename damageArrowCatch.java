import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class damageArrowCatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class damageArrowCatch extends Actor
{
    int hitPoints = 2;
    /**
     * Act - do whatever the damageArrowCatch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        iAmOnceAgainOutsourcingYourJobs();
        
    }  
    
    public void iAmOnceAgainOutsourcingYourJobs () {
        if(isTouching(upArrow.class)) {
            removeTouching(upArrow.class);
            hitPoints -= 1;
        }
        if(hitPoints == 0) {
            Greenfoot.setWorld(new loseWorld());
        }
    }

}
