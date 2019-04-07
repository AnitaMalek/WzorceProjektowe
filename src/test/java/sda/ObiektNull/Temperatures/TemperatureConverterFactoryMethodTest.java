package sda.ObiektNull.Temperatures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TemperatureConverterFactoryMethodTest {

    private TemperatureConverterFactoryMethod temperatureConverterFactoryMethod;

    @Before
    public void init(){
        temperatureConverterFactoryMethod = new TemperatureConverterFactoryMethod();
    }

    @Test
    public void test_if_return_celc_to_kelv_conversion() {

        //given:

        //when:
        TemperatureConverter temperatureConverter = temperatureConverterFactoryMethod.getConverter("C->K");

        //then:
        assertNotNull(temperatureConverter);
        assertTrue(temperatureConverter instanceof CelcToKelv);

    }

    @Test
    public void test_if_return_celc_to_fahr_conversion() {

        //given:

        //when:
        TemperatureConverter temperatureConverter = temperatureConverterFactoryMethod.getConverter("C->F");

        //then:
        assertNotNull(temperatureConverter);
        assertTrue(temperatureConverter instanceof CelcToFahr);

    }

    @Test
    public void test_if_return_null_object() {

        //given:

        //when:
        TemperatureConverter temperatureConverter = temperatureConverterFactoryMethod.getConverter("K->C");

        //then:
        assertNotNull(temperatureConverter);
        assertTrue(temperatureConverter instanceof UnknownConverter);

    }
}
