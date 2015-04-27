import greenfoot.*;

/**
 * Escribe una descrición de la clase BotonW1 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class BotonW1 extends Actor
{
    /**
     * Act - hace lo que BotonW1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private SimpleTimer timer;
    private boolean botonactivado;
    private GreenfootImage imgact;
    private GreenfootImage imgnoact;
    public BotonW1()
    {
        botonactivado=true;
        timer=new SimpleTimer();
        imgact=new GreenfootImage("BtnWarrior1.png"); 
        imgnoact=new GreenfootImage("BtnWarrior1.2.png"); 
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&botonactivado==true)
       {
           botonactivado=false;
           timer.mark();
           setImage(imgnoact);
       }
       if(timer.millisElapsed()>7300)
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
