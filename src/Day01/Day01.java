package Day01;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day01 {

    List<Integer> integers;

    public Day01() throws IOException {
        Path filePath = Paths.get("src/Day01/depth.txt");
        Scanner scanner = new Scanner(filePath);
        integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
    }

    public int firstChallenge() {
        int lastInt = 1000000;
        int nbrIncrease = 0;
        for (Integer i : this.integers) {
            if(i > lastInt){
                nbrIncrease++;
            }
            lastInt =  i;
        }
        return nbrIncrease;
    }

    public int secondChallenge() {
        int pastWindow = 10000000;
        int nbrIncrease = 0;
        for (int i = 2; i < this.integers.size(); i++) {
            int currWindow = integers.get(i - 2) + integers.get(i - 1) + integers.get(i);
            if (currWindow > pastWindow) {
                nbrIncrease++;
            }
            pastWindow = currWindow;
        }
        return nbrIncrease;
    }
}
