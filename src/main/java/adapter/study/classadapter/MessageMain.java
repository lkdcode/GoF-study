package adapter.study.classadapter;

public class MessageMain {
    public static void main(String[] args) {

        Show show = new ShowMessage("message");
        show.showWeak();
        show.showStrong();

    }
}
