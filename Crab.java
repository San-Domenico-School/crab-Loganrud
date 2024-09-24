import greenfoot.*;

/**
 * This class defines a crab. The crab can move, find the edge, eat fruit,
 * be hit by predators, and detect user inputs
 * 
 * @author Loganrud
 * @version 9/15/2024 12:09 PM
 */
public class Crab extends Actor
{
    private int yPostition;
    private int xPosition;
    private String currentKeyPress = "no input";
    private boolean atEdge;
    private boolean collidePredators;
    private boolean collideFruit;
    
    
    
    
    
    private void storeUserInput()
    {
        
    }
    
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-3);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(3);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            turn(1);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            turn(-1);
        } 
    }
    
    public void faceDown()
    {
        
    }
}
