package chesspieces;


import board.Position;
import enumvalues.Side;

/**
 * Knight
 */
public class Knight extends Piece {

    Position position;

    public Knight(Position position, Side side){
        this.position = position;
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
    public String typeOfPiece(){
        return "knight";
    };
    
//    @Override
//    public List<Position> movePositions(ChessBoard chessBoard){
//
//        return null;
//    };
//
}