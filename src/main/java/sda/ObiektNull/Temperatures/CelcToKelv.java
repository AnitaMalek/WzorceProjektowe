package sda.ObiektNull.Temperatures;

public class CelcToKelv implements TemperatureConverter {

    @Override
    public float convert(float temp) {
        float Kelv = temp*274.15f;
        System.out.println("Kelwiny: " + Kelv);
        return Kelv;
    }
}
