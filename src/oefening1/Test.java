package oefening1;

public class Test {
    public static void main(String[] args) {
        WordSearch w = new WordSearch();
        w.showList();
        System.out.println("Overview consonants in list");
        w.showConsonantsInList();
        System.out.println("Overview consonants NOT in list");
        w.showConsonantsNotInList();
        System.out.println("Overview characters in list with a given occurence");
        w.characterOccurence(2);
        w.characterOccurence(3);
        System.out.println("Removing highest occurence characters");
        w.removeHighest();
        w.showList();
    }
}
