package Chess;

public class Board {
    public int lines;
    public int columns;
    public char figure;
    char [] arr1 = new char []{'8', ' ','\u265C',' ','\u265E',' ','\u265D',' ',
            '\u265B',' ','\u265A',' ','\u265D',' ','\u265E',' ','\u265C'};
    char [] arr2 = new char [] {'7', ' ','\u265F',' ','\u265F',' ','\u265F',' ',
            '\u265F',' ','\u265F',' ','\u265F',' ','\u265F',' ','\u265F'};
    char [] arr3 = new char []{'1', ' ','\u2656',' ','\u2658',' ','\u2657',' ',
            '\u2655',' ','\u2654',' ','\u2657',' ','\u2658',' ','\u2656'};
    char [] arr4 = new char [] {'2', ' ','\u2659',' ','\u2659',' ','\u2659',' ',
            '\u2659',' ','\u2659',' ','\u2659',' ','\u2659',' ','\u2659'};

    public void getLines() {
        for (int i = 6; i > 2; i--) {
            System.out.println(i+" * * * * * * * *");
        }
    }

}
