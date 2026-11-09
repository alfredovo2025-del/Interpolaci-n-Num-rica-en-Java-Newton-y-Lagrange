package Interpolación;

public class Main {

    public static void main(String[] args) {

        // Nodos de interpolación
        double[] x = {1.0, 3.0, 5.0, 7.0};

        double[] y = {2.0, 6.0, 8.0, 14.0};

        // Punto a evaluar
        double xEval = 4.0;

        // Método de Newton
        double[][] tablaDiferencias =
                InterpolacionNewton.calcularDiferenciasDivididas(x, y);

        InterpolacionNewton.imprimirTabla(x, tablaDiferencias);

        System.out.println("\n--- COEFICIENTES DEL POLINOMIO DE NEWTON ---");

        for (int k = 0; k < x.length; k++) {

            System.out.printf(
                    "a_%d = %.4f%n",
                    k,
                    tablaDiferencias[0][k]);
        }

        double resultadoNewton =
                InterpolacionNewton.evaluarPolinomio(
                        x,
                        tablaDiferencias,
                        xEval);

        // Método de Lagrange
        double resultadoLagrange =
                InterpolacionLagrange.interpolacionLagrange(
                        x,
                        y,
                        xEval);

        // Resultados
        System.out.println("\n--- RESULTADOS DE LA INTERPOLACIÓN ---");

        System.out.printf(
                "Newton P(%.2f) = %.4f%n",
                xEval,
                resultadoNewton);

        System.out.printf(
                "Lagrange P(%.2f) = %.4f%n",
                xEval,
                resultadoLagrange);
    }
}