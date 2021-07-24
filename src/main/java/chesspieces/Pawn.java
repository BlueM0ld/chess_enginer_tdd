package chesspieces;

import board.Position;
import enumvalues.Side;

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

//    @Override
//    public List<Position> movePositions(ChessBoard board) {
//        return null;
//    }

//    @Override
//        public List<Position> movePositions(Tile tile,ChessBoard chessBoard){
//            List <Position> listOfMoves = new ArrayList<>();
//            //int currentRankPos = position.getRank();
//            //TODO At the first move can move 1 square or 2 square else 1
//            //TODO Capture is opposite piece is 1 square diagonal
//
//            Position futurePosition;
//            try {
//                //Lmaooooooo gotta figure out black cause the moves are inverted....whoops
//                futurePosition = new Position(this.position.getRank()+1, this.position.getFile());
//            } catch (IllegalPositionException e) {
//                e.printStackTrace();
//                return listOfMoves;
//            }
//            //Get future position of the chess piece
//            final Tile futureMove =chessBoard.getTile(futurePosition);
//
//    //        if (!futureMove.getIsOccupied() && futureMove.getPosition().getFile() == 7){
//               //TODO Promote Pawn
//    //        }
//             if(!futureMove.getIsOccupied()) listOfMoves.add(futurePosition);
//
//
//            return listOfMoves;
//        };



    public Boolean enPassantBoolean(){
        return false;
    };
}