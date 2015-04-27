import greenfoot.*;

/**
 * Escribe una descrición de la clase BotonW2 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BotonW2 extends Actor
{
    /**
     * Act - hace lo que BotonW2 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private SimpleTimer timer;
    private boolean botonactivado;
    private GreenfootImage imgact;
    private GreenfootImage imgnoact;
    public BotonW2()
    {
        botonactivado=true;
        timer=new SimpleTimer();
        imgact=new GreenfootImage("BtnWarrior2.png"); 
        imgnoact=new GreenfootImage("BtnWarrior2.2.png"); 
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&botonactivado==true)
       {
           botonactivado=false;
           timer.mark();
           setImage(imgnoact);
       }
       if(timer.millisElapsed()>9300)
       {
          botonactivado=true; 
          setImage(imgact);
       }
    } 
    public boolean estasActivado()
    {
        return botonactivado;
    }  
}
