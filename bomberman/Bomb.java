import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Write a description of class Bombe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Animal2
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int z;
    public void act()  
    {
         z++;
         
         if (z == 45) {
            getWorld().addObject(new Explosion(), getX(), getY());
         }
         
         if(z == 50) {
             getWorld().removeObject(this);
         }
   
   
         
    }    
}
