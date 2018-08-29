package exercise7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Vocabulary iterate = new Vocabulary("iterate", "Verb",
                "To say, or do again", "She kept reiterating her request.");
        dictionary.addVocabulary(iterate);
        System.out.println(dictionary.numOfVocabulary());
        System.out.println(dictionary.findVocabulary(iterate));
        dictionary.removeVocabulary(iterate);
        System.out.println(dictionary.numOfVocabulary());
    }
}
