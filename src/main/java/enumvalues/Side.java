package enumvalues;

public enum Side {
    BLACK,
    WHITE,
    NONE;

    public Side turn(){
        if(this.equals( WHITE)){
            return BLACK;
        }else{
            return WHITE;
        }
    }

    public static Side isWhatSide(char c) {
        if(Character.isLowerCase(c)){return Side.BLACK;}
        if(Character.isUpperCase(c)){return Side.WHITE;}
        return Side.NONE;
    }
}
