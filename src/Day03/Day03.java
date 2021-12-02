package Day03;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Day03 {

    ArrayList<Integer> integers;

    public Day03() throws IOException {
        Path filePath = Paths.get("C:/Users/pism/Documents/AOC/src/Day/input.txt");
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
        return 0;
    }

    public int secondChallenge() {
        return 0;
    }
}
