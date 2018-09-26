import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import javax.swing.JOptionPane;

/**
 * This class defines a crab. Crabs live on the beach. They like sand worms 
 * (very yummy, especially the green ones).
 */
public class Crab extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    
    public Crab()
    {
        image1 = new GreenfootImage("crab.png");
        image2 = new GreenfootImage("crab2.png");
        setImage(image1);
        wormsEaten=0;
    }
    
    public void act()
    {
        switchImage();        
        turnEdge();
        eatWorms();
        keyCheckPress();
        move();
    }
    
    public void switchImage()
    {
        if (getImage()==image1)
        {
            setImage(image2);
        }
        else
        {
            setImage(image1);
        }
    }
    
    public void eatWorms()
    {
        if(canSee(Worm.class))
        {
            eat (Worm.class);
            Greenfoot.playSound("slurp.wav");
            wormsEaten=wormsEaten+1;
            System.out.println(wormsEaten);
            if(wormsEaten==5)
            {
            Greenfoot.playSound("fanfare.wav");
            JOptionPane.showMessageDialog(null, "You Win"); 
            Greenfoot.stop();                       
            }
        }
    }
    
    public void turnEdge()
    {
        if (atWorldEdge())
        {
            turn(20);
        }
    }
    
    public void keyCheckPress()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);
        }
    }
}

