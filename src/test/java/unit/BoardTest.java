package unit;

import board.BoardSetup;

import board.ChessBoard;
import board.Position;
import board.Tile;
import chesspieces.Piece;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) //Run with mockito
public class BoardTest {


    @Mock
    Position positionMock;

    @Mock
    Piece pieceMock;


    @Test
    public void testStandardBoard(){
        //given
        BoardSetup boardSetup = new BoardSetup();
        //when
        char [] getStandardBoard = boardSetup.standardBoardSetup();
        //then
        Assertions.assertEquals(getStandardBoard.length,64);
    }

    @Test
    public void testChessBoardInitialPieces(){
        //given
        ChessBoard chessBoard = new ChessBoard();
        //when
        int numberOfWP = chessBoard.getAllWhitePieces().size();
        int numberOfBP = chessBoard.getAllBlackPieces().size();

        //then
        Assertions.assertEquals(numberOfBP, 16);
        Assertions.assertEquals(numberOfWP,16);
        //Assertions.assertEquals(getStandardBoard.length,64);
    }



    @Test
    public void addPieceOnTile(){
        //given an emptyTile
        Tile tileTest = new Tile(positionMock);
        //when
        tileTest.setPiece(pieceMock);
        //then
        Assertions.assertEquals(tileTest.getPiece(),pieceMock);
        Assertions.assertEquals(tileTest.isTileOccupied(), true);

    }


    @Test
    public void removePieceOnTile(){
        //given an emptyTile
        Tile tileTest = new Tile(positionMock,pieceMock);
        //when
        tileTest.removePiece();
        //then
        Assertions.assertEquals(tileTest.getPiece(),null);
        Assertions.assertEquals(tileTest.isTileOccupied(), false);
    }

}
