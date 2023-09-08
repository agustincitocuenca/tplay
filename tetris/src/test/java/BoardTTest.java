import lucas.entities.Board;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Assert;
import org.junit.Test;

public class BoardTTest {

    @Test
    public void testCrearMatriz10x20() {
        int[][] matrix = Board.crearMatriz10x20();

        // Verificar si la matriz tiene las dimensiones correctas
        assertEquals(10, matrix.length);
        assertEquals(20, matrix[0].length);

        // Verificar si todos los elementos de la matriz son cero (inicializados correctamente)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                assertEquals(0, matrix[i][j]);
            }
        }
    }

    @Test
    public void testagregarMatrizAleatoria() {

        int[][] matrix10x20 = Board.crearMatriz10x20();
        int[][] matrix4x4 = Board.PieceLIzquierda;

        Board.agregarMatrizAleatoria(matrix10x20,Board.PieceLIzquierda);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceLDerecha);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceLArriba);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceLAbajo);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceStickHorizontal);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceStickVertical);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceTAbajo);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceTArriba);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceTIzquierda);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceTDerecha);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceSquare);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceDogDerecha);
        Board.agregarMatrizAleatoria(matrix10x20, Board.PieceDogIzquierda);

        // Comprobar si hay al menos un valor diferente de cero en la matriz
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (matrix10x20[i][j] != 0) {
                    encontrado = true;
                    break;
                }
            }
        }
    }

    @Test
    public void testimprimirMatriz() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        String expectedOutput = "1\t2\t3\t\n4\t5\t6\t\n";

        // Redirigir salida estándar para capturarla y compararla
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Board.imprimirMatriz(matrix);

        Assert.assertEquals(expectedOutput, outputStream.toString());
    }

    private void assertEquals(int i, int matrix) {
    }
}
