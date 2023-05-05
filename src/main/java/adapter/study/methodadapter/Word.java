package adapter.study.methodadapter;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public void printWeakWord() {
        System.out.println("(" + word + ")");
    }

    public void printStrongWord() {
        System.out.println("*" + word + "*");
    }
}
