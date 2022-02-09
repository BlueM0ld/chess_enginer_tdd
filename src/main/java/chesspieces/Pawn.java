package chesspieces;

import board.Position;
import board.Tile;
import enumvalues.Side;
import exception.IllegalPositionException;

import java.util.ArrayList;
import java.util.List;

/**
 * Pawn
 */
public class Pawn extends Piece{

    Position position;
    Side side;


    public Pawn(Position position,Side side ){
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
        return side.equals(Side.WHITE) ? "P" : "p";
    }

    @Override
    public List<Position> movePositions(){
        List <Position> listOfMoves = new ArrayList<>();
        Position pawn = this.position;

        if(pawn.getRank()==2){
            listOfMoves.add(new Position(pawn.getRank()+1, pawn.getFile()));
            listOfMoves.add(new Position(pawn.getRank()+2, pawn.getFile()));
        }else{
            listOfMoves.add(new Position(pawn.getRank()+1, pawn.getFile()));
        }

        return listOfMoves;
    }

    public Boolean enPassantBoolean(){
        return false;
    }
}