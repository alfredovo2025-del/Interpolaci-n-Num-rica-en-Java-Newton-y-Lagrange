# Interpolación Numérica en Java - Newton y Lagrange

Proyecto en Java que implementa los métodos de interpolación polinómica de **Newton (Diferencias Divididas)** y **Lagrange**, para estimar el valor de una función en un punto intermedio a partir de un conjunto de nodos conocidos.

## Descripción General

Dado un conjunto de puntos (x, y), el programa construye el polinomio interpolador y lo evalúa en un punto solicitado.

Incluye:
- **Método de Newton:** Construye la tabla de diferencias divididas y obtiene los coeficientes del polinomio.
- **Método de Lagrange:** Calcula directamente el valor interpolado sin construir la tabla.
- **Comparación:** Ambos métodos deben dar el mismo resultado para los mismos datos.

Ejemplo incluido en el programa:
- Nodos: (1, 2), (2, 3), (4, 10)
- Punto a evaluar: x = 3.0
- Resultado esperado: P(3.0) = 5.6667 en ambos métodos.

## Estructura del Proyecto

## Requerimientos del Entorno

- **Java:** JDK 8 o superior (recomendado JDK 17 o JDK 21)
- **IDE:** IntelliJ IDEA, Eclipse, NetBeans o Visual Studio Code con extensión de Java
- No requiere librerías externas, solo Java estándar.

## Guía de Ejecución Rápida

### Opción 1: Desde el IDE
1. Clona o descarga el repositorio.
2. Abre la carpeta del proyecto en tu IDE.
3. Abre el archivo `Main.java`.
4. Presiona Run / Ejecutar.

### Opción 2: Desde la terminal / CMD

1. Entra a la carpeta del proyecto:
```bash
cd Interpolación
javac InterpolacionNewton.java InterpolacionLagrange.java Main.java
java Main
--- TABLA DE DIFERENCIAS DIVIDIDAS ---

x_i     f[x_i]  Orden 1 Orden 2

1.00    2.0000  1.0000  1.0000
2.00    3.0000  3.5000
4.00    10.0000

--- COEFICIENTES DEL POLINOMIO DE NEWTON ---
a_0 = 2.0000
a_1 = 1.0000
a_2 = 1.0000

--- RESULTADOS DE LA INTERPOLACIÓN ---
Newton P(3.00) = 5.6667
Lagrange P(3.00) = 5.6667
double[] x = {1.0, 2.0, 4.0};
double[] y = {2.0, 3.0, 10.0};
double xEval = 3.0;

Lo único que **tienes que cambiar tú** es la línea donde dice `[https://github.com/alfredovo2025-del/Interpolaci-n-Num-rica-en-Java-Newton-y-Lagrange/new/main?filename=README.md]` por tu link real de GitHub.

¿Me pasas tu link para dejártelo ya puesto?
