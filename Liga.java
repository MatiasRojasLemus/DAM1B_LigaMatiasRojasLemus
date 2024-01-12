public class Liga {
    private String Pais;
    private final int NUMMAXEQUIPOS = 20;
    private Equipo[] ListadoEquipos;

    public Liga(String pais){
        Pais = pais;
        ListadoEquipos = new Equipo[NUMMAXEQUIPOS];
    }

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

    public Equipo getEquipo(String nombreEquipo){
        for(int i = 0; i < getNumEquipos();i++){
            if(nombreEquipo.equals(ListadoEquipos[i].getNombre())){
                return ListadoEquipos[i];
            }
        }
        //Si no encuentra ningún equipo en la Liga con el nombre "nombreEquipo", devolvera null.
        return null;
    }

    public String getPais(){
        return Pais;
    }

    public void anyadirEquipo (Equipo equipo){
        //Si el listado de equipos NO esta lleno:
        if(getNumEquipos() != NUMMAXEQUIPOS){
            int indice = 0;
            while(ListadoEquipos[indice] != null){
                indice++;
            }
            ListadoEquipos[indice] = equipo;
            System.out.println("Equipo " + equipo.getNombre() + " insertado");
        }

        //Pero si el listado esta lleno:
        else {
            System.out.println("La liga esta llena");
        }
    }
}
