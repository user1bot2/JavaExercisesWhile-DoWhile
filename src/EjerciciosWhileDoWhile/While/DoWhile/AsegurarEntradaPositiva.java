package EjerciciosWhileDoWhile.While.DoWhile;

import java.util.*;

public class AsegurarEntradaPositiva {
    /*
    Pide un número al usuario. Si es negativo,
    vuelve a pedirlo hasta que sea positivo o cero.
    Usa do-while para garantizar que se pida al menos una vez.
     */
    public static int soloNumPositivo(Scanner sc) {
        int numero;
        do{
            System.out.println("Dame un número positivo: ");
            numero = sc.nextInt();
        }while(numero <= -1); // Hasta que sea positivo o 0
        return numero;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultado = soloNumPositivo(sc);
        System.out.println(resultado);
    }
}
