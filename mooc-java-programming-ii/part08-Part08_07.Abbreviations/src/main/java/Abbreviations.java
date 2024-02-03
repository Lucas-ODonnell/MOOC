import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviations;
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if(!this.hasAbbreviation(abbreviation)) {
            this.abbreviations.put(sanitize(abbreviation), sanitize(explanation));
        }
    }

    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.get(this.sanitize(abbreviation)) != null;
    }
    
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(this.sanitize(abbreviation));
    }

    public String sanitize(String string) {
        return string.toLowerCase().trim();
    }
    
}
