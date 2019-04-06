package sda.AAAWyrazeniaLambda.Presentation;

public class PresenterImpl implements Presenter {
    @Override
    public void present(String text) {
        System.out.println("Twój presenter: " + text);

    }
}
