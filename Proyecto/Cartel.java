import greenfoot.*;

/**
 * Escribe una descrici�n de la clase Cartel aqu�.
 * 
 * @autor (tu nombre) 
 * @versi�n (Un n�mero de versi�n o una fecha)
 */
public class Cartel extends Actor
{
    /**
     * Act - hace lo que Cartel quiere hacer. Este m�todo se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    final GreenfootImage salud=new GreenfootImage("salud.png");
    final GreenfootImage dinero=new GreenfootImage("money.png");
    final GreenfootImage reversa=new GreenfootImage("reversa.png");
    final GreenfootImage dano=new GreenfootImage("danoenem.png");
    final GreenfootImage ext=new GreenfootImage("extincion.png");
    final GreenfootImage fireball=new GreenfootImage("fire.png");
    final GreenfootImage iceball=new GreenfootImage("ice.png");
    final GreenfootImage ovni=new GreenfootImage("ovni.png");
    final GreenfootImage tornado=new GreenfootImage("tornado.png");
    public void act() 
    {
        // Agrega tus c�digos de acci�n aqu�.
    } 
    
    public void cambiaImagen(int index)
    {
        switch(index)
        {
            case 0:
            {
                setImage(reversa);
                break;
            }
             case 1:
            {
                setImage(salud);
                break;
            }
             case 2:
            {
                setImage(dinero);
                break;
            }
             case 3:
            {
                setImage(dano);
                break;
            }
             case 4:
            {
                setImage(ext);
                break;
            }
             case 5:
            {
                setImage(fireball);
                break;
            }
             case 6:
            {
                setImage(iceball);
                break;
            }
             case 7:
            {
                setImage(ovni);
                break;
            }
             case 8:
            {
                setImage(tornado);
                break;
            }
            
        }
    }
}
