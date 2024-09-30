import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    int i = 0;
    public void act()
    {
        walk();
        edgeFound();
        collison();
    }
    
    private void walk()
    {
        Greenfoot.setSpeed(50);
        
        if (i == 60)
        {
            rotateRandom();
            i = 0;
        }
        move(4);
        
        i++;
        
    }
    
    private void rotateRandom()
    {
        turn((int)(100 * Math.random()-5));
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
        if (isTouching (Crab.class))
        {
            move(0);
        }
    }
}
