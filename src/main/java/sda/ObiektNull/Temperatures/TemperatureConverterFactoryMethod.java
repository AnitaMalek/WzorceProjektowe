package sda.ObiektNull.Temperatures;

public class TemperatureConverterFactoryMethod {

    TemperatureConverter getConverter(String type) {

        if (type.equals("C->F")){
            return new CelcToFahr();
        }else if (type.equals("C->K")){
            return new CelcToKelv();
        }else {
            return new UnknownConverter();
        }

    }
}
