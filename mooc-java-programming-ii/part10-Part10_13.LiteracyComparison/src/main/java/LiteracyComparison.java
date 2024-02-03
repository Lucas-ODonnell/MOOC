
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try{
            Files.lines(Paths.get("literacy.csv"))
            .map(row -> row.split(",")).sorted((i,j)-> i[5].compareTo(j[5]))
            .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2].split(" ")[1].trim() + ", " + line[5]));
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

}
