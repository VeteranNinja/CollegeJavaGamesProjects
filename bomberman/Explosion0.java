import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion0 extends Animal2 
{
    /**
     * Act - do whatever the Explosion0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int f;
    public void act() 
    {
        f++;
        if(f == 20) {
            getWorld().removeObject(this);
            return;
        }
        eat(Bomberman.class);
        eat(Bomberman2.class);
    }    
}
