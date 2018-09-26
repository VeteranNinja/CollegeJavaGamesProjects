import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Write a description of class Bombermanworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bombermanworld extends World
{

    public Bombermanworld()
    {    
        super(600, 560, 1);
        
        addObject(new Bomberman(), 73,78);
        addObject(new Bomberman2(), 488, 483);
        addObject(new Bomberman3(), 488, 78);
        addObject(new Bomberman4(), 73, 483);
        
        int x = 25;
        for (int i=0; i< 10; i++) {
            x = x + 100;
            addObject(new block(), x, 25);
        }
        
        /***********************
        addObject(new block(),  50, 25);
        addObject(new block(), 100, 25);
        addObject(new block(), 150, 25);
        addObject(new block(), 200, 25);
        addObject(new block(), 250, 25);
        addObject(new block(), 300, 25);
        addObject(new block(), 350, 25);
        addObject(new block(), 400, 25);
        addObject(new block(), 450, 25);
        addObject(new block(), 500, 25);
        
        **************************/
        
        x = 0;
        for (int i=0; i< 10; i++) {
            x = x + 100;
            addObject(new block3(), x, 535);
        }
        /******************************
                addObject(new MauerU(),  50, 535);
        addObject(new block3(), 100, 535);
        addObject(new block3(), 150, 535);
        addObject(new block3(), 200, 535);
        addObject(new block3(), 250, 535);
        addObject(new block3(), 300, 535);
        addObject(new block3(), 350, 535);
        addObject(new block3(), 400, 535);
        addObject(new block3(), 450, 535);
        addObject(new block3(), 500, 535);
        ********************************/

        int y = 0;
        for (int i=0; i< 10; i++) {
            y = y + 125;
            addObject(new block2(), 25, y);
        }
        /*********************************
        addObject(new block2(), 25,  50);
        addObject(new block2(), 25, 100);
        addObject(new block2(), 25, 150);
        addObject(new block2(), 25, 200);
        addObject(new block2(), 25, 250);
        addObject(new block2(), 25, 300);
        addObject(new block2(), 25, 350);
        addObject(new block2(), 25, 400);
        addObject(new block2(), 25, 450);
        addObject(new block2(), 25, 500);
        *********************************/

        y = 25;
        for (int i=0; i< 10; i++) {
            y = y + 125;
            addObject(new block4(), 585, y);
        }
        /*********************************
        addObject(new block4(), 535,  50);
        addObject(new block4(), 535, 100);
        addObject(new block4(), 535, 150);
        addObject(new block4(), 535, 200);
        addObject(new block4(), 535, 250);
        addObject(new block4(), 535, 300);
        addObject(new block4(), 535, 350);
        addObject(new block4(), 535, 400);
        addObject(new block4(), 535, 450);
        addObject(new block4(), 535, 500);
        *********************************/
        
        
        addObject(new block(), 125, 237);
        addObject(new block(), 175, 237);
        addObject(new block(), 225, 237);
        addObject(new block3(), 125, 122);
        addObject(new block3(), 175, 122);
        addObject(new block3(), 225, 122);
        addObject(new block4(), 117, 125);
        addObject(new block4(), 117, 175);
        addObject(new block4(), 117, 225);
        addObject(new block2(), 228, 125);
        addObject(new block2(), 228, 175);
        addObject(new block2(), 228, 225);
        
        addObject(new block(), 335, 237);
        addObject(new block(), 385, 237);
        addObject(new block(), 435, 237);
        addObject(new block3(), 335, 122);
        addObject(new block3(), 385, 122);
        addObject(new block3(), 435, 122);
        addObject(new block4(), 331, 125);
        addObject(new block4(), 331, 175);
        addObject(new block4(), 331, 225);
        addObject(new block2(), 442, 125);
        addObject(new block2(), 442, 175);
        addObject(new block2(), 442, 225);
        
        addObject(new block(), 335, 437);
        addObject(new block(), 385, 437);
        addObject(new block(), 435, 437);
        addObject(new block3(), 335, 342);
        addObject(new block3(), 385, 342);
        addObject(new block3(), 435, 342);
        addObject(new block4(), 331, 375);
        addObject(new block4(), 331, 425);
        addObject(new block2(), 442, 375);
        addObject(new block2(), 442, 425);        
        
        addObject(new block(), 125, 437);
        addObject(new block(), 175, 437);
        addObject(new block(), 225, 437);
        addObject(new block3(), 125, 342);
        addObject(new block3(), 175, 342);
        addObject(new block3(), 225, 342);
        addObject(new block4(), 117, 375);
        addObject(new block4(), 117, 425);
        addObject(new block2(), 228, 375);
        addObject(new block2(), 228, 425);
        
    }
}
