package Bil211;

public class Pawn extends Piece {
    private final int[][] posMovesWh = {{-1, 1}, {0, 1}, {1, 1}};
    private final int[][] posMovesWhStart = {{-1, 1}, {0, 1}, {0, 2}, {1, 1}};
    private final int[][] posMovesBl = {{-1, -1}, {0, -1}, {1, -1}};
    private final int[][] posMovesBlStart = {{-1, -1}, {0, -2}, {0, -1}, {1, -1}};
    private boolean isWhite;

    public Pawn(String position, String color) {
        super(position, color);
        isWhite = color.equals("white");
    }

    public Pawn(String color) {
        super(color);
        isWhite = color.equals("white");
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
        int x = getPosition().charAt(1) - '0';

        int y = getPosition().charAt(0) - 'a';
        int i = 0;
        if (!isWhite)
            if (getPosition().charAt(1) - '0' == 7)
                for (int[] posMove : posMovesBlStart) {
                    int posX = x + posMove[1];
                    int posY = y + posMove[0];

                    if (posX < 9 && posY < 8 && 0 < posX && -1 < posY) {
                        char Yeks = (char) (posY + 'a');
                        move[i] = "" + Yeks + (posX);
                        i++;
                    }
                }
            else
                for (int[] posMove : posMovesBl) {
                    int posX = x + posMove[1];
                    int posY = y + posMove[0];

                    if (posX < 9 && posY < 8 && 0 < posX && -1 < posY) {
                        char Yeks = (char) (posY + 'a');
                        move[i] = "" + Yeks + (posX);
                        i++;
                    }
                }
        if (isWhite)
            if (getPosition().charAt(1) - '0' == 2)
                for (int[] posMove : posMovesWhStart) {
                    int posX = x + posMove[1];
                    int posY = y + posMove[0];

                    if (posX < 9 && posY < 8 && 0 < posX && -1 < posY) {
                        char Yeks = (char) (posY + 'a');
                        move[i] = "" + Yeks + (posX);
                        i++;
                    }
                }
            else
                for (int[] posMove : posMovesWh) {
                    int posX = x + posMove[1];
                    int posY = y + posMove[0];

                    if (posX < 9 && posY < 8 && 0 < posX && -1 < posY) {
                        char Yeks = (char) (posY + 'a');
                        move[i] = "" + Yeks + (posX);
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
