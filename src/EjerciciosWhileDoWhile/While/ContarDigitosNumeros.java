package EjerciciosWhileDoWhile.While;

import java.util.*;

public class ContarDigitosNumeros {
    /*
    Pide un número entero positivo al usuario.
    Usa un bucle while para contar cuántos dígitos tiene (sin convertir a String)
     */
    public static int contarDigitos(int numero) {
        int contadorDigitos = 0;
        if(numero == 0) {
            contadorDigitos = 1;
        }

        // En caso de que el número sea negativo
        int sinNegativos = Math.abs(numero);

        while(sinNegativos > 0) {
            sinNegativos = sinNegativos / 10; // Dividir entre 10 hasta que no pueda más
            contadorDigitos++;
        }

        return contadorDigitos;

    }

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número entero: ");
        int numero = sc.nextInt();
        int resultado = contarDigitos(numero);
        System.out.println(resultado);
    }
}
