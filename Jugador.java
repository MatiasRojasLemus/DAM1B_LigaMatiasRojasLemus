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

}
