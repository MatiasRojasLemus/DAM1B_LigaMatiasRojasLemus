public class Equipo {
    private String Nombre;
    private String Ciudad;
    private final int NUMMAXJUGADORES = 22;
    private Jugador[] ListaJugadores;

    public Equipo(String nombre, String ciudad) {
        Nombre = nombre;
        Ciudad = ciudad;
        ListaJugadores = new Jugador[NUMMAXJUGADORES];
    }

    //Metodo que nos permite conocer el nombre del equipo
    public String getNombre() {
        return Nombre;
    }

    //Metodo que nos permite conocer la ciudad de origen del equipo
    public String getCiudad() {
        return Ciudad;
    }

    //Metodo que nos permite conocer el numero de jugadores que compone el equipo
    public int getNumJugadores() {
        return NUMMAXJUGADORES;
    }
}
