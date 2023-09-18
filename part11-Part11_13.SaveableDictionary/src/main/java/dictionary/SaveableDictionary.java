/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author augma
 */
public class SaveableDictionary {
    
    private HashMap<String,String> dictionary;
    private String fileName;
    
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.fileName = file;
    }
    
    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.fileName));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                this.add(parts[0], parts[1]);
            }
            fileReader.close();
            return true;
        } catch(Exception e) {
            e.getStackTrace();
            this.dictionary.clear();
            return false;
        }
        
    }
    
    public boolean save() {
        try {
            PrintWriter saveToFile = new PrintWriter(this.fileName);

            for (String key : this.dictionary.keySet()) {
                saveToFile.println(key + ":" + this.dictionary.get(key));
            }
            
            saveToFile.close();
            return true;
        } catch(FileNotFoundException e) {
            e.getStackTrace();
            return false;
        }

    }
    
    public void add(String words, String translation) {
        if (!this.dictionary.containsKey(words)) {
            this.dictionary.put(words, translation);
        }
    }
    
    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }
    
    public void delete(String word) {
        if (this.dictionary.isEmpty()) {
            return;
        }
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
        if (this.dictionary.containsValue(word)) {
            this.dictionary.values().remove(word);
        }
    }
    
}
