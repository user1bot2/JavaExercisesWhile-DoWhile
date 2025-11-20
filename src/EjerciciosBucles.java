import java.util.*;
import java.time.*;

public class EjerciciosBucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== EJERCICIOS DE BUCLES ===");
        System.out.println("1. WHILE - Contador regresivo");
        System.out.println("2. DO-WHILE - Validación de contraseña");
        System.out.println("3. FOR tradicional - Tabla de multiplicar");
        System.out.println("4. FOR-EACH - Encontrar el máximo");
        System.out.println("5. WHILE - Suma hasta límite");
        System.out.println("6. FOR tradicional - Números primos");
        System.out.println("7. FOR-EACH - Contar vocales");
        System.out.println("8. DO-WHILE - Menú interactivo");
        System.out.println("9. FOR tradicional + FOR-EACH - Invertir array");
        System.out.println("10. FOR tradicional  + Arrays - Buscar elemento");
        System.out.println();
        System.out.print("Introduce el número del ejercicio a ejecutar: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1 -> contadorRegresivo(sc);
            case 2 -> validacionContrasena(sc);
            case 3 -> tablaMultiplicar(sc);
            case 4 -> encontrarMaximo();
            case 5 -> sumaHastaLimite();
            case 6 -> numerosPrimos();
            case 7 -> contarVocales();
            case 8 -> menuInteractivo(sc);
            case 9 -> invertirArray();
            case 10 -> buscarElemento(sc);
            default -> System.out.println("Opción inválida");
        }
    }

    // 1. WHILE - Contador regresivo
    // Pide un número al usuario y haz cuenta regresiva hasta 0. Al llegar a 0 imprime "¡Despegue!"
    public static void contadorRegresivo(Scanner sc) {
        // Declarando variable y pidiendo datos al usuario.
        int numeroInicio;
        System.out.println("Dame un número para inicializar el contador: ");
        numeroInicio = sc.nextInt();

       /*
        // Usar un bucle while para hacer la cuenta regresiva y en caso de llegar a 0, Imprimir despegue
        while (numeroInicio > 0) {
            numeroInicio--;
            // Quiero que se vaya mostrando los números por pantalla
            System.out.println(numeroInicio);
            if (numeroInicio == 0) {
                System.out.println("¡Despegue!");
            }
        }
        Funciona, pero no es lo más óptimo.
        */
        while (numeroInicio > 0) {
            System.out.println(numeroInicio); // Mostrando los números regresivos hasta 0
            numeroInicio--;
        }
        // Justo al finalizar la condición while se sobreentiende que la condición a llegado a cero por eso imprimirá ¡Despegue!
        System.out.println("¡Despegue!");
    }

    // 2. DO-WHILE - Validación de contraseña
    // Pide contraseña hasta que el usuario escriba "java123"
    public static void validacionContrasena(Scanner sc) {
        sc.nextLine(); // Limpiando el buffer
        // Declarando variables
        int numerosIntento = 0;
        String contrasenaUsuario, contrasenaValida;
        contrasenaValida = "java123";

        // Bucle do-while para determinar la contraseña
        do {
            // Incrementar el número de intentos cada vez desde la primera vez que se ejecuta el programa hasta que se cumpla la condición.
            numerosIntento++;
            // Pedir dato al usuario y leerlo.
            System.out.println("Escribe una contraseña: ");
            contrasenaUsuario = sc.nextLine();


            if (contrasenaUsuario.equals(contrasenaValida)) {
                System.out.println("Contraseña correcta");
            } else {
                System.out.println("Contraseña incorrecta, sigue intentado.");
            }
        } while (!contrasenaUsuario.equals(contrasenaValida)); // Se repiten cuando no coincidan.
        System.out.println("Tus números de intentos fueron: " + numerosIntento);
    }

    // 3. FOR tradicional - Tabla de multiplicar
    // Pide un número e imprime su tabla de multiplicar del 1 al 10
    public static void tablaMultiplicar(Scanner sc) {
        // Declarando variables
        int numero, multiplicar;
        // Pedir datos
        System.out.println("Dame un número entero: ");
        numero = sc.nextInt();

        // Usando el bucle for vamos a conseguir en este caso número del 1 al 10
        for (int i = 1; i < 11; i++) {
            // Aplicamos la operación, en este caso datos del usuario por número del bucle
            multiplicar = numero * i;
            // Quiero ver todas las iteraciones con los resultados
            System.out.println(multiplicar);
        }
    }

    // 4. FOR-EACH - Encontrar el máximo
    // Array: {45, 12, 89, 23, 67, 34}. Encuentra e imprime el número más grande
    public static void encontrarMaximo() {
        int[] numeros = {45, 12, 89, 23, 67, 34};


        int maximo = numeros[0]; // Supongamos que el valor máximo esté en el índice 0
        // Usando el bucle for-each, podemos recorrer el array
        for (int n : numeros) {
            /*
            Si n mayor que maximo, es decir, cada iteración que vaya haciendo, primero se va a comparar con el valor inicial, luego si se
             cumple (n > maximo(valor que le hemos dado antes de entrar al bucle)), entonces maximo se reescribe y se guarda el nuevo
              valor de n, así hasta acabar el bucle.
             */
            if (n > maximo) {
                maximo = n;
            }
        }
        System.out.println("El valor máximo es: " + maximo);
    }

    // 5. WHILE - Suma hasta límite
    // Suma números consecutivos desde 1 hasta que la suma supere 100
    // Imprime cuántos números se sumaron y la suma final
    public static void sumaHastaLimite() {
        int suma = 0;
        int contador = 0;
        while (suma < 100) {
            contador++;
            suma += contador;
            System.out.println(suma);
        }
        System.out.println("Has terminado");
        System.out.println("Números usados hasta el " + contador);
    }

    // 6. FOR tradicional - Números primos
    // Imprime todos los números primos entre 1 y 50
    public static void numerosPrimos() {
        /*
        Pequeña nota:
        Los números primos son aquellos que tienen de divisor el número 1 y ellos mismos
         */
        // Quiero que se vaya incrementando los valores y luego comparar sacar si son dividendos o no

        /*
        Usamos dos bucles: el primero recorre los números del 1 al 50 que queremos evaluar. El segundo bucle, dentro del primero, prueba todos los posibles divisores de cada número. Dentro del segundo bucle usamos un if para comprobar si hay división exacta (módulo = 0), y si la hay, contamos ese divisor.
         */
        for (int i = 2; i <= 50; i++) {  // Empieza en 2 (el 1 no es primo)
            int divisores = 0;

            for (int j = 1; j <= i; j++) {  // Prueba desde 1 hasta i
                if (i % j == 0) {
                    divisores++;  // Suma 1 por cada divisor
                }
            }

            // Un primo tiene exactamente 2 divisores (1 y él mismo)
            if (divisores == 2) {
                System.out.println("Número primo: " + i);
            }
        }
    }


    // 7. FOR-EACH - Contar vocales
    // Array: {'h','o','l','a',' ','m','u','n','d','o'}. Cuenta cuántas vocales hay
    public static void contarVocales() {
        char[] letras = {'h', 'o', 'l', 'a', ' ', 'm', 'u', 'n', 'd', 'o'};
        // Quiero la suma total de los vocales, para ello vamos a declarar otra variable y lo inicializamos
        int conteoVocales = 0;
        for (char letra : letras) {
            // Si algunos de los carácteres es una vocal entonces se suma el contador a uno.
            if ('a' == letra || 'e' == letra || 'i' == letra || 'o' == letra || 'u' == letra) {
                conteoVocales++;
            }
        }
        // Imprimir el resultado
        System.out.println(conteoVocales);
    }

    // 8. DO-WHILE - Menú interactivo
    // Crea un menú con 3 opciones: 1.Saludar 2.Ver hora 3.Salir
    // El menú debe repetirse hasta que elijan salir
    public static void menuInteractivo(Scanner sc) {
        // Declarando variable
        int opcion;
        // Do - While
        do {
            // Pedir al usuario los datos
            System.out.println("Eliga la opción que quieres ejecutar: ");
            // El usuario ve las opciones que tiene el programa
            System.out.println("1. Saludar");
            System.out.println("2. Ver Hora");
            System.out.println("3. Salir");

            opcion = sc.nextInt();


            // Usando Switch para que ejecute que hacer en caso de elegir, como son valores concretos entonces podemos usar el switch
            switch (opcion) {
                case 1 -> System.out.println("Holaaa");
                // Añadimos
                case 2 -> {
                    LocalTime horaActual = LocalTime.now();
                    System.out.println("Hora actual " + horaActual);
                }
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }

        } while (opcion != 3); // Mientras la opción sea distinto de 3, entonces que siga repitiendo
    }

    // 9. FOR tradicional + FOR-EACH - Invertir array
    // Array: {10, 20, 30, 40, 50}. Invierte el orden e imprímelo
    public static void invertirArray() {
        /*
        Vamos a usar un for tradicional
        ¿Que es lo que queremos?
        Queremos invertir el array, en vez de empezar por el índice 0, vamos a empezar por el último índice
        Esto lo hacemos mediante un bucle, en mi caso me gustaría hacer mediante un bucle for tradcional
         */
        int[] numeros = {10, 20, 30, 40, 50};

        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    // 10. FOR tradicional + Arrays - Buscar elemento
    // Array: {"Ana", "Luis", "María", "Carlos", "Pedro"}
    // Pide un nombre y busca en qué posición está. Si no existe, indícalo
    public static void buscarElemento(Scanner sc) {
        String[] nombres = {"Ana", "Luis", "María", "Carlos", "Pedro"};

        // Solicitamos al usuario que introduzca el nombre a buscar
        System.out.print("Dame el nombre que quieres verificar: ");
        String nombreVerificar = sc.nextLine();

        // Inicializamos al usuario que introduzca el nombre a buscar
        int posicion = -1; // Hacemos que se empiece en menos uno porque aún no lo hemos encontrado
        // Recorremos el array completo para buscar el nombre
        for (int i = 0; i < nombres.length; i++) {
            // Comparamos ignorando mayúsculas/minúsculas
            if (nombres[i].equalsIgnoreCase(nombreVerificar)) {
                // En caso de coincidir lo guardamos
                posicion = i;
                // Salimos del bucle porque ya lo encontramos
                break;
            }
        }

        // Verificamos si se encontró el nombre
        if (posicion != -1) {
            // Si posición cambió de -1, significa que se encontró
            System.out.println(nombreVerificar + " está en la posición " + posicion);
        } else {
            // Si posicion siguen siendo -1, no se encontró
            System.out.println(nombreVerificar + " no está en la lista");
        }
    }
}
