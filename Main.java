import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Minimax minimax = new Minimax();
        minimax.miniMaxOpening("board1.txt board2.txt 2");
//        minimax.miniMaxGame("board3.txt board4.txt 3");
    }
}
