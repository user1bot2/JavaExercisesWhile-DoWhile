package EjerciciosWhileDoWhile.While.DoWhile;

public class GenerarNumHastaSalirPar {
    /*
    Usa Math.random() para generar números enteros entre 1 y 100.
    Con do-while, sigue generando hasta que salga un número par. Muestra cuántos intentos tomó.
     */
    public static void main(String[] args) {
        int numAleatorio, contador = 0;
        do{
            numAleatorio = (int) ((Math.random() * 100 -1 + 1) +1);
            System.out.println(numAleatorio);
            contador++;
        }while(numAleatorio % 2 != 0); // Mientras que el resto no sea 0 entonces continua
        System.out.println("El número es: " + numAleatorio + " y tomó " + contador + " intentos.");
    }
}
