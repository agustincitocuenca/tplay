package lucas.entities;

public class Piecet {
    private char[][] piecet;
    private int value;/*value= posicion que corresponde */
    public Piecet(){
        piecet= new char[4][4];
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            piecet[i][j] = 0;
            }
        }
        piecet[0][0] = '.';
        piecet[0][1] = '.';
        piecet[0][2] = '.';
        piecet[1][1] = '.';

        value=1;
    }
    public char[][]getPiecet(){
        return piecet;
    }
    public int getValue(){
        return value;
    }
    
    public void rotate_left(){
        switch(value){
        /*t a la izquierda */
        case 1:
        char[][] t3 = new char[4][4];
        t3[0][3]= '.';
        t3[1][3]= '.';
        t3[2][3]= '.';
        t3[1][2]= '.';
        piecet= t3;
        value=2;
        break;
        /*t orientada abajo */
        case 2:
        char[][] t4 = new char[4][4];
        t4[1][0] = '.';
        t4[1][1] = '.';
        t4[1][2] = '.';
        t4[0][1] = '.';
        piecet= t4;
        value=3;
        break;
        /*t orientada  a la derecha */
        case 3:
        char[][] t5 = new char[4][4];
        t5[0][3] = '.';
        t5[1][3] = '.';
        t5[1][2] = '.';
        t5[2][3] = '.';
        piecet= t5;
        value=4;
        /*t de nuevo en posicion normal */
        case 4:
        char[][] t6 = new char[4][4];
        t6[0][0] = '.';
        t6[0][1] = '.';
        t6[1][1] = '.';
        t6[0][2] = '.';
        piecet= t6;
        value=1;
    }
    }

}












/* 
public  char[][] create_t() {
        char[][] t1 = new char[4][4];
        // Dibuja la pieza en forma de "T"
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[0][2] = '.';
        t1[1][1] = '.';
        return t1;  
}
// Dibuja la pieza en forma de "T" rotada a la derecha
public char[][] create_t_right(){
    char[][] t2 = new char[4][4];
    t2[0][0]= '.';
    t2[1][0]= '.';
    t2[2][0]= '.';
    t2[1][1]= '.';
    return t2;
}
// Dibuja la pieza en forma de "T" rotada a la izquierda
public char[][] create_t_left(){
    char[][] t3 = new char[4][4];
    t3[0][3]= '.';
    t3[1][3]= '.';
    t3[2][3]= '.';
    t3[1][2]= '.';
    return t3;
}*/
