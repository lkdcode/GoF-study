package adapter.study.methodadapter;

public class AdapterMain {
    public static void main(String[] args) {
        Message message = new MessageImpl("message");
        message.strong();
        message.weak();

    }
}
