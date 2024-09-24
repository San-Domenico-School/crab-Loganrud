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
           System.out.println("Enemy Added");
    
    }
    private void addFood()
    {
        //Temporary line for debugging
           System.out.println("Food Added");
    
    }
}