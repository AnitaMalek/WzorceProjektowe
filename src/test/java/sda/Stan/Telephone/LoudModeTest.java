package sda.Stan.Telephone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoudModeTest {

    @Test
    public void loudMode() {
        //given
        Phone phone = new Phone();
        phone.setStatus(new LoudMode());

        //when
        phone.louderState();

        //then
        Assert.assertTrue(phone.getStatus()instanceof LoudMode);
    }
}
