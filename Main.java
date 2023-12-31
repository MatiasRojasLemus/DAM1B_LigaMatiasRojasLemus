import java.util.Scanner;

public class Main {
    private static Scanner teclado;
    private static int opcionLiga;
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
        opcionLiga = menuLiga();

        while (opcionLiga != 6){
            switch(opcionLiga){
                //Caso 1:
                case INSERTAREQUIPO:
                    insertarEquipo(miLiga);
                    break;

                //Caso 2:
                case INSERTARJUGADOR:
                    System.out.println("Opcion 2");
                    break;

                //Caso 3:
                case VEREQUIPOSLIGA:
                    System.out.println("Opcion 3");
                    miLiga.mostrarListadoEquipos();
                    break;

                //Caso 4:
                case VERJUGADORESEQUIPO:
                    System.out.println("Opcion 4");
                    break;

                //Caso 5:
                case VENDERJUGADOR:
                    System.out.println("Opcion 5");
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

    private static void insertarEquipo(Liga miLiga){
        System.out.print("Inserte el nombre del equipo: ");
        String nombreEquipo = teclado.next();

        System.out.print("Inserte la ciudad del equipo: ");
        String ciudadEquipo = teclado.next();

        System.out.println("Creando equipo...");
        Equipo equipoAInsertar = new Equipo(nombreEquipo, ciudadEquipo);

        System.out.println("Insertando equipo...");
        miLiga.anyadirEquipo(equipoAInsertar);
    }
}