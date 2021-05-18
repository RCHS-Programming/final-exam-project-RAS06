import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class catchArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class catchArrow extends Actor
{
    int turn;
    int gameTimer;
    /**
    * 
    */
    public catchArrow(int turnValue) {
        turn = turnValue;
        turn(turn);
     }
    /**
     * Act - do whatever the catchArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        iAmLiterallyOutsourcingYourJobsToAnotherClassBecauseYouKeepInterfereing();
    }   
    public void iAmLiterallyOutsourcingYourJobsToAnotherClassBecauseYouKeepInterfereing() {
        gameTimer++;
        //System.out.println(gameTimer);
        getWorld().showText("Time Survived:" + gameTimer/25, 80, 20);
        
        
        if(gameTimer / 25 >= 90) {
         Greenfoot.setWorld(new winWorld());    
        }
    }
}
