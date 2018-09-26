import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rExplosion2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion2 extends Animal2 
{
    /**
     * Act - do whatever the Explosion2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a;
    public void act() 
    {
        a++;
        if (a == 20) {
            getWorld().removeObject(this);
            return;
        }
        eat(Bomberman.class);
        eat(Bomberman2.class);
    }    
}
