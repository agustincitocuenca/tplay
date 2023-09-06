package lucas.entities;

public class PieceL {
private char[][]l_left;
private int value_left;
private char[][]l_right;
private int value_right;
public PieceL(){
        l_left= new char[4][4];
        //Rellena la matriz
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        l_left[i][j] = 0;
                    }
            }
        // Dibuja la pieza en forma de "l"horientado a la derecha"
        l_left[0][0] = '.';
        l_left[1][0] = '.';
        l_left[2][0] = '.';
        l_left[2][1] = '.';
        
        //Valor de L-left
        value_left=0;
        l_right=new char[4][4];
        //Rellena la matriz
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        l_right[i][j] = 0;
                    }
            }
        // Dibuja la pieza en forma de "l"horientado a la izquierda"
        l_right[0][3] = '.';
        l_right[1][3] = '.';
        l_right[2][3] = '.';
        l_right[2][2] = '.';
        
        //Valor de L-right
        value_right=0;
}

public char[][]getl_left(){
    return l_left;
}
public char[][]getl_right(){
    return l_right;
}
public int getValue_left(){
    return value_left;
}
public int getValue_right(){
    return value_right;
}

public void rotateleft_l_left(){
    switch(value_left){
        //L mirando arriba
        case 0:
        char[][] t1=new char[4][4];
        t1[1][0] = '.';
        t1[1][1] = '.';
        t1[1][2] = '.';
        t1[0][2] = '.';
        value_left=1;
        //L mirando al costado
        case 1:
        char[][] t2=new char[4][4];
        t2[0][0] = '.';
        t2[0][1] = '.';
        t2[1][1] = '.';
        t2[2][1] = '.';
        value_left=2;
        //L mirando abajo
        case 2:
        char[][] t3=new char[4][4];
        t3[0][0] = '.';
        t3[0][1] = '.';
        t3[0][2] = '.';
        t3[1][0] = '.';
        value_left=3;
        //L de nuevo normal
        case 3:
        char[][] l1= new char[4][4];
        l1[0][0] = '.';
        l1[1][0] = '.';
        l1[2][0] = '.';
        l1[2][1] = '.';
        value_left=0;
        }

    }
}
/*  formas xd
        Lright
        L mirando arriba
        t1[1][0] = '.';
        t1[1][1] = '.';
        t1[1][2] = '.';
        t1[0][2] = '.';
        L mirando al costado
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[1][1] = '.';
        t1[2][1] = '.';
        L mirando abajo
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[0][2] = '.';
        t1[1][0] = '.';
        L de nuevo normal
        l1[0][0] = '.';
        l1[1][0] = '.';
        l1[2][0] = '.';
        l1[2][1] = '.';


        L.left
        L mirando abajo
        t1[0][0] = '.';
        t1[0][1] = '.';
        t1[0][2] = '.';
        t1[1][2] = '.';
        L mirando al costado
        t1[0][1] = '.';
        t1[1][1] = '.';
        t1[2][1] = '.';
        t1[0][2] = '.';
        L mirando arriba
        t1[0][0] = '.';
        t1[1][0] = '.';
        t1[1][1] = '.';
        t1[1][2] = '.';
        L normal de nuevo
        l2[0][3] = '.';
        l2[1][3] = '.';
        l2[2][3] = '.';
        l2[2][2] = '.'
 */