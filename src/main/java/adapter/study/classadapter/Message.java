package adapter.study.classadapter;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }

    public void makeStrongMessage() {
        System.out.println("*" + message + "*");
    }

    public void makeWeakMessage() {
        System.out.println("(" + message + ")");
    }
}
