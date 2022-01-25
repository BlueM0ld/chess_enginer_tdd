package chesspieces;


import board.Position;
import enumvalues.Side;

import java.util.ArrayList;
import java.util.List;


public class Bishop extends Piece{


    Position position;
    Side side;
    public Bishop(Position position, Side side){this.position = position; this.side = side;}

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
        return side.equals(Side.WHITE) ? "B":"b";
    }

    @Override
    public List<Position> movePositions() {
        List<Position> listOfMoves = new ArrayList<>();
        return listOfMoves;
    }

}
