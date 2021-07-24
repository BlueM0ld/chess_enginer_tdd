package chesspieces;

import board.Position;
import enumvalues.Side;

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

//    @Override
//    public List<Position> movePositions(ChessBoard board) {
//        List<Position> listOfMoves = new ArrayList<>();
//        int currentFilePosition = position.getFile();
//        int currentRankPosition = position.getRank();
//
//        // Position futurePosition;
//
//        try{
//            for(int i = 0; i<8 ; i++) {
//                listOfMoves.add(new Position(i, currentRankPosition));
//                listOfMoves.add(new Position(currentFilePosition, i));
//            }
//        }catch (IllegalPositionException e){
//            System.out.println("Illegal move caught");
//        }
//        return null;
//    }

}
