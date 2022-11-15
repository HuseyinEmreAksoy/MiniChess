package Bil211;
import java.util.Arrays;
public class Queen extends Piece {
    public Queen(String position, String color) {
        super(position, color);
    }

    public Queen(String color) {
        super(color);
    }

    public boolean canMove(String newPos) {
        String[] moves = getAllMoves();
        for (String move : moves)
            if (move.equals(newPos))
                return true;
        return false;

    }
    public String[] getAllMoves() {
        int index = 0;
        String[] moves;
        for (int i = 0; i<getAllMovesCheck().length; i++)
            if (!getAllMovesCheck()[i].equals(""))
                index++;
        moves = new String[index];
        for (int i = 0; i<moves.length; i++)
            moves[i] = getAllMovesCheck()[i];

        return moves;
    }

    public String[] getAllMovesCheck() {
        String[] move = new String[64];

        int a;
        int b = 0;
        boolean flag = true;
        int i = 0;
        int index1 = 0;
        int index2 = 0;
        for (int j = 0; j < 8; j++) {
            if ((getPosition().charAt(0) - 'a') - j >= 0 && (getPosition().charAt(1) - '0') + j < 9)
                index1++;
            if ((getPosition().charAt(0) - 'a') - j >= 0 && (getPosition().charAt(1) - '0') - j > 0)
                index2++;
        }
        for (int j = 0; j < 9; j++) {

            if (index1 > index2) {

                if (j < (getPosition().charAt(0) - 'a') + 1 - (getPosition().charAt(1) - '0') && flag) {
                    b++;
                }
                else {

                    if (j >= (getPosition().charAt(0) - 'a') + 1 - (getPosition().charAt(1) - '0')) {
                        a = j - b;
                        int x2 = a;
                        int y2 = (getPosition().charAt(0) - 'a') + 1 - (getPosition().charAt(1) - '0') + a;
                        if (y2 < getPosition().charAt(0) - 'a') {

                            char Yeks = (char) (y2 + 'a');
                            move[i] = "" + Yeks + (x2 + 1);
                            i++;
                        }
                    }
                }
                    int x3 = getPosition().charAt(1) - '0';
                    int y3 = j;
                    if (y3 < getPosition().charAt(0) - 'a') {
                        char Yeks = (char) (y3 + 'a');
                        move[i] = "" + Yeks + (x3);
                        i++;
                    }

                    int x = getPosition().charAt(1) - '0' + (getPosition().charAt(0) - 'a') - j;
                    int y = j;
                    if (x < 9 && y < getPosition().charAt(0) - 'a') {
                        char Yeks = (char) (y + 'a');
                        move[i] = "" + Yeks + (x);
                        i++;
                    }

            } else if (index1 == index2) {
                int x = (getPosition().charAt(1) - '0') - index1 +1 + j;
                int y = j;
                if (y < (getPosition().charAt(0) - 'a')) {
                    char Yeks = (char) (y + 'a');
                    move[i] = "" + Yeks + (x );
                    i++;
                }
                int x3 = getPosition().charAt(1) - '0';
                int y3 = j;
                if (y3 < getPosition().charAt(0) - 'a') {
                    char Yeks = (char) (y3 + 'a');
                    move[i] = "" + Yeks + (x3);
                    i++;
                }
                int x2 = (getPosition().charAt(1) - '0') + index1 -1 - j;
                int y2 = j;
                if ( y2 < (getPosition().charAt(0) - 'a')) {
                    char Yeks = (char) (y2 + 'a');
                    move[i] = "" + Yeks + (x2 );
                    i++;
                }

            } else {

                    int x = j;
                    int y = (getPosition().charAt(0) - 'a') - (getPosition().charAt(1) - '0') + 1 + j;
                    if (x < 9 && y < getPosition().charAt(0) - 'a') {
                        char Yeks = (char) (y + 'a');
                        move[i] = "" + Yeks + (x + 1);
                        i++;
                    }
                    int x3 = getPosition().charAt(1) - '0';
                    int y3 = j ;
                    if (y3 < getPosition().charAt(0) - 'a') {
                        char Yeks = (char) (y3 + 'a');
                        move[i] = "" + Yeks + (x3);
                        i++;
                    }
                    if (j < index2 - index1)
                        b++;
                    else {
                        a = j - b;
                        int x2 = 8 - a;
                        int y2 = (getPosition().charAt(0) - 'a') - index1 + 1 + a;
                        if (y2 < getPosition().charAt(0) - 'a') {

                            char Yeks = (char) (y2 + 'a');
                            move[i] = "" + Yeks + (x2);
                            i++;
                        }
                    }
            }
        }
        for (int j = 1; j < 9; j++) {
            int x = j;
            int y = getPosition().charAt(0) - 'a';
            if (x < getPosition().charAt(1) - '0') {
                char Yeks = (char) (y + 'a');
                move[i] = "" + Yeks + (x);
                i++;
            }
        }
        for (int j = 1; j < 9; j++) {
            int x = getPosition().charAt(1) - '0' + j;
            int y = getPosition().charAt(0) - 'a';
            if (x < 9) {
                char Yeks = (char) (y + 'a');
                move[i] = "" + Yeks + (x);
                i++;
            }
        }
        for (int k = 1; k < 9; k++) {
            int x = (getPosition().charAt(1) - '0') - k;
            int y = (getPosition().charAt(0) - 'a') + k;
            if (0 < x && y < 8) {
                char Yeks = (char) (y + 'a');
                move[i] = "" + Yeks + (x);
                i++;
            }
                int x3 = getPosition().charAt(1) - '0';
                int y3 = getPosition().charAt(0) - 'a'+k;
                if (y3 < 8) {
                    char Yeks = (char) (y3 + 'a');
                    move[i] = "" + Yeks + (x3);
                    i++;
                }
            int x2 = (getPosition().charAt(1) - '0') + k;
            int y2 = (getPosition().charAt(0) - 'a') + k;
            if (x2 < 9 && y2 < 8) {
                char Yeks = (char) (y2 + 'a');
                move[i] = "" + Yeks + (x2);
                i++;
            }
        }
        for (int j = 0; j < move.length; j++) {
            if (move[j] == null)
                move[j] = "z9";
        }
        Arrays.sort(move);
        for (int j = 0; j < move.length; j++) {
            if (move[j].equals("z9"))
                move[j] = "";
        }
        return move;
    }
}
