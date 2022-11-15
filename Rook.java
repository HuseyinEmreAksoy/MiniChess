package Bil211;

public class Rook extends Piece {
    public Rook(String position, String color) {
        super(position, color);
    }

    public Rook(String color) {
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
        int i = 0;
        for (int j = 0; j < 9; j++) {
            int x = getPosition().charAt(1) - '0';
            int y = j;
            if (y < getPosition().charAt(0) - 'a') {
                char Yeks = (char) (y + 'a');
                move[i] = "" + Yeks + (x);
                i++;
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
        for (int j = 1; j < 9; j++) {
            int x = getPosition().charAt(1) - '0';
            int y = getPosition().charAt(0) - 'a'+j;
            if (y < 8) {
                char Yeks = (char) (y + 'a');
                move[i] = "" + Yeks + (x);
                i++;
            }
        }

        for (int j = 0; j < move.length; j++) {
            if (move[j] == null)
                move[j] = "";

        }
        return move;
    }

}
