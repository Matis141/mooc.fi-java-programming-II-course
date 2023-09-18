
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author augma
 */
public class Abbreviations {
    
    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        if (this.hasAbbreviation(abbreviation)) {
            System.out.println("Abbreviation is already in the library!");
        } else {
            abbreviations.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        if (!(this.hasAbbreviation(abbreviation))) {
            return null;
        } else {
            return this.abbreviations.get(abbreviation);
        }
    }
    
}
