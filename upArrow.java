import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class upArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   public class upArrow extends Actor
{
     int gameTimer;
    
     String directionOfArrow[] = {"down", "left", "up", "right", "invis"};
     String imageOfArrow[] = {"purpleArrowDown.png", "greenArrowLeft.png", "blueArrowUp.png", "redArrowRight.png", "literallyAnOrangeDot.png"};
     String arrows;
     String arrowImgs;
     
     public boolean addPoint = false;
     
     int arrowNumber = 5;
     int timerInterval = 0;
    
     public boolean arrowPressed;
     public upArrow(String arrowDirection, String arrowImages) {
        arrows = arrowDirection;
        arrowImgs = arrowImages;
        setImage(arrowImgs);
        
        arrowPressed = false;
      }
      
     /**
      * Act - do whatever the upArrow wants to do. This method is called whenever
      * the 'Act' or 'Run' button gets pressed in the environment.
      */
     public void act() 
     {
        setLocation(getX(), getY() - 5);
        spawnNew();
        testCatch();
     }    
    
    
     public void spawnNew() {
          timerInterval++;
          if(timerInterval >= 80) {
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
    
     public void spawnNewDebugging() {
          
          arrowNumber = Greenfoot.getRandomNumber(4);
    
            
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
     
       getWorld().removeObject(this);
        
     }
    
     public void testCatch (){
        if(Greenfoot.isKeyDown(arrows) && arrowPressed == false) {
            arrowPressed = true;
        }
        if(getY() > 90 && getY() < 105 && arrowPressed) {
              setImage(imageOfArrow[4]);
              addPoint = true;
              arrowPressed = false;
              setLocation(getX(), 1);
              victoryAndFailure();
                       }
        if(arrowPressed && !!Greenfoot.isKeyDown(arrows)){
             arrowPressed = false;
         }
        if(getY() < 20) {
            destroyOld();
        }
     }
    
     public void victoryAndFailure () {
        
        //
        
       }
     
      }


