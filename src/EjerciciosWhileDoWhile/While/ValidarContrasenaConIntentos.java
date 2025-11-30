package EjerciciosWhileDoWhile.While;

import java.util.*;

public class ValidarContrasenaConIntentos {
    /*
    Pide al usuario una contraseña. Tiene máximo 3 intentos para acertar ("secreto").
    Usa un while con un contador de intentos. Si falla 3 veces, muestra "Acceso denegado".
     */
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        String password = "secreto";
        String usuarioContrasena = "";
        while(intentos < 3 && !usuarioContrasena.equals(password)) {
            System.out.println("Dime la contraseña: ");
            usuarioContrasena = sc.nextLine();
            intentos++;
            System.out.println("Intentos realizados " + intentos);
        }
        System.out.println("La contraseña correcta es " + password + " y los intentos " + intentos);
    }
}
