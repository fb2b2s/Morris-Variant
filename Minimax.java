import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Minimax {
    public void miniMaxOpening(String input) throws FileNotFoundException {
        List<String> pos = List.of(input.split(" "));
        File file = new File(pos.get(0));
        Scanner myCursor = new Scanner(file);
        while(myCursor.hasNextLine()) {
            String boardPos = myCursor.nextLine();
            System.out.println(boardPos);
        }

    }

    public void miniMaxGame(String input) {
        List<String> pos = List.of(input.split(" "));

    }
}
