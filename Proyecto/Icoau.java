import greenfoot.*;

/**
 * Write a description of class Icoau here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Icoau extends Boton
{
    /**
     * Act - do whatever the Icoau wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootSound m;
    private World m2;
    public Icoau(GreenfootSound m1)
    {
        m=m1;
        m2=getWorld();
    }
    public void act() 
    {
        mouseSobreObjecto(m2);
        cambiaMundo(m,m2);
    } 
    public void mouseSobreObjecto(World w)
    {
          if(Greenfoot.mouseMoved(this))
        {
            setImage("ICO3.2.png");
        }
        else if(Greenfoot.mouseMoved(w))
        {
            setImage("ICO3.png");
        }
    }
    public void cambiaMundo(GreenfootSound m,World w)
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("Click.mp3");
            w=new AutorFondo(m);
            Greenfoot.setWorld(w);
        } 
    }
}
