package sda.ObiektNull.Temperatures;

public class Convert {

    public static void main(String[] args) {
        TemperatureConverterFactoryMethod temperatureConverterFactoryMethod = new TemperatureConverterFactoryMethod();
        String temperatureToConvert [] = {"C->K", "C->F", "F->C"};
        for (String tempType: temperatureToConvert){
            TemperatureConverter temperatureConverter = temperatureConverterFactoryMethod.getConverter(tempType);
            System.out.println(temperatureConverter.convert(20));
        }
    }
}
