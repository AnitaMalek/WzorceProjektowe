package sda.Builder;

public class Room {

    //1. Utwórz klasę Room w której znajdzie się kilka pól: nr pokoju,
    //   liczba łóżek, czy pokój jest dostępny, czy pokój jest czysty,
    //   czy znajduje się łazienka, powierzchnia pokoju.
    //2. Utwórz klasę RoomBuilder i zaimplementuj ją.
    //3. Rozbuduj klasę budowniczego w taki sposób aby pola nr pokoju oraz powierzchnia
    //   były polami wymaganymi podczas tworzenia obiektu (parametry powinny być przyjęte
    //   w konstruktorze budowniczego).

    private int roomNumber;
    private int beds;
    private boolean available;
    private boolean clean;
    private boolean withBathroom;
    private float size;

    public static class Builder {
        private int roomNumber;
        private int beds;
        private boolean available;
        private boolean clean;
        private boolean withBathroom;
        private float size;

       public Builder (int roomNumber, float size) {
            this.roomNumber = roomNumber;
            this.size = size;
        }



        public Builder setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public Builder setSize(float size) {
            this.size = size;
            return this;
        }

        public Builder beds(int beds) {
            this.beds = beds;
            return this;
        }

        public Builder available(boolean available) {
            this.available = available;
            return this;
        }

        public Builder clean(boolean clean) {
            this.clean = clean;
            return this;
        }

        public Builder withBathroom(boolean withBathroom) {
            this.withBathroom = withBathroom;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public float getSize() {
        return size;
    }



    private Room (Builder builder) {
            roomNumber = builder.roomNumber;
            beds = builder.beds;
            available = builder.available;
            clean = builder.clean;
            withBathroom = builder.withBathroom;
            size = builder.size;
        }
}
