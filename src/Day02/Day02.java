package Day02;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day02 {

    List<Integer> integers;
    List<String> commands;

    public Day02() throws IOException {
        Path filePath = Paths.get("src/Day02/input.txt");
        Scanner scanner = new Scanner(filePath);
        integers = new ArrayList<>();
        commands = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                commands.add(scanner.next());
            }
        }
    }

    public int firstChallenge() {
        int horizontalPos = 0;
        int depth = 0;

        for(int i = 0; i < commands.size(); i++){
            if(commands.get(i).equals("forward")){
                horizontalPos += integers.get(i);
            } else if (commands.get(i).equals("down")){
                depth += integers.get(i);
            }else if (commands.get(i).equals("up")){
                depth -= integers.get(i);
            } else {
                System.out.println("Day02 : Bad submarine command : " + commands.get(i));
            }
        }
        return depth * horizontalPos;
    }

    public int secondChallenge() {
        int horizontalPos = 0;
        int depth = 0;
        int aim = 0;

        for(int i = 0; i < commands.size(); i++){
            if(commands.get(i).equals("forward")){
                horizontalPos += integers.get(i);
                depth += aim * integers.get(i);
            } else if (commands.get(i).equals("down")){
                aim += integers.get(i);
            }else if (commands.get(i).equals("up")){
                aim -= integers.get(i);
            } else {
                System.out.println("Day02 : Bad submarine command : " + commands.get(i));
            }
        }

        return depth * horizontalPos;
    }
}
