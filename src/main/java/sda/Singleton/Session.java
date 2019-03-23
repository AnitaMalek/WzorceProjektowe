package sda.Singleton;

public class Session {

//1. Zaimplementuj klasę Session która będzie imitacją sesji,
// służącą do przechowywania zalogowanego użytkownika.
// 2. Dodaj 2 metody: loginUser(user) - zapisze zalogowanego użytkownika
// (np. w postaci jakiejś zmiennej loggedUser) logoutUser(user) - usunie zapisanego użytkownika.
// 3. Wykonaj test sprawdzający poprawność działania klasy i zaimplementowanych metod.

    private static Session session;
    private String loggedUser;

    private Session (){

    }

    public static Session getInstance() {
        if (session == null) {
            session = new Session();
        }
        return session;
    }

    public void setLoggedUser (String loggedUser) {
        this.loggedUser = loggedUser;
    }

    public String getLoggedUser() {
        return loggedUser;
    }

    public void logOutLoggedUser() {
        this.loggedUser = null;
    }

}
