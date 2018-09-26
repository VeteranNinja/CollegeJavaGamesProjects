import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion4 extends Animal2 
{
    /**
     * Act - do whatever the Explosion4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int w;
    public void act() 
    {
        w++;
        if (w == 20) {
            getWorld().removeObject(this);
            return;
        }
        eat(Bomberman.class);
        eat(Bomberman2.class);
    }    
}
