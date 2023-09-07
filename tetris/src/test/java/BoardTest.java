public class TestMatriz {
    public static void main(String[] args) {
        int[][] matriz = Main.crearMatriz(10, 20);

        // Verificar que la matriz tiene el tamaño correcto
        assert matriz.length == 10;
        assert matriz[0].length == 20;

        // Verificar que los valores están dentro del rango esperado
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                assert matriz[i][j] >= 0 && matriz[i][j] <= 99;
            }
        }

        System.out.println("Test completado con éxito.");
    }
}
