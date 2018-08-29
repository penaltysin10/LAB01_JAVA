package exercise7;

public class Vocabulary {

    private String vocab;
    private String partOfSpeech;
    private String meaning;
    private String example;

    public Vocabulary(String vocab, String partOfSpeech, String meaning, String example) {
        this.vocab = vocab;
        this.partOfSpeech = partOfSpeech;
        this.meaning = meaning;
        this.example = example;
    }

    public String getVocab() {
        return vocab;
    }

    public void setVocab(String vocab) {
        this.vocab = vocab;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
