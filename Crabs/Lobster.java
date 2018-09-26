import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    public void act()
    {
        turnEdge();        
        randomTurn();
        eatCrabs();
        move();
    }
    
    public void eatCrabs()
    {
        if(canSee(Crab.class))
        {
            eat (Crab.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn (20);
        }
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn (-20);
        }
    }
    
    public void turnEdge()
    {
        if (atWorldEdge())
        {
            turn(20);
        }
    }  
}
