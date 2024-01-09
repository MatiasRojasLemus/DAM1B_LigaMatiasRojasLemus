public class Liga {
    private String Pais;
    private final int NUMMAXEQUIPOS = 20;
    private Equipo[] ListadoEquipos;

    public Liga(String pais){
        Pais = pais;
        ListadoEquipos = new Equipo[NUMMAXEQUIPOS];
    }

    public void mostrarListadoEquipos(){
        for (int i = 0; i < ListadoEquipos.length; i++){
            System.out.println(ListadoEquipos[i].getNombre());
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
