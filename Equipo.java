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
        int indice = 0;
        int numeroJugadores = 0;

        while(ListaJugadores[indice] != null){
            numeroJugadores++;
            indice++;
        }

        return numeroJugadores;
    }
    public void mostrarListaJugadores(){
        for (int i = 0; i < getNumJugadores(); i++){
            if (ListaJugadores[i].getLesionado()){
                System.out.println(ListaJugadores[i].getNombre() + "\t" + ListaJugadores[i].getPosicion() + "\t" + ListaJugadores[i].getEdad() + "\t" + ListaJugadores[i].getNacionalidad() + "\t" + "SI");
            }
            else {
                System.out.println(ListaJugadores[i].getNombre() + "\t" + ListaJugadores[i].getPosicion() + "\t" + ListaJugadores[i].getEdad() + "\t" + ListaJugadores[i].getNacionalidad() + "\t" + "NO");
            }
        }
    }

    public void adquirirJugador(Jugador jugador){
        if(getNumJugadores() != NUMMAXJUGADORES){
            int i = 0;
            while (ListaJugadores[i] != null){
                i++;
            }
            ListaJugadores[i] = jugador;
            System.out.println(jugador.getNombre() + " insertado en " + this.getNombre());
        }
        else {
            System.out.println("El equipo esta lleno");
        }
    }

    public void venderJugador(String nombreJugador){
        // Primero se busca el indice del Array ListaJugadores donde se encuentra el jugador a vender.
        Jugador miJugadorAux = null;
        int i = 0;

        /* Este while busca si existe o no el jugador a vender mediante un objeto Jugador auxiliar "miJugadorAux" de valor null (definido anteriormente).
           Su valor cambiara si se encuentra al jugador, y al mismo tiempo ya sabremos cual objeto del array ListaJugadores debemos manipular.
           Y en caso de no encontrarlo, miJugadorAux mantendrá su valor null.
         */

        while (miJugadorAux == null && (i < getNumJugadores())){
            if(nombreJugador.equals(ListaJugadores[i].getNombre())){
                //Aclaracion: Se introduce unos valores por introducir, no necesariamente deben de ser los mismos que ListaJugadores[i]
                miJugadorAux = new Jugador(ListaJugadores[i].getNombre(), ListaJugadores[i].getNacionalidad(), ListaJugadores[i].getEdad(), ListaJugadores[i].getPosicion());
            }
            else {
                i++;
            }
        }

        if(miJugadorAux != null){
            /* Y una vez encontrado , se desplazan todos los que están a su derecha una posición a la izquierda, manteniendo
                la organización de la lista de jugadores, a la vez que se elimina al jugador de este.
             */
            for (int j = i + 1; j < this.getNumJugadores(); j++){
                ListaJugadores[j - 1] = ListaJugadores [j];
            }
        }
    }
}
