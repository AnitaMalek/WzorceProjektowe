package sda.Dekorator;

public class PHPText implements Decorator{

    private Decorator decoratorObject;

    public PHPText (Decorator decoratorObject) {
        this.decoratorObject = decoratorObject;
    }

    @Override
    public String getText() {
        return "text: " + decoratorObject.getText() + "  koniec";
    }



}
