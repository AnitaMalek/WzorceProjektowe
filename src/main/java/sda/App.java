package sda;

import sda.Builder.Room;

public class App {
    public static void main( String[] args ) {

        Room apartament = new Room.Builder(1, 30)
                .withBathroom(true)
                .available(true)
                .clean(true)
                .build();
    }
}
