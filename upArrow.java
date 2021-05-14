import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class upArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  public class upArrow extends Actor
  {
    String directionOfArrow[] = {"down", "left", "up", "right"};
    String imageOfArrow[] = {"purpleArrowDown.png", "greenArrowLeft.png", "blueArrowUp.png", "redArrowRight.png"};
    String arrows;
    String arrowImgs;
    
    int score = 0;
    int arrowNumber = 5;
    int timerInterval = 0;
    
    public boolean upPressed;
    public boolean downPressed;
    public boolean rightPressed;
    public boolean leftPressed;
    public upArrow(String arrowDirection, String arrowImages) {
        arrows = arrowDirection;
        arrowImgs = arrowImages;
        setImage(arrowImgs);
        
        upPressed = false;
        downPressed = false;
        rightPressed = false;
        leftPressed = false; 
    }
    /**
     * Act - do whatever the upArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() - 5);
        testCatch();
        spawnNew();
        destroyOld();
    }    
    public void testCatch (){
        if(Greenfoot.isKeyDown(arrows)) {
            if(getY() > 95 && getY() < 105) {
              getWorld().removeObject(this);
              score = score + 5;
             
            }
        }
    }
    
    public void spawnNew() {
          timerInterval++;
          if(timerInterval >= 100) {
             arrowNumber = Greenfoot.getRandomNumber(4);
             timerInterval = 0;
            }
           if(arrowNumber == 0) {
            getWorld().addObject(new upArrow(directionOfArrow[0], imageOfArrow[0]), 125, 590);
            arrowNumber = 5;
            timerInterval = 0;
          }
          if(arrowNumber == 1) {
            getWorld().addObject(new upArrow(directionOfArrow[1], imageOfArrow[1]), 125 * 2, 590);
            arrowNumber = 5;
            timerInterval = 0;
          }
          if(arrowNumber == 2) {
            getWorld().addObject(new upArrow(directionOfArrow[2], imageOfArrow[2]), 125 * 3, 590);
            arrowNumber = 5;
            timerInterval = 0;
          }
          if( arrowNumber == 3) {
            getWorld().addObject(new upArrow(directionOfArrow[3], imageOfArrow[3]), 125 * 4, 590);
            arrowNumber = 5;
            timerInterval = 0;
          }   
    }
    
    public void destroyOld() {
        if(getY() < 20) {
          getWorld().removeObject(this);
        }
    }
    }


