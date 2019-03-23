package sda.Builder;

import org.junit.Test;
import sda.Builder.Room;

import static org.assertj.core.api.Assertions.assertThat;


public class RoomTest {

//Zaimplementuj testy weryﬁkujące czy budowniczy poprawnie tworzy instancję klasy.

    Room room;

    @Test
    public void test() throws Exception {
        room = new Room.Builder(2, 25.0f).setRoomNumber(2).setSize(25.0f).build();
        assertThat(room.getRoomNumber()).isEqualTo(2);
        assertThat(room.getSize()).isEqualTo(25.0f);
    }
}
