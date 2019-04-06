package sda.AAAWyrazeniaLambda.UpperCase;

public class ToUpperCaseMain {

    public static void main(String[] args) {
        invokeText(new ToUpperCase() {
            @Override
            public void invoke(String text) {
                System.out.println("odwołaj się");
            }
        });
        invokeText((String text)-> {
            System.out.println("odwołaj się");
        });


    }

    public static void invokeText(ToUpperCase toUpperCase) {
        toUpperCase.invoke("odwołaj się do: ");
    }
}
