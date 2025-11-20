import java.util.*;

public class ejerciciosAparte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Ejercicio3_3 ");
        System.out.println("2. Ejercicio3_4 ");
        System.out.print("Elige el ejercicio que quieras ejecutar: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> ejercicio3_3(sc);
            case 2 -> ejercicio3_4(sc);
            default -> System.out.println("Opción inválida.");
        }
    }

    public static void ejercicio3_3(Scanner sc) {
        /* Enunciado
        Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente).
        Para ello se introducirán por teclado una serie de números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto.
        El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un −1).
         */

        /* Entendimiento del programador
        ¿Qué nos pide el ejercicio?
        El ejercicio nos pide que el usuario tenga que adivinar el número secreto entre 1 y 100, para ello nos vamos a apoyar de "mayor" o "menor". Se termina cuando el usuario acierta o se rinde(-1), para eso, podemos usar un bucle while o do-while, hasta que el usuario se rinda.
        Pseudocódigo
        Inicio

            int numeroSecreto = 23; // -> Inicializar el número
            Scanner sc = new Scanner(System.in);


            do {
                System.out.println("Dame un número: ");
                int valorUsuario = sc.nextInt();
                Dentro del bucle queremos repetir hasta que se cumpla la condición. Habíamos dicho que la condición era si acertaba el número o si el usuario se rendía
            } while (!numeroSecreto tiene que ser igual a valorUsuario o usuario input es -1);
         */
        // Declarando variables
        int numeroSecreto = (int) ((Math.random() * 100) + 1);
        // Scanner sc = new Scanner(System.in);
        // Declarar fuera del bucle para cuando hagamos la condición de while este pueda comparar
        int valorUsuario;
        // Principio de DRY
        String numIncorrecto = "Número incorrecto. Siga intentado.";

        do {
            // Pedir datos al usuario
            System.out.println("Dame un número: ");
            valorUsuario = sc.nextInt();
            // Condicional para saber si un valorUsuario es mayor o menor
            // Cuando el número introducido es menor, hay que decir que es menor.
            if ((valorUsuario < numeroSecreto) && (valorUsuario > 0)) {
                System.out.println("El número " + valorUsuario + " es menor que número secreto");
                System.out.println(numIncorrecto);
                // En caso de que el usuario se rinda
            } else if (valorUsuario == -1) {
                System.out.println("Rendición");
                // En caso de que el usuario se rinda, pues el programa tiene que parar.
                break;
                // En caso de que el usuario tenga el número mucho mayor
            } else if (valorUsuario > numeroSecreto) {
                System.out.println("Número incorrecto, el número " + valorUsuario + " es mayor al número secreto. Por favor siga intentando.");
                System.out.println(numIncorrecto);
                // En caso de que el usuario adivine el número correcto.
            } else {
                System.out.println("Has ganado, felicidades.");
            }
            // Mientras número valor usuario no coincida con numeroSecreto, entonces que siga con el bucle
        } while (valorUsuario != numeroSecreto);
    }

    public static void ejercicio3_4(Scanner sc) {
        /*
        Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto. Para ello se introducirá por teclado la altura
       (en centímetros) de cada árbol, terminando la introducción de datos cuando se utilice −1 como altura. Los árboles se identifican mediante etiquetas con números
        únicos correlativos, comenzando en 0. Diseñar una aplicación que resuelva el problema planteado.
         */

        /* Pensamiento
        Hacer un programa para contar los árboles en cm, luego cada árbol debe de llevar un id_único (el valor debe de empezar a contar desde el 0), para que el usuario
        pueda salir debe de introducir -1.
        Arquitectura - Pseudocódigo
         Inicio
            Declarar las variables necesarios;
            Inicializar cada variable necesaria, menos la variable donde el usuario tendrá que introducir los datos;
            Luego como hacer para que los valores de los árboles puedan ser acumulativo, en la parte de id_únicos;

            // En este caso como no sabemos la cantidad exacta de árboles, podremos optar directamente por un bucle do-while;
            do {
                Debemos de pedir al usuario el dato,
                luego imprimir el dato por pantalla;
                luego hacer un acumulativo para id_único;
            } while (condición); // Se repite hasta que el usuario haga un -1

         */
        int arbolEnCm, numUnicoCorrelativos, salida;

        // Inicializar las variables
        numUnicoCorrelativos = 0;
        salida = -1;
        // Como se calcula para ser acumulativo
        numUnicoCorrelativos += numUnicoCorrelativos;

        do {
            System.out.println("Dame el número en centímetro, para salir introduce -1: ");
            arbolEnCm = sc.nextInt();
            System.out.println("El árbol mide: " + arbolEnCm + " y su respectivo número es: " + numUnicoCorrelativos);
            numUnicoCorrelativos++;
        } while (arbolEnCm != salida);

    }


}
