package dictionary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("word-474735734.txt");
        //System.out.println(s.load());
        s.load();
        s.delete("below");
        s.add("tieokone", "computer");
        s.save();
    }
}
