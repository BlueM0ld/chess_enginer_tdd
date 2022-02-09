package unit;

import board.Position;
import chesspieces.Pawn;
import chesspieces.Piece;
import enumvalues.Side;
import exception.IllegalPositionException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class) //Run with mockito

public class PawnTest {


    @Mock
    Position positionMock;


    @Test
    public void testPawnPositionStart() throws IllegalPositionException {
        //given
        Position pos = new Position(2,1);
        Piece pawn = new Pawn(pos, Side.BLACK);

        //when
        List<Position>potentialMoves = pawn.movePositions();

        //then
        Assertions.assertEquals(2, potentialMoves.size());
    }

    @Test
    public void testPawnPositionNonStart() throws IllegalPositionException {
        //given
        Position pos = new Position(3,1);
        Piece pawn = new Pawn(pos, Side.BLACK);

        //when
        List<Position>potentialMoves = pawn.movePositions();

        //then
        Assertions.assertEquals(1, potentialMoves.size());
    }

    @Test
    public void testPawnPromoting(){
        //given
        Position pos = new Position(7,1);
        Piece pawn = new Pawn(pos, Side.BLACK);







    }
}
