package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class SaveableDictionary {
    private HashMap<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.file))
            .map(line -> line.split(":"))
            .forEach(section -> {
                this.dictionary.putIfAbsent(section[0], section[1]);
                this.dictionary.putIfAbsent(section[1], section[0]);
            });
            return true;
        } catch(Exception e) {
            System.out.println("Exeption raised: " + e.getMessage());
            return false;
        }
    }

    public boolean save() {
        try {
        PrintWriter writer = new PrintWriter(new File(file));
        ArrayList<String> alreadyAdded = new ArrayList<>();
        
        this.dictionary.keySet().stream()
                .forEach(line -> {
                    if (alreadyAdded.contains(line)) {
                        return;
                    }
                    alreadyAdded.add(line);
                    alreadyAdded.add(dictionary.get(line));
                    writer.println(line + ":" + dictionary.get(line));
                        });
        writer.close();
        return true;
        }
        catch (Exception e) {
            System.out.println("You messed up: " + e.getMessage());
            return false;
        }
    }


    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        this.dictionary.remove(this.dictionary.get(word));
        this.dictionary.remove(word);
    }
}
