package enumvalues;

public enum Pieces {

    K('k','K'), //King
    Q('q','Q'), //Queen
    R('r','R'), //Rook
    B('b','B'), //Bishop
    N('n','N'), //Knight
    P('p','P'), //Pawn
    E('.'); //Empty

    char emptyTile;
    char asciiWhitePiece;
    char asciiBlackPiece;


    Pieces(char emptyTile){this.emptyTile=emptyTile;}
    Pieces(char asciiWhitePiece,char asciiBlackPiece)   {
        this.asciiWhitePiece = asciiWhitePiece;
        this.asciiBlackPiece = asciiBlackPiece;
    }
}
