import java.util.Scanner;

public class Main {
    private static Scanner teclado;
    public static void main(String[] args) {
        System.out.println("\u000C");

        //Primero, la creacion de la liga:
        teclado = new Scanner(System.in);
        System.out.println("Empiece creando una liga:");
        System.out.print("Inserte el país de la liga: ");
        String pais = teclado.nextLine();
        Liga miLiga = new Liga(pais);

    }

    private int menuLiga(){
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
}