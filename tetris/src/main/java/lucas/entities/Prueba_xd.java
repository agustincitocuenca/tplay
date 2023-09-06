package lucas.entities;

public class Prueba_xd {
    public static void main(String[] args) {
        char[][] t1 = new char[4][4];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                t1[i][j] = '0';
            }
        }
        // Dibuja la pieza en forma de "T"
        t1[0][0] = '.';
        t1[1][
            0] = '.';
        t1[2][0] = '.';
        t1[2][1] = '.';



        // Imprime la matriz
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[i].length; j++) {
                System.out.print(t1[i][j]);
            }
            System.out.println();
        }
    }

   
}
