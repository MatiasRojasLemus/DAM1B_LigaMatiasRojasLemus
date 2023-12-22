public class Jugador {
    private String Nombre;
    private String Nacionalidad;
    private int edad ;
    private String Posicion;
    private boolean Lesionado;

    public Jugador(String nombre, String nacionalidad, int edad, String posicion){
        Nombre = nombre;
        Nacionalidad = nacionalidad;
        this.edad = edad;
        Posicion = posicion;
        Lesionado = false;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNacionalidad(){
        return Nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion(){
        return Posicion;
    }

    public boolean getLesionado(){
        return Lesionado;
    }

    public void Lesionarse(){
        if (!Lesionado){
            Lesionado = true;
        }
    }

    public void Recuperarse(){
        if (Lesionado){
            Lesionado = false;
        }
    }
}
