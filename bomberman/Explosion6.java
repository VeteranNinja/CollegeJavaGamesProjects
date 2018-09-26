import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion6 extends Animal2 
{
    /**
     * Act - do whatever the Explosion6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int e;
    public void act() 
    {
        e++;
        if (e == 20) {
            getWorld().removeObject(this);
            return;
        }
        eat(Bomberman.class);
        eat(Bomberman2.class);
    }    
}
