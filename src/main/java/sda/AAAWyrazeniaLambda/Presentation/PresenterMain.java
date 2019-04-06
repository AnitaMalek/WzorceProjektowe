package sda.AAAWyrazeniaLambda.Presentation;

public class PresenterMain {

    public static void main(String[] args) {

        //Sposób 1: - implementacja klasowa interfejsu
        Presenter presenter = new PresenterImpl();
        presentText(presenter);

        //Sposób 2: - implementacja klasy wewnętrznej
        /*Presenter presenter1 = new Presenter() {
            @Override
            public void present(String text) {
                System.out.println("Klasa wewnętrzna: " + text);
            }
        };*/
        Presenter presenter1 = (String text)->{
            System.out.println("Klasa wewnętrzna: " + text);
        };
        presentText(presenter1);

        //Sposób 3: - implementacja anonimowa
        /*presentText(new Presenter() {
            @Override
            public void present(String text) {
                System.out.println("Klasa anonimowa: " + text);
            }
        });*/
        presentText((String text) -> {
            System.out.println("Klasa anonimowa: " + text);
        });
    }

    public static void presentText(Presenter presenter) {

        presenter.present("text");
    }


}
