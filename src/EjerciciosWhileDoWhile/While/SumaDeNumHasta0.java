package EjerciciosWhileDoWhile.While;

import java.util.*;

public class SumaDeNumHasta0 {
    /*
    Pide números al usuario con Scanner. Suma todos los números mientras no sea 0.
     Cuando el usuario escriba 0, muestra la suma total.
     */
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumTotal = 0, numUsuario = -1;
        while(numUsuario != 0) {
            System.out.println("Dame un número para sumar");
            numUsuario = sc.nextInt();
            sumTotal += numUsuario;
        }
        System.out.println("La suma total es " + sumTotal);
    }
}
