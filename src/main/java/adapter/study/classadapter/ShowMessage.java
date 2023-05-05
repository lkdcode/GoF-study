package adapter.study.classadapter;

public class ShowMessage extends Message implements Show {


    public ShowMessage(String message) {
        super(message);
    }

    @Override
    public void showWeak() {
        makeWeakMessage();
    }

    @Override
    public void showStrong() {
        makeStrongMessage();
    }
}
