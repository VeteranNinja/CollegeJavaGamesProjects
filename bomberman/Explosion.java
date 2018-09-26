import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Animal2 
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int h;
    public void act() 
    {
        h++;
        if (h == 1)   {
        getWorld().addObject(new Explosion0(), getX()+50, getY());
        getWorld().addObject(new Explosion1(), getX()+100, getY());
        getWorld().addObject(new Explosion2(), getX()-50, getY());
        getWorld().addObject(new Explosion3(), getX()-100, getY());
        getWorld().addObject(new Explosion4(), getX(), getY()+50);
        getWorld().addObject(new Explosion5(), getX(), getY()+100);
        getWorld().addObject(new Explosion6(), getX(), getY()-50);
        getWorld().addObject(new Explosion7(), getX(), getY()-100);
        }
        if (h == 10) {
            getWorld().removeObject(this);
            return;
        }
        
        eat(Bomberman.class);
        eat(Bomberman2.class);
        eat(Bomberman3.class);
        eat(Bomberman4.class);
    }    
}
