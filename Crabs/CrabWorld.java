import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(700, 700, 1);
        populateWorld();
        setBackground("sand.jpg");
    }
    public void populateWorld()
    {
        addObject(new Crab(),50,50);
        //addObject(new Crab(),650,50);
        //addObject(new Crab(),50,650);
        //addObject(new Crab(),650,650);
        addObject(new Lobster(),350,350);
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));
        addObject(new Worm(),Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(700));  
    }
}