import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    private void follow()
    {
        int followFeet = (int)(Math.random() * 200);
        
        if (followFeet > 50)
        {
        turn(3);
        }
        
        if (followFeet < 50)
        {
        
        }
    }
}
