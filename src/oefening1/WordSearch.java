package oefening1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class WordSearch {
    private String[] vowels = new String[]{"A", "E", "I", "O", "U", "Y"};
    private String[] consonants = new String[]{"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "R", "S", "T", "V", "W", "Z"};
    private HashMap<String, Integer> list = new HashMap<>();

    public WordSearch() {
        loadVowels();
        loadConsonants();
    }

    private void loadVowels() {
        list.put(vowels[0], 2);
        list.put(vowels[1], 3);
        list.put(vowels[2], 1);
        list.put(vowels[3], 1);
        list.put(vowels[4], 1);
        list.put(vowels[5], 1);
    }

    private void loadConsonants() {
        Random r = new Random();
        for (int i=0; i<25; i++) {
            int index = r.nextInt(consonants.length);
            list.put(consonants[index], list.getOrDefault(consonants[index], 0) + 1);
        }
    }

    public void showCharactersInList() {

    }

    public void showConsonantsNotInList() {

    }

    public void characterOccurence(int count) {

    }

    public void removeHighest() {

    }

    public void showList() {
        System.out.println(list);
    }
}
