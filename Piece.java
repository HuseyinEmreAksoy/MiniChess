package Bil211;

public class Piece {
    private String position;
    private String color;
    private Board board;

    public Piece(String position, String color) {
        this.position = position;
        this.color = color;

    }
    public Piece(String color) {
        this.color = color;
    }

    //public boolean canMove(String newPosition){

        //return board.isEmpty(newPosition);
    //}
    //Hamleleri alfabetik sirada doner
    public String[] getAllMovesCheck() {
        return null;
    }
    public String[] getAllMoves() {
        return null;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition(){
        return position;
    }

    public String getColor(){
        return color;
    }
}