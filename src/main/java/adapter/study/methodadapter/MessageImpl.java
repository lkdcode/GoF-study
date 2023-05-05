package adapter.study.methodadapter;

public class MessageImpl extends Message {

    private Word word;

    public MessageImpl(String word) {
        this.word = new Word(word);
    }

    @Override
    public void strong() {
        word.printStrongWord();
    }

    @Override
    public void weak() {
        word.printWeakWord();
    }
}
