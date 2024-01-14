public class Jugador {
    // Atributos de la Clase Jugador
    private String Nombre;
    private String Nacionalidad;
    private int edad ;
    private String Posicion;
    private boolean Lesionado;

    // Constructor de la Clase Jugador.
    public Jugador(String nombre, String nacionalidad, int edad, String posicion){
        Nombre = nombre;
        Nacionalidad = nacionalidad;
        this.edad = edad;
        Posicion = posicion;
        Lesionado = false;
    }

    //Metodo que nos devuelve el nombre del jugador.
    public String getNombre() {
        return Nombre;
    }

    //Metodo que nos devuelve la nacionalidad del jugador.
    public String getNacionalidad(){
        return Nacionalidad;
    }

    //Metodo que nos devuelve la edad del jugador.
    public int getEdad() {
        return edad;
    }

    //Metodo que nos devuelve la posicion del jugador.
    public String getPosicion(){
        return Posicion;
    }

    //Metodo que nos permite saber si el jugador esta lesionado (true) o no (false).
    public boolean getLesionado(){
        return Lesionado;
    }

    //Metodo que cambia su estado de lesionado a "true".
    public void Lesionarse(){
        if (!Lesionado){
            Lesionado = true;
        }
    }

    //Metodo que cambia su estado de lesionado a "false".
    public void Recuperarse(){
        if (Lesionado){
            Lesionado = false;
        }
    }
}
