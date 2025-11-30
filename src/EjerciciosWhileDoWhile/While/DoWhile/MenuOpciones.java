package EjerciciosWhileDoWhile.While.DoWhile;

import java.util.*;

public class MenuOpciones {
    /*
    Muestra un menú con 3 opciones:

    1.Saludar
    2.Mostrar fecha (puedes omitir fecha real, solo escribe "Hoy es...")
    3.Salir
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entradaDatos = 0;
        do{
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("3. Salir");
            entradaDatos = sc.nextInt();
            switch (entradaDatos) {
                case 1 -> System.out.println("Hola.");
                case 2 -> System.out.println("Hoy es... 20/11/2020");
                case 3 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Error siga intentado");
            }
        }while(entradaDatos != 3);
        sc.close();
    }
}
