import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Write a description of class Bomberman2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomberman2 extends Animal2
{
    /**
     * Act - do whatever the Bomberman2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int BOMBEN = 20;
    
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX()-10, getY());
        }
        
        
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX()+10, getY());
        }
        
        
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY()-10);
        }
        
        
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY()+10);
        }
        BOMBEN--;
        
        if (Greenfoot.isKeyDown("q")& BOMBEN <= 0) {          
                getWorld().addObject(new Bomb(), getX(), getY());
            BOMBEN = 20;
        }
        if (canSee(block3.class)) {
            setLocation(getX()-10, getY());
        }
        if (canSee(block2.class)) {
            setLocation(getX()+10, getY());
        }
        if (canSee(block4.class)) {
            setLocation(getX(), getY()-10);
        }
        if (canSee(block.class)) {
            setLocation(getX(), getY()+10);
        }
    }    
}
