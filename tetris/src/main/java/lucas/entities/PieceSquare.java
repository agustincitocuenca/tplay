package lucas.entities;

public class PieceSquare {
    public  char[][] create_square() {
        char[][] s = new char[4][4];
        // Dibuja la pieza en forma de "Square"
        s[0][0] = '.';
        s[1][0] = '.';
        s[0][1] = '.';
        s[1][1] = '.';
        return s;  
}
}
