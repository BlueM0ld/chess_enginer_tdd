package board;

public class Position {
    int file;
    int rank;
    public Position(int rank, int file) {
        this.file = file;
        this.rank = rank;
    }

    public int getFile() {
        return file;
    }

    public int getRank() {
        return rank;
    }

}
