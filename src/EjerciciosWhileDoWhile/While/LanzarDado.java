package EjerciciosWhileDoWhile.While;

public class LanzarDado {
    /*
    Lanzar dados hasta que salga número 6 y contar los intentos
     */
    void main(String[] args) {
        int contador = 0, dado = 0;
        while(dado != 6) {
            dado = (int)(Math.random() * 6 +1);
            System.out.println(dado);
            contador++;
        }
        System.out.println("Número de veces que el dado se ha tirado: " + contador);
    }
}
