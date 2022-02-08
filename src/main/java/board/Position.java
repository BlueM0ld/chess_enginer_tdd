package board;
import exception.IllegalPositionException;

public class Position {
    int file;
    int rank;
    String chessNotation;
    public Position(int rank, int file) throws IllegalPositionException {
        if(rank >= 0 || rank < 7){
            this.file = file;
            this.rank = rank;
        }else {
            throw new IllegalPositionException("Invalid Position");
        }
        this.chessNotation= chessNotation(rank,file);

    }

    private String chessNotation(int rank, int file) {
        String value = "a";
        String fileToString = String.valueOf(rank+1);
        for (int j = 0; j < file; j++) {
            int charValue = value.charAt(0);
            value = String.valueOf( (char) (charValue + 1));
        }
        return new String(value+fileToString);
    }

    public int getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }


    public String getChessNotation(){
        return this.chessNotation;
    }

}
