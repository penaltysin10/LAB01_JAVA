package exercise7;

import java.util.ArrayList;

public class Dictionary {

    private ArrayList<Vocabulary> dictionary = new ArrayList<>();

    public void addVocabulary(Vocabulary vocab){
        dictionary.add(vocab);
    }

    public void removeVocabulary(Vocabulary vocab){
        dictionary.remove(vocab);
    }

    public int numOfVocabulary(){
        return dictionary.size();
    }

    public String findVocabulary(Vocabulary vocab){
        return String.format("Vocabulary: %s | part of speech: %s | meaning: %s | Example: %s"
                , dictionary.get(dictionary.indexOf(vocab)).getVocab(), dictionary.get(dictionary.indexOf(vocab)).getPartOfSpeech()
                , dictionary.get(dictionary.indexOf(vocab)).getMeaning(), dictionary.get(dictionary.indexOf(vocab)).getExample());
    }
}
