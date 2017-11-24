import java.util.ArrayList;
/**
 * Clase que permite almacenar las tareas pendientes que tenemos por hacer
 *
 * @author (David Rodriguez)
 * @version (a version number or a date)
 */
public class Todoist
{
    //Almacena nuestras tareas
    private ArrayList<String> tareas;

    /**
     * Constructor de la clase todoist. Crea un gestor con las 3 tareas vacias;
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }

    /**
     * Inserta la tarea especificada en la posicion indicada
     */
    public void addTarea(String nombreTarea)
    {
        tareas.add(nombreTarea);
    }

    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas()
    {
        System.out.println("Tareas existentes");
        System.out.println(tareas);
    }

    /**
     * Devuelve el numero de tareas existentes
     */
    public int getNumeroTareas()
    {
        return tareas.size();
    }

    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void mostrarNumeroTareasPendientes()
    {
        System.out.println("El numero de tareas pendientes es " + tareas.size());
    }

    /**
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). Devuelve true si la tarea existe y se elimina,
     * false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea)
    {
        boolean valorADevolver = false;
        if(posicionTarea >= 0 && posicionTarea < tareas.size())
        {
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }
}

