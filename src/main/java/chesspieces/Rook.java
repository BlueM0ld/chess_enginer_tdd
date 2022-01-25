package chesspieces;

import board.Position;
import enumvalues.Side;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

    Position position;
    Side side;

    public Rook(Position position, Side side){
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
        return side.equals(Side.WHITE)? "R":"r";
    }

    @Override
    public List<Position> movePositions() {
        List<Position> listOfMoves = new ArrayList<>();
        int currentFilePosition = position.getFile();
        int currentRankPosition = position.getRank();


        for(int i = 0; i<8 ; i++) {
                listOfMoves.add(new Position(i, currentRankPosition));
                listOfMoves.add(new Position(currentFilePosition, i));
        }

        return null;
    }

}
