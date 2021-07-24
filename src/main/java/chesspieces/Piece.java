package chesspieces;


import board.Position;


public abstract class Piece {

    public abstract Position getPosition();

    public abstract void setPosition(Position position);

    public String typeOfPiece() {
        return "empty";
    }

//    public List<Position> movePositions(Tile tile, ChessBoard chessBoard);

}
