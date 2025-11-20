# Ejercicios de Bucles en Java

Colección completa de ejercicios prácticos para dominar las estructuras repetitivas (bucles) en Java, desde nivel básico hasta intermedio.

## 🎯 ¿De qué se tratan estos ejercicios?

Este repositorio contiene **22 ejercicios progresivos** diseñados específicamente para que aprendas y domines todos los tipos de bucles disponibles en Java. Los ejercicios están organizados en tres archivos con diferentes niveles de complejidad.

### 🎓 Objetivo de Aprendizaje

El propósito principal es que practiques y entiendas:

- **Cuándo usar cada tipo de bucle** (while, do-while, for, for-each)
- **Cómo funcionan las iteraciones** y el control de flujo
- **Técnicas de validación** de entrada del usuario
- **Trabajo con arrays y colecciones** Java
- **Implementación de algoritmos básicos** usando bucles
- **Uso de break y continue** para controlar el flujo

### 📊 Niveles de Dificultad

Los ejercicios están divididos en tres categorías:

**🟢 Básico** (SimplesExercises.java)
- Ejercicios fundamentales para familiarizarte con la sintaxis
- Ideal si estás comenzando con bucles en Java

**🟡 Intermedio** (EjerciciosBucles.java)
- 10 ejercicios variados con menú interactivo
- Combina bucles con otras estructuras de control

**🔴 Avanzado** (ejerciciosAparte.java)
- Ejercicios aplicados a problemas reales
- Incluye juegos y aplicaciones prácticas

## 📁 Contenido del Repositorio

### 1️⃣ SimplesExercises.java - Ejercicios Básicos

**¿Qué aprenderás?**
- Sintaxis básica de while, do-while, for y for-each
- Cómo recorrer diferentes estructuras de datos
- Operaciones básicas con bucles

**Ejercicios incluidos:**
1. ➰ Imprimir números del 1 al 10 con `while`
2. ➰ Recorrer ArrayList con `do-while`
3. ➰ Calcular múltiplos de 5 con `for`
4. ➕ Sumar elementos de un array
5. 📋 Recorrer arrays con `for` tradicional
6. 🗂️ Recorrer HashSet y HashMap con `for-each`
7. 🔽 Bucle descendente (10 a 1)
8. ⏭️ Usar `continue` para saltar iteraciones
9. 🛑 Usar `break` para detener bucles
10. 🔢 Calcular factorial de un número

### 2️⃣ EjerciciosBucles.java - Ejercicios Intermedios

**¿Qué aprenderás?**
- Aplicar bucles en situaciones reales
- Combinar bucles con condicionales
- Validar entradas del usuario
- Implementar algoritmos conocidos

**Ejercicios incluidos:**

| # | Tipo de Bucle | Ejercicio | Concepto Clave |
|---|---------------|-----------|----------------|
| 1 | `while` | Contador regresivo | Control de iteraciones |
| 2 | `do-while` | Validación de contraseña | Bucles con garantía de ejecución |
| 3 | `for` | Tabla de multiplicar | Iteraciones con contador |
| 4 | `for-each` | Encontrar máximo | Recorrer arrays |
| 5 | `while` | Suma hasta límite | Condiciones de parada |
| 6 | `for` anidado | Números primos | Bucles dentro de bucles |
| 7 | `for-each` | Contar vocales | Comparación de caracteres |
| 8 | `do-while` | Menú interactivo | Bucles en aplicaciones |
| 9 | `for` + `for-each` | Invertir array | Recorrido inverso |
| 10 | `while` + Arrays | Buscar elemento | Búsqueda lineal |

### 3️⃣ ejerciciosAparte.java - Ejercicios Aplicados

**¿Qué aprenderás?**
- Crear programas completos usando bucles
- Implementar lógica de juegos
- Manejar casos reales de uso

**Ejercicios incluidos:**

**🎮 Ejercicio 3.3 - El Número Secreto**
- **Tipo:** Juego interactivo con `do-while`
- **Descripción:** Adivina un número aleatorio entre 1 y 100
- **Conceptos:** Números aleatorios, validación, bucles condicionales
- **Características:**
    - Genera número aleatorio con `Math.random()`
    - Da pistas (mayor/menor) en cada intento
    - Permite rendirse introduciendo -1
    - Usa `break` para salir del bucle

