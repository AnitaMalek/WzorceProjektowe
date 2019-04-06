package sda.AAAWyrazeniaLambda.Conversion;

public class ConverterMain {

    public static void main(String[] args) {
        convertText((int intValue, double doubleValue)-> {
            System.out.println(intValue + doubleValue);
        });

    }

    public static void convertText(Converter converter) {
        converter.convert(100, 200.0);
    }
}
