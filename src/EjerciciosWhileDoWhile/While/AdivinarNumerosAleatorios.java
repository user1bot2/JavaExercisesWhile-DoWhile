package EjerciciosWhileDoWhile.While;

import java.util.*;

public class AdivinarNumerosAleatorios {
    /*
    Adivina el número (con Math.random)
    Genera un número aleatorio entre 1 y 10.
    Pide al usuario que adivine el número.
    Usa un bucle while para seguir pidiendo intentos hasta que acierte. Muestra un mensaje cuando gane.
     */
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUsuario = -1, numeroAleatorio = (int) ((Math.random() * 10)+1), numeroIntento = 0;
        while(numeroUsuario != numeroAleatorio) {
            System.out.println("Dame un número");
            numeroUsuario = sc.nextInt();
            numeroIntento++;
        }
        if(numeroIntento == 1) {
            System.out.println("Has ganado, tu número de intento es: " + numeroIntento);
        }else {
            System.out.println("Has ganado, tu número de intentos son: " + numeroIntento);
        }
    }
}
