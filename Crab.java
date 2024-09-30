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
    public void act()
    {
         storeUserInput();
         edgeFound();
         collison();
    }
    
    private void storeUserInput()
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
            turn(3);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            turn(-3);
        }
    }
    
    private void edgeFound()
    {
        if (isAtEdge())
        {
            turn(180);
        }
    }
    
    private void collison()
    {
        if (isTouching (Lobster.class))
        {
            getWorld().removeObject(this);
        }
    }
}
