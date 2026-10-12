import java.util.Scanner;

public class Lanzador_gaussJ {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("    MÉTODO DE GAUSS-JORDÁN - MÉTODOS NUMÉRICOS        ");
        System.out.println("------------------------------------------------------");
        System.out.println("      1. Ingresar datos por la consola             ");
        System.out.println("      2. Usar matriz por defecto del ejemplo en clase ");
        System.out.print("               Seleccione una opción:                   ");
        int opcion = scanner.nextInt();

        double[][] matriz;

        if (opcion == 0) {
            // 1. Lectura por consola
            matriz = defmatrizGJ.leerMatrizPorConsola();
        } else {
            // 2. Carga matriz predeterminada
            matriz = defmatrizGJ.defmatriz();
        }

        // 3. Aplicar el metodo Gauss-Jordan (que internamente llama a la eliminación gaussiana)
        // 4. luego normaliza
        GaussJ.resolverGaussJordan(matriz);

        // 5. Imprimir resultados finales de forma directa desde la columna de resultados
        System.out.println("\n Soluciones del sistema (Gauss-Jordan):");
        for (int i = 0; i < matriz.length; i++) {
            // El valor de la incógnita queda despejado directamente en la última columna [n]
            System.out.printf("x%d = %.4f\n", (i + 1), matriz[i][matriz.length]);
        }
    }
}