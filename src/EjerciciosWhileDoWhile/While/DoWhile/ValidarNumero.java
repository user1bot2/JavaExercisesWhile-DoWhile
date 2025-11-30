package EjerciciosWhileDoWhile.While.DoWhile;

import java.util.*;

public class ValidarNumero {
    /*
    Pide un número al usuario. Si no está entre 1 y 10 (inclusive),
    vuelve a pedirlo. Usa do-while para asegurar que se pida al menos una vez.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUsuario;
        do{
            System.out.println("Dame un número comprendido entre 1 y 10 (inclusive). ");
            numUsuario = sc.nextInt();
        }while(numUsuario < 1 || numUsuario > 10); // Si los números están comprendidos entre 1 y 10.
        System.out.println("Terminado");
    }
}
