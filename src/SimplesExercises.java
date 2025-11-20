import java.util.*;

public class SimplesExercises {
    public static void main(String[] args) {
        // 1. Imprime los números del 1 al 10 usando while.
        // Declaración de variables
        int num = 0;
        // Usar bucle while para saber los valores
        while (num < 10) {
            // En cada nueva iteración que me imprima número num++ = (num +=1)
            num++;
            // Imprirmir datos
            System.out.println(num);
        }


        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("---Ejercicio2---");
        var valores = new ArrayList<>(Arrays.asList(
                "hola", "Adios", "Ayuda", "Ordenador", "free"
        ));
        int index = 0;
        /*
        Dentro de este bucle queremos iterar todas las veces a proporción del contenido del arraylist.
         */
        do {
            // Queremos empezar con la posición 0 e imprimir por cada iteración
            System.out.println(valores.get(index));
            // Mover al siguiente valor en cada iteración
            index++;
        } while (valores.size() > index);



        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("---Ejercicio3---");
        // Declarar variables
        int multiple = 5;

        // Usar bucle y condicional para sacar los números
        for (int i = 1; i < 51; i++) {
            // Condicional para múltiplos de 5
            if (i % multiple == 0) {
                // Imprimir resultados por pantalla
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        /*
        Primero quiero tener la array, sin importar la cantidad de números que hay en él.
        Luego quiero una variable con valor 0, que irá guardando los resultados y a su misma vez, este irá sumando todos los valores.
        Usando un bucle for-each podemos ir recorriendo la array y por cada iteración lo sumamos.
        Luego imprimir el resultado.
         */
        int[] num4Numeros = {10,20,30,40,50};
        int index4 = 0;
        for (int n4 : num4Numeros) {
            // Empezando desde 0, luego sumar los valores, primero sería 0 + 10, luego sería 10 + 20, luego 30 + 30, así sucesivamente.
            index4 += n4;
        }
        System.out.println(index4);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] ejercicio5 = {"Hola", "finalQUETAL", "IloveJava", "DoULove", "Java?"};
        int indice5 = 0;

        // Usando un bucle for-each para sacar los datos
        for (String e5 : ejercicio5) {
            System.out.println(e5);
        }
        System.out.println("----");
        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String> ejercicio6 = new HashSet<>(Arrays.asList(
                "Hola", "finalQUETAL", "IloveJava", "DoULove", "Java?"
        ));
        HashMap<String, String> ejercicio6HashMap = new HashMap<>();
        ejercicio6HashMap.put("Hola","Adiós");
        ejercicio6HashMap.put("Ayer", "Mañana");
        ejercicio6HashMap.put("Día", "Noche");
        ejercicio6HashMap.put("Guapa", "Fea");


        // Recorriendo un HashSet
        System.out.println("---HashSet---");
        for (String ej6 : ejercicio6) {
            System.out.println(ej6);
        }

        // Recorriendo un HashMap
        System.out.println("---HashMap---");
        for (Map.Entry<String, String> entry : ejercicio6HashMap.entrySet()) {
            System.out.println("Estas son las palabras: " + entry.getKey() + " sus antónimos " + entry.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("---Bucle descendiente---");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("---Múltiplos de 3---");
        int multiplo = 3;
        for (int i = 1; i < 21; i++) {
            if (i % multiplo == 0) {
                continue;
            }
            System.out.println(i);
        }


        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] ejercicio9 = {1,2,3,4,5,6,7,8,-1,65,23};

        for (int i = 0; i < ejercicio9.length; i++ ) {
            // En caso de encontrar un número negativo
            if (ejercicio9[i] < 0) {
                System.out.println("Se ha encontrado un número negativo. Programa detenido");
                break;
            }
            System.out.println(ejercicio9[i]);
        }


        // 10. Crea un programa que calcule el factorial de un número dado.
        int numFactorial;
        // Incializando la variable
        numFactorial = 1;
        // Pedir dato al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número entero y que sea positivo: ");
        int num10 = sc.nextInt();

        // Comprobar si no es negativo
        if (num10 > 0) {
            for (int i = num10; i > 0; i--) {
                numFactorial *= i;
                System.out.println("Es el proceso " + numFactorial);
            }
            System.out.println("El factorial de " + num10 + " es: " + numFactorial);
        } else if (num10 == 0) {
            int respuestaSiO = 1;
            System.out.println("La respuesta si 0! es: " + respuestaSiO);
        } else {
            System.out.println("El número es negativo.");
        }

    }
}
