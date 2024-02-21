package practica_github;
import java.util.Scanner;


public class MatrizPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Rellenar la matriz");
            System.out.println("2. Sumar la diagonal principal");
            System.out.println("3. Sumar la diagonal inversa");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(matriz, scanner);
                    break;
                case 2:
                    double sumaDiagonalPrincipal = sumarDiagonalPrincipal(matriz);
                    System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
                    break;
                case 3:
                    double sumaDiagonalInversa = sumarDiagonalInversa(matriz);
                    System.out.println("La suma de la diagonal inversa es: " + sumaDiagonalInversa);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 4);
        
        scanner.close();
    }

    public static void rellenarMatriz(int[][] matriz, Scanner scanner) {
        System.out.println("Rellenando la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el elemento en la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static double sumarDiagonalPrincipal(int[][] matriz) {
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    public static double sumarDiagonalInversa(int[][] matriz) {
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }
}
