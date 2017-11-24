
/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer
 *
 * @author (David Rodriguez)
 * @version (a version number or a date)
 */
public class Todoist
{
    //Primera tarea
    private String tarea0;
    //Segunda tarea
    private String tarea1;
    //Tercera tarea
    private String tarea2;

    /**
     * Constructor de la clase todoist. Crea un gestor con las 3 tareas vacias;
     */
    public Todoist()
    {
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
    }
    
    /**
     * Inserta la tarea especificada en la posicion indicada
     */
    public void addTarea(String nombreTarea, int posicion)
    {
        if(posicion == 0){
            tarea0 = nombreTarea;
        }
        else if (posicion == 1){
            tarea1 = nombreTarea;
        }
        else if (posicion == 2){
            tarea2 = nombreTarea;
        }
    }
    
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes");
        if(tarea0 != null){
            System.out.println(tarea0);
        }
        if(tarea1 != null){
            System.out.println(tarea1);
        }
        if(tarea2 != null){
            System.out.println(tarea2);
        }
    }
}
