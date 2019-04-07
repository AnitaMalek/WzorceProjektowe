package sda.ObiektNull.Temperatures;

public class CelcToFahr implements TemperatureConverter{

    @Override
    public float convert(float temp) {
        float Fahr = temp*33.8f;
        System.out.println("Fahrenheity: " + Fahr);
        return Fahr;
    }
}
