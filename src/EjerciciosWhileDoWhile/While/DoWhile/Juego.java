package EjerciciosWhileDoWhile.While.DoWhile;

import java.util.*;

public class Juego {
    /*
    Muestra un mensaje: “¡Has ganado un punto! ¿Quieres seguir? (s/n)”.
    Usa do-while para que el juego se ejecute al menos una vez y continúe mientras el usuario responda 's'.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char jugar;
        do{
            System.out.println("¡Has ganado un punto! ¿Quieres seguir? (s/n)");
            jugar = sc.next().charAt(0);
        }while(jugar == 's'); // Mientras jugar sea 's', se sigue el bucle
        System.out.println("Saliendo del juego...");
    }
}
