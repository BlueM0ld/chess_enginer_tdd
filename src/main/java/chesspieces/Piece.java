package chesspieces;


import board.Position;

import java.util.List;


public abstract class Piece {

    public abstract Position getPosition();

    public abstract void setPosition(Position position);

    public String typeOfPiece() {
        return "empty";
    }

    public abstract List<Position> movePositions();

}
