package board;

import chesspieces.Piece;

public class Tile {

    private final Position position;
    private boolean isOccupied;
    private Piece piece;

    public Tile(Position position,Piece piece){
        this.position = position;
        this.isOccupied = false;
        this.piece = piece;
    }

    public Tile(Position position){
        this.position = position;
        this.isOccupied = false;
        piece = null;
    }
    public void setPiece(Piece piece) {
        this.piece = piece;
        this.isOccupied = true;
    }

    public Piece getPiece() {
        return piece;
    }

    public void removePiece() {
        this.setPiece(null);
        this.isOccupied = false;
    }

    public Boolean isTileOccupied() {
        return isOccupied;
    }
}
