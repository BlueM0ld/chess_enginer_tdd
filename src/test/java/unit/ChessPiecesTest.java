package unit;

import board.Position;
import chesspieces.Pawn;
import chesspieces.Piece;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class) //Run with mockito

public class ChessPiecesTest {


    @Mock
    Position positionMock;


    @Test
    public void testPawnMovePositions(){
        //given
        Piece pawnPiece = new Pawn(positionMock);
        //when
        pawnPiece.getMoves();
//        //then
        Assertions.assertEquals(getStandardBoard.length,64);
    }

}
