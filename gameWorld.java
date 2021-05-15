import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameWorld extends World
{
    String directionOfArrow[] = {"down", "left", "up", "right"};
    String imageOfArrow[] = {"purpleArrowDown.png", "greenArrowLeft.png", "blueArrowUp.png", "redArrowRight.png"};
    int arrowNumber;
    int timerInterval;
    
    
    /**
     * Constructor for objects of class gameWorld.
     * 
     */
    public gameWorld()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        for(int i = 1; i < 5; i++) {
            addObject(new catchArrow(i * 90), 125 * i, 100);
        }
        for (int i = 0; i < 4; i++) {
            addObject(new upArrow(directionOfArrow[i], imageOfArrow[i]), (i+1) * 125, 590);
        }
        
        
        //Spawning Interval

          if(timerInterval >= 10) {
             arrowNumber = Greenfoot.getRandomNumber(3);
            }
           if(arrowNumber == 0) {
           addObject(new upArrow(directionOfArrow[0], imageOfArrow[0]), 125, 590);
           arrowNumber = 5;
          }
          if(arrowNumber == 1) {
           addObject(new upArrow(directionOfArrow[1], imageOfArrow[1]), 125 * 2, 590);
           arrowNumber = 5;
          }
          if(arrowNumber == 2) {
           addObject(new upArrow(directionOfArrow[2], imageOfArrow[2]), 125 * 3, 590);
           arrowNumber = 5;
          }
          if( arrowNumber == 3) {
           addObject(new upArrow(directionOfArrow[3], imageOfArrow[3]), 125 * 4, 590);
           arrowNumber = 5;
          }

        
        }
    }

