import greenfoot.*;

/**
 * Este boton (durante el modo de juego) al presionarse nos genera una piñata guerrera
 * en este caso, la más fuerte de las tres.
 * 
 * @author Irvin Alexis Rodriguez Estrada
 * @author Irving Gerardo Cardenaz Hernandez
 * @versión (Mayo 2015)
 */
public class BotonW3 extends Actor
{
    /**
     * Act - hace lo que BotonW3 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    private SimpleTimer timer;
    private boolean botonactivado;
    private GreenfootImage imgact;
    private GreenfootImage imgnoact;
    public BotonW3()
    {
        botonactivado=true;
        timer=new SimpleTimer();
        imgact=new GreenfootImage("BtnWarrior3.png"); 
        imgnoact=new GreenfootImage("BtnWarrior3.2.png"); 
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&botonactivado==true)
        {
            botonactivado=false;
            timer.mark();
            setImage(imgnoact);
        }
        if(timer.millisElapsed()>10300)
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
