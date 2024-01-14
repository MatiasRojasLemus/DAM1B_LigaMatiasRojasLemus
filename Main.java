import java.util.Scanner;

public class Main {
    private static Scanner teclado;
    private static final int INSERTAREQUIPO = 1;
    private static final int INSERTARJUGADOR = 2;
    private static final int VEREQUIPOSLIGA = 3;
    private static final int VERJUGADORESEQUIPO = 4;
    private static final int VENDERJUGADOR = 5;

    public static void main(String[] args) {
        //Primero, la creacion de la liga:
        teclado = new Scanner(System.in);
        System.out.println("(Empiece creando una liga)");
        System.out.print("Inserte el pais de la liga: ");
        String pais = teclado.nextLine();
        Liga miLiga = new Liga(pais);

        int opcionLiga = menuLiga();

        while (opcionLiga != 6){
            switch(opcionLiga){
                //Caso 1:
                case INSERTAREQUIPO:
                    insertarEquipo(miLiga);
                    break;

                //Caso 2:
                case INSERTARJUGADOR:
                    insertarJugador(miLiga);
                    break;

                //Caso 3:
                case VEREQUIPOSLIGA:
                    verLiga(miLiga);
                    break;

                //Caso 4:
                case VERJUGADORESEQUIPO:
                    verJugadores(miLiga);
                    break;

                //Caso 5:
                case VENDERJUGADOR:
                    venderJugador(miLiga);
                    break;
            }
            opcionLiga = menuLiga();
        }
    }

    private static int menuLiga(){
        System.out.println("MENU DE LA LIGA");
        System.out.println("1- Insertar Equipo");
        System.out.println("2- Insertar Jugador");
        System.out.println("3- Ver equipos de la liga");
        System.out.println("4- Ver jugadores de un equipo");
        System.out.println("5- Vender jugador");
        System.out.println("6- Salir\n");
        System.out.print("Teclea la opcion que desee seleccionar: ");
        int opcion = teclado.nextInt();

        while ((opcion < 1)||(opcion > 6)){
            System.out.print("Opción incorrecta, Teclea opción: ");
            opcion = teclado.nextInt();
        }

        return opcion;
    }

    //Método para el caso 1:
    private static void insertarEquipo(Liga miLiga){
        teclado.nextLine();

        System.out.print("Inserte el nombre del equipo: ");
        String nombreEquipo = teclado.nextLine();


        System.out.print("Inserte la ciudad del equipo: ");
        String ciudadEquipo = teclado.nextLine();

        teclado.nextLine();

        System.out.println("Creando equipo...");
        Equipo equipoAInsertar = new Equipo(nombreEquipo, ciudadEquipo);

        System.out.println("Insertando equipo...");
        miLiga.anyadirEquipo(equipoAInsertar);
    }

    //Metodo para la Opcion 2:
    private static void insertarJugador(Liga miLiga){
        teclado.nextLine();
        System.out.print("Indique el nombre del equipo donde quiere insertar el jugador: ");
        String nombreEquipoInserccion = teclado.nextLine();

        teclado.nextLine();

        System.out.print("Indique el nombre del jugador: ");
        String nombreJugadorInserccion = teclado.nextLine();

        teclado.nextLine();

        System.out.print("Indique la nacionalidad del jugador: ");
        String nacionalidadJugador = teclado.nextLine();

        teclado.nextLine();

        System.out.print("Indique la edad del jugador: ");
        int edadJugador = teclado.nextInt();

        System.out.print("Indique la posición del jugador: ");
        String posicionJugador = teclado.next();

        while ((!posicionJugador.equals("POR"))
                && (!posicionJugador.equals("DEF"))
                &&(!posicionJugador.equals("CTC"))
                && (!posicionJugador.equals("DEL")))
        {
            System.out.println("Posicion no valida");
            System.out.print("Indique la posición del jugador: ");
            posicionJugador = teclado.next();
        }

        System.out.println("Creando jugador...");
        Jugador jugadorInserccion = new Jugador(nombreJugadorInserccion, nacionalidadJugador, edadJugador, posicionJugador);

        System.out.println("Insertando jugador...");

        if(miLiga.getEquipo(nombreEquipoInserccion) == null){
            System.out.println("El equipo indicado no existe: ");
        }
        else{
            miLiga.getEquipo(nombreEquipoInserccion).adquirirJugador(jugadorInserccion);
        }
    }

    //Método para el caso 3:
    private static void verLiga(Liga miLiga){
        System.out.println("**********COMPOSICIÓN DE LA LIGA*************************");
        System.out.println("EQUIPO\t\t"+ "CIUDAD\t\t" + "NUMERO JUGADORES");
        miLiga.mostrarListadoEquipos();
        System.out.println("*********************************************************");
    }


    //Método para el caso 4:
    private static void verJugadores(Liga miLiga){
        teclado.nextLine();
        System.out.print("Indique el equipo que quiere visualizar: ");
        String nombreEquipo = teclado.nextLine();

        //Si existe el equipo, se mostrara la lista de jugadores.
        if(miLiga.getEquipo(nombreEquipo) != null){
            Equipo miEquipo = miLiga.getEquipo(nombreEquipo);
            System.out.println("*********" + miEquipo.getNombre() + "****************************");
            System.out.println("NOMBRE\t\t" + "POSICIÓN\t\t" + "EDAD\t\t" + "NAC\t\t" + "LESIONADO");
            miEquipo.mostrarListaJugadores();
            System.out.println("*********************************************");
        }
        // En caso contrario, se mostrará el siguiente mensaje:
        else{
            System.out.println("El equipo indicado no existe.");
        }
    }
    //Método para el caso 5:
    private static void venderJugador(Liga miLiga){
        teclado.nextLine();
        System.out.print("Inserte el nombre del equipo donde quiere vender el jugador: ");
        String nombreEquipo = teclado.nextLine();

        teclado.nextLine();

        System.out.print("Inserte el nombre del jugador: ");
        String nombreJugador = teclado.nextLine();

        teclado.nextLine();

        System.out.println("Vendiendo jugador...");

        if(miLiga.getEquipo(nombreEquipo) != null){
            miLiga.getEquipo(nombreEquipo).venderJugador(nombreJugador);
        }
        else {
            System.out.println("El equipo indicado no existe.");
        }
    }
}