**🌳 Ejercicio 3.4 - Registro de Árboles**
- **Tipo:** Aplicación de gestión de datos con `do-while`
- **Descripción:** Sistema para registrar alturas de árboles
- **Conceptos:** Contadores, identificadores únicos, acumuladores
- **Características:**
    - Asigna IDs correlativos automáticamente
    - Registra altura en centímetros
    - Usa -1 para terminar la entrada de datos
    - Simula un sistema de base de datos simple


## 💡 Recomendaciones de Estudio

**Para principiantes:**
1. ✅ Comienza con `SimplesExercises.java`
2. ✅ Lee los comentarios en el código (incluyen explicaciones y pseudocódigo)
3. ✅ Ejecuta cada programa y observa el comportamiento
4. ✅ Modifica los valores y experimenta

**Para nivel intermedio:**
1. ✅ Practica con `EjerciciosBucles.java`
2. ✅ Intenta resolver cada ejercicio antes de ver el código
3. ✅ Compara tu solución con la implementada
4. ✅ Prueba con diferentes valores de entrada

**Para consolidar conocimientos:**
1. ✅ Completa los ejercicios de `ejerciciosAparte.java`
2. ✅ Intenta añadir nuevas funcionalidades
3. ✅ Crea tus propios ejercicios similares
4. ✅ Optimiza el código existente

## 📝 Características del Código

### ✨ Buenas Prácticas Incluidas

- **Comentarios explicativos:** Cada ejercicio tiene su enunciado y explicación
- **Pseudocódigo:** Pensamiento del programador antes de codificar
- **Principio DRY:** Don't Repeat Yourself aplicado donde es posible
- **Variables descriptivas:** Nombres que explican su propósito
- **Código limpio:** Indentación y estructura clara

### 🔧 Conceptos Técnicos Cubiertos

| Concepto | Descripción | Ejercicios |
|----------|-------------|-----------|
| Bucle `while` | Se ejecuta mientras la condición sea verdadera | 1, 5, 10 |
| Bucle `do-while` | Se ejecuta al menos una vez | 2, 8, 3.3, 3.4 |
| Bucle `for` | Con contador definido | 3, 6, 7, 9 |
| Bucle `for-each` | Para recorrer colecciones | 4, 7, 9 |
| `break` | Salir del bucle | 9, 3.3 |
| `continue` | Saltar a la siguiente iteración | 8 |
| Bucles anidados | Bucle dentro de otro bucle | 6 |
| Arrays | Trabajo con arreglos | 4, 5, 9, 10 |
| Collections | ArrayList, HashSet, HashMap | 2, 6 |
| Validación | Verificar entrada del usuario | 2, 3.3 |
| Algoritmos | Primos, factorial, búsqueda | 6, 10, SimplesEx.10 |

## 🎯 Resultados de Aprendizaje

Al completar estos ejercicios serás capaz de:

✅ Elegir el tipo de bucle adecuado para cada situación
✅ Implementar validaciones de entrada robustas
✅ Trabajar con arrays y colecciones de forma eficiente
✅ Crear programas interactivos con menús
✅ Entender y aplicar algoritmos básicos
✅ Controlar el flujo de ejecución con break y continue
✅ Escribir código limpio y bien documentado

## 🛠️ Requisitos

- **Java JDK 11 o superior**
- **Editor de texto** o IDE (recomendado: IntelliJ IDEA, Eclipse, VS Code)

Verifica tu instalación:
```bash
java -version
javac -version
```

## 📚 Recursos Adicionales

- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
- [Tutorial de bucles Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
- [Java Collections Framework](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/)

## 🤝 Contribuciones

¿Tienes ideas para nuevos ejercicios? ¡Las contribuciones son bienvenidas!

1. Fork el proyecto
2. Crea una rama (`git checkout -b nuevo-ejercicio`)
3. Commit tus cambios (`git commit -m 'Añade ejercicio de...'`)
4. Push a la rama (`git push origin nuevo-ejercicio`)
5. Abre un Pull Request

## 📄 Licencia

Este proyecto está disponible para uso educativo libre.

---
⌨️ **Practica, aprende y domina los bucles en Java** 🚀