public class GaussJ {

    /**
     * Método que realiza la triangulación de la matriz usando Eliminación Gaussiana simple.
     * @param matriz Matriz aumentada [A | b] que será modificada directamente en memoria.
     */
    public static void eliminacionGaussiana(double[][] matriz) {
        int n = matriz.length; // Obtiene el tamaño del sistema (número de filas)

        // CICLO 1 (i): Selecciona el renglón pivote actual (la diagonal principal)
        for (int i = 0; i < n; i++) {

            // CICLO 2 (j): Recorre todos los renglones que están ABAJO del pivote actual
            for (int j = i + 1; j < n; j++) {

                // Calcula el factor de proporción para anular el coeficiente de esta columna
                double factor = matriz[j][i] / matriz[i][i];

                // CICLO 3 (k): Recorre COLUMNA POR COLUMNA la fila completa
                // para aplicar la operación matemática: R_j = R_j - (factor * R_i)
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }

    /**
     * Método que completa el proceso de Gauss-Jordan a partir de la matriz triangulada.
     * Convierte la matriz en una matriz identidad y deja los resultados en la última columna.
     * @param matriz Matriz aumentada [A | b]
     */
    public static void resolverGaussJordan(double[][] matriz) {
        int n = matriz.length;

        // 1. Reutilizamos el módulo de triangulación superior de tu práctica anterior
        eliminacionGaussiana(matriz);

        // 2. Normalización y Barrido Superior
        for (int i = n - 1; i >= 0; i--) {
            double pivote = matriz[i][i];

            // Normalizar el renglón actual para que el pivote sea 1
            for (int k = i; k <= n; k++) {
                matriz[i][k] /= pivote;
            }

            // Anular los coeficientes de las filas superiores (barrido superior)
            for (int j = i - 1; j >= 0; j--) {
                double factor = matriz[j][i];
                for (int k = i; k <= n; k++) {
                    matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
}