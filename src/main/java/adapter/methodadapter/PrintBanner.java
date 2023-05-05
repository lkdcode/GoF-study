package adapter.methodadapter;

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String message) {
        this.banner = new Banner(message);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
