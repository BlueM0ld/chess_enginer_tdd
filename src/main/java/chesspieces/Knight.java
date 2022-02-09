package chesspieces;


import board.Position;
import enumvalues.Side;

import java.util.List;

/**
 * Knight
 */
public class Knight extends Piece {

    Position position;
    Side side;

    public Knight(Position position, Side side){
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
    public String typeOfPiece(){
        return side.equals(Side.WHITE) ? "N" : "n";
    }
    
    @Override
    public List<Position> movePositions(){

        return null;
    }

}