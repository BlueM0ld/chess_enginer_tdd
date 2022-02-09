package board;

import chesspieces.*;
import enumvalues.Side;
import exception.IllegalPositionException;

import java.util.HashMap;
import java.util.Map;

public class ChessBoard {
    private final Map<Tile, Piece> whiteOccupiedTiles = new HashMap<>();
    private final Map<Tile, Piece>  blackOccupiedTiles = new HashMap<>();

    Tile[][] board = new Tile[8][8];
    public ChessBoard(){
        //standardBoard
        char[] standardSetup = new BoardSetup().standardBoardSetup();
        int boardPointer = 0;
        for (int rank = 7; rank >= 0; rank--) {
            for (int file = 0; file <8; file++) {
                Position tilePosition = new Position(rank, file);
                Tile tile =  setPiece(standardSetup[boardPointer],tilePosition);
                board[rank][file] = tile;
                boardPointer++;
            }
        }

    }


    private Tile setPiece(char c, Position tilePosition) {
        Tile tile;
        if(c == '.'){ return new Tile(tilePosition);}

        Piece piece;
        Side side = Side.isWhatSide(c);
        char setToLower = Character.toLowerCase(c);

        switch(setToLower){
            case 'k':
                // well this is sus....whoops
                piece = new King(tilePosition, side);
                break;

            case 'q':
                piece = new Queen(tilePosition,side);
                break;

            case 'b':
                piece = new Bishop(tilePosition,side);
                break;

            case 'n':
                piece = new Knight(tilePosition,side);
                break;

            case 'r':
                piece = new Rook(tilePosition,side);
                break;

            default:    //default is pawn
                piece = new Pawn(tilePosition,side);
                break;
        }
        tile = new Tile(tilePosition,piece);

        if(side.equals(Side.WHITE)){whiteOccupiedTiles.put(tile,piece);}
        if(side.equals(Side.BLACK)){blackOccupiedTiles.put(tile,piece);}
        return tile;
    }


    public Tile[][] getBoard() {
        return board;
    }

    public void setBoard(Tile[][] board) {
        this.board = board;
    }

    public Map<Tile, Piece> getTilesOccupiedByWhite() {
        return whiteOccupiedTiles;
    }

    public Map<Tile, Piece> getTilesOccupiedByBlack() {
        return blackOccupiedTiles;
    }


    public Tile getTile(Position position){
        int file = position.getFile();
        int rank = position.getRank();

        return board[rank][file];
    }

    public Position getPosition(String chessNotationString){

        int fileV= calculateFile(chessNotationString);
        int rankV= calculateRank(chessNotationString);

        return new Position(rankV,fileV);
    }

    public int calculateFile(String chessNotationString) {
        // a is 97
        char file =chessNotationString.charAt(0); //d 100

        return (int) file -97;
    }
    public int calculateRank(String chessNotationString) {
        char rank =chessNotationString.charAt(1); //d 100
        int changeRank = Character.getNumericValue(rank);
        return  changeRank-1;
    }

    public void printBoard(){
        for (int rank = 0; rank < 8; rank++) {
            for (int file = 0; file <8; file++) {
                Tile tile = board[file][rank];
                if(tile.isOccupied){System.out.print(tile.getPiece().typeOfPiece());}
                else{System.out.print(".");}
                System.out.print("  ");
            }
            System.out.println();

    }
}

}