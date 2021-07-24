package chesspieces;

import board.Position;
import enumvalues.Side;


public class Queen extends Piece{
    Position position;
    Side side;

    public Queen(Position position, Side side){
        this.position = position;
        this.side = side;
    }

    @Override
    public Position getPosition() {
        return position;
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String typeOfPiece() {
        return side.equals(Side.WHITE)? "Q":"q";
    }
//
//    @Override
//    public List<Position> movePositions(ChessBoard board) {
//        return null;
//    }
//
}
