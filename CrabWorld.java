import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
    private void prepareScene()
    {
        addPlayer();
        addFood();
        addEnemy();
    }
    private void addPlayer()
    {
        //instantiate new objects
        Crab crab = new Crab( );
        
        // add the to the world
        addObject(crab, 470, 100);
        
        
    
    }private void addEnemy()
    {
        //Temporary line for debugging
        Lobster lobster = new Lobster();
        addObject(lobster, (int)(Math.random() * 560), (int)(Math.random() * 560));
        
    
    }
    private void addFood()
    {
        //Temporary line for debugging
        Worm worm1 = new Worm();
        addObject(worm1, (int)(Math.random() * 560), (int)(Math.random() * 560));
        Worm worm2 = new Worm();
        addObject(worm2, (int)(Math.random() * 560), (int)(Math.random() * 560));
        Worm worm3 = new Worm();
        addObject(worm3, (int)(Math.random() * 560), (int)(Math.random() * 560));
        Worm worm4 = new Worm();
        addObject(worm4, (int)(Math.random() * 560), (int)(Math.random() * 560));
        Worm worm5 = new Worm();
        addObject(worm5, (int)(Math.random() * 560), (int)(Math.random() * 560));
    }
}