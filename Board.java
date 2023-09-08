package lucas.entities;
import java.util.Random;

public class Board {
    public static int[][] PieceLIzquierda= {{0, 5, 0, 0}, {0, 6, 0, 0}, {6, 7, 0, 0}, {0, 0, 0, 0}};;
    public static int[][] PieceLDerecha= {{1, 0, 0, 0}, {2, 0, 0, 0}, {3, 4, 0, 0}, {0, 0, 0, 0}};;
    public static int[][] PieceLArriba = {{8, 9, 10, 0}, {0, 0, 11, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};


    public static void main(String[] args) {
        int[][] matrix10x20 = new int[10][20];
        int[][] matrix4x4 = new int[4][4];

        // Crear algunas matrices 4x4
        //int[][] PieceLDerecha = {{1, 0, 0, 0}, {2, 0, 0, 0}, {3, 4, 0, 0}, {0, 0, 0, 0}};
        //int[][] PieceLIzquierda = {{0, 5, 0, 0}, {0, 6, 0, 0}, {6, 7, 0, 0}, {0, 0, 0, 0}};
        //int[][] PieceLArriba = {{8, 9, 10, 0}, {0, 0, 11, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceLAbajo = {{0, 0, 15, 0}, {12, 13, 14, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceStickHorizontal = {{16, 17, 18, 19}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceStickVertical = {{20, 0, 0, 0}, {21, 0, 0, 0}, {22, 0, 0, 0}, {23, 0, 0, 0}};
        int[][] PieceTArriba = {{24, 25, 26, 0}, {0, 27, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceTIzquierda = {{28, 0, 0, 0}, {29, 30, 0, 0}, {31, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceTDerecha = {{0, 0, 32, 0}, {0, 33, 34, 0}, {0, 0, 35, 0}, {0, 0, 0, 0}};
        int[][] PieceTAbajo = {{0, 0, 0, 0}, {0, 36, 0, 0}, {37, 38, 39, 0}, {0, 0, 0, 0}};
        int[][] PieceSquare = {{40, 41, 0, 0}, {42, 43, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceDogIzquierda = {{44, 45, 0, 0}, {47, 48, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] PieceDogDerecha = {{0, 0, 0, 0}, {49, 50, 0, 0}, {51, 52, 0, 0}, {0, 0, 0, 0}};

        // Puedes agregar más matrices aquí según sea necesario

        // Agregar matrices 4x4 de forma aleatoria
        agregarMatrizAleatoria(matrix10x20, PieceLIzquierda);
        agregarMatrizAleatoria(matrix10x20, PieceLDerecha);
        agregarMatrizAleatoria(matrix10x20, PieceLArriba);
        agregarMatrizAleatoria(matrix10x20, PieceLAbajo);
        agregarMatrizAleatoria(matrix10x20, PieceStickHorizontal);
        agregarMatrizAleatoria(matrix10x20, PieceStickVertical);
        agregarMatrizAleatoria(matrix10x20, PieceTAbajo);
        agregarMatrizAleatoria(matrix10x20, PieceTArriba);
        agregarMatrizAleatoria(matrix10x20, PieceTDerecha);
        agregarMatrizAleatoria(matrix10x20, PieceTIzquierda);
        agregarMatrizAleatoria(matrix10x20, PieceDogDerecha);
        agregarMatrizAleatoria(matrix10x20, PieceDogIzquierda);
        agregarMatrizAleatoria(matrix10x20, PieceSquare);


        // Imprimir la matriz 10x20
        imprimirMatriz(matrix10x20);
    }

    // Método para agregar una matriz 4x4 existente en una posición aleatoria
    public static void agregarMatrizAleatoria(int[][] matrix10x20, int[][] matrix4x4) {
        Random random = new Random();
        int startX = random.nextInt(10);  // Rango de 0 a 9 para evitar desbordar la matriz
        int startY = random.nextInt(20); // Rango de 0 a 19

        // Verificar que la matriz 4x4 cabe en la matriz 10x20
        if (startX + 2 < 10 && startY + 2 < 20) {
            for (int i = 0; i < 4; i++) {
                System.arraycopy(matrix4x4[i], 0, matrix10x20[startX + i], startY, 4);
            }
        } else {
            System.out.println("La matriz 4x4 no cabe en la matriz 10x20 en esta posición.");
        }
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] crearMatriz10x20() {
        return new int[10][20];
    }

    public static int[][] crearMatriz4x4() {
        return new int[4][4];
    }
}

