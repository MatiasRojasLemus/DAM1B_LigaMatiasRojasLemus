public class Liga {
    // Atributos de la Clase Liga
    private String Pais;
    private final int NUMMAXEQUIPOS = 20;
    private Equipo[] ListadoEquipos;



    // Constructor de la Clase Liga.
    public Liga(String pais){
        Pais = pais;
        ListadoEquipos = new Equipo[NUMMAXEQUIPOS];
    }


    /* Muestra por pantalla cada uno de los objetos Equipo insertados, junto con sus datos/atributos relevantes:
       Nombre, Ciudad del Equipo y el número de jugadores actuales.
       Este método se complementa especialmente con el método verLiga() de la Clase Main.
     */
    public void mostrarListadoEquipos(){
        for (int i = 0; i < this.getNumEquipos(); i++){
            System.out.println(ListadoEquipos[i].getNombre() + "\t" + ListadoEquipos[i].getCiudad() + "\t" + ListadoEquipos[i].getNumJugadores());
        }
    }


    //Devuelve el numero de equipos que actualmente tiene una liga.
    public int getNumEquipos(){
        int indice = 0;
        int numeroEquipos = 0;

        while (ListadoEquipos[indice] != null){
            numeroEquipos++;
            indice++;
        }
        return numeroEquipos;
    }


    /* Busca y devuelve un Objeto Equipo cuyo nombre se
       corresponda al nombre de equipo introducido como parámetro, "nombreEquipo".
       En caso de no encontrar ningún equipo en la Liga con dicho nombre, el método devolvera null.
     */
    public Equipo getEquipo(String nombreEquipo){
        for (int i = 0; i < getNumEquipos();i++){
            if (nombreEquipo.equals(ListadoEquipos[i].getNombre())){
                return ListadoEquipos[i];
            }
        }

        return null;
    }


    // Devuelve el país de origen de la liga.
    public String getPais(){
        return Pais;
    }


    //Añade un equipo a la Liga, comprobando previamente si la liga ya esta llena o no.
    public void anyadirEquipo (Equipo equipo){
        //Si el listado de equipos NO esta lleno, se procederá con la insercción del equipo
        if(getNumEquipos() != NUMMAXEQUIPOS){
            int indice = 0;
            while(ListadoEquipos[indice] != null){
                indice++;
            }
            ListadoEquipos[indice] = equipo;
            System.out.println("Equipo " + equipo.getNombre() + " insertado");
        }

        //Pero en caso contrario, se mostrará el siguiente mensaje:
        else {
            System.out.println("La liga esta llena");
        }
    }
}
