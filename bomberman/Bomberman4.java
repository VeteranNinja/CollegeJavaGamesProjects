import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Write a description of class Bomberman3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomberman4 extends Animal2
{
    /**
     * Act - do whatever the Bomberman3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int BOMBEN = 20;
    
    public void act() 
    {
        
        if (Greenfoot.isKeyDown("f")) {
            setLocation(getX()-10, getY());
        }
        
        
        if (Greenfoot.isKeyDown("h")) {
            setLocation(getX()+10, getY());
        }
        
        
        if (Greenfoot.isKeyDown("t")) {
            setLocation(getX(), getY()-10);
        }
        
        
        if (Greenfoot.isKeyDown("g")) {
            setLocation(getX(), getY()+10);
        }
        BOMBEN--;
        
        if (Greenfoot.isKeyDown("r")& BOMBEN <= 0) {          
                getWorld().addObject(new Bomb(), getX(), getY());
            BOMBEN = 20;
        }
        if (canSee(block3.class)) {                   //if touch wallLeft, move person left
            setLocation(getX()-10, getY());
        }
        if (canSee(block2.class)) {
            setLocation(getX()+10, getY());
        }
        if (canSee(block4.class)) {                   //if touching wallU, move person up
            setLocation(getX(), getY()-10);
        }
        if (canSee(block.class)) {
            setLocation(getX(), getY()+10);
        }
    }    
}
