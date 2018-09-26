import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion3 extends Animal2 
{
    /**
     * Act - do whatever the Explosion3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int s;
    public void act() 
    {
        s++;
        if (s == 20) {
            getWorld().removeObject(this);
            return;
        }
        eat(Bomberman.class);
        eat(Bomberman2.class);
    }    
}
