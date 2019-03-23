package sda.Singleton;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SessionTest {

    //@Test public void testSingleton() {
    // Config config = Config.getInstance();
    // assertEquals("PL", config.getLanguage());
    // config.setLanguage("DE");
    // Config newConfig = Config.getInstance();
    // assertEquals("DE", newConfig.getLanguage()); }


    @Test
    public void testSingleton() {
        Session session = Session.getInstance();
        assertEquals("", session.getLoggedUser());
        session.setLoggedUser("Mietek");
        Session newSession = Session.getInstance();
        assertEquals("Mietek", newSession.getLoggedUser() );
    }
}
