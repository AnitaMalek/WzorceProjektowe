package sda.ObiektNull.Temperatures;

public class UnknownConverter implements TemperatureConverter {


    @Override
    public float convert(float temp) {
        System.out.println(" Nie ma takiej konwersji. ");
        return Integer.MIN_VALUE;
    }
}
