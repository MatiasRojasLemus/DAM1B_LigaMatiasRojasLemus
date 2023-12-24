import java.lang.reflect.Array;

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
        return ListaJugadores.length;
    }

    public void mostrarListaJugadores(){
        for (int i= 0; i < ListaJugadores.length; i++){
            System.out.println(ListaJugadores[i].getNombre());
        }
    }

    public void adquirirJugador(Jugador jugador){
        int i = 0;
        while (ListaJugadores[i] != null){
            i++;
        }
        ListaJugadores[i] = jugador;
    }


}
