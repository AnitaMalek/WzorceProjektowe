package sda.Dekorator;

public class JavaText implements Decorator {

    private Decorator decoratorObject;

    public JavaText (Decorator decoratorObject) {
        this.decoratorObject = decoratorObject;
    }

    @Override
    public String getText(){
        return "text: " + decoratorObject.getText();
    }

}
