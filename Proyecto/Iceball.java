import greenfoot.*;

/**
 * Escribe una descrici�n de la clase Iceball aqu�.
 * 
 * @autor (tu nombre) 
 * @versi�n (Un n�mero de versi�n o una fecha)
 */
public class Iceball extends Actor
{
    /**
     * Act - hace lo que Iceball quiere hacer. Este m�todo se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private int onetime; 
    private int y;
    private World w;
    final GreenfootImage explosion=new GreenfootImage("expice.png");
    public Iceball()
    {
        onetime=1;
        y=0;
        w=null;
    }
    
    public void act() 
    {
        if(y<405)
        caida();
        if(y==404)
        {
            setImage(explosion);
            Greenfoot.delay(1);
            w=getWorld();
            w.removeObject(this);
        }
    } 
    
    public void caida()
    {
         if(onetime==1)
        {
            y=getY();
            onetime=0;
        }
        setLocation(getX(),y);
        y++;
    }
}
   
