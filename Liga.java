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


}
