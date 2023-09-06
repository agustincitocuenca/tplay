package lucas.entities;

public class PieceStick {
        private char[][] piece_stick;
        private int value;
        public  PieceStick(){
        piece_stick= new char[4][4];
        /*Relleno matriz */
        for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
                piece_stick[i][j] = 0;
                }
        }
        // Dibuja la pieza en forma de "Stick" vertical
        piece_stick[0][0] = '.';
        piece_stick[1][0] = '.';
        piece_stick[2][0] = '.';
        piece_stick[3][0] = '.';
        value=1;
        }
        public char[][]getPiecet(){
                return piece_stick;
        }
        public int getValue(){
                return value;
        }
        public void rotate_left(){
                switch(value){
                /*Stick horizontal */
                case 1:
                char[][] t2 = new char[4][4];
                t2[0][0]= '.';
                t2[0][1]= '.';
                t2[0][2]= '.';
                t2[0][3]= '.';
                piece_stick=t2;
                value=2;
                break;
                /*stick vertical*/
                case 2:
                char[][] t1 = new char[4][4];
                t1[0][0]= '.';
                t1[1][0]= '.';
                t1[2][2]= '.';
                t1[0][3]= '.';
                piece_stick=t1;
                value=1;
                break;
                }
        }
        
}
