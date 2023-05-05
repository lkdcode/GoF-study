package adapter.methodadapter;

public class AdapterMain {
    public static void main(String[] args) {
        Print print = new PrintBanner("title");

        print.printWeak();
        print.printStrong();
    }
}
