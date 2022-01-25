package chesspieces;

import board.Position;
import enumvalues.Side;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece{


    Position position;
    Side side;
    //Maybe it will be easier ( ;-;)
    int [][] potentialMove = {
            {1,-1},
            {1,0},
            {1,1},
            {0,-1},
            {0,1},
            {-1,-1},
            {-1,0},
            {-1,1}
    };

    public King(Position position, Side side){this.position = position;
    this.side=side;}

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

        return side.equals(Side.WHITE) ? "K":"k";
    }

    @Override
    public List<Position> movePositions() {
        List <Position> listOfMoves = new ArrayList<>();
        // int kingFile = position.getFile();
        // int kingRank = position.getRank();
        // for(int i = 0; i<potentialMove.length; i++){

        //     listOfMoves.add(new Position(kingFile+potentialMove[i][i]));
        // }
        return listOfMoves;
    }

}
