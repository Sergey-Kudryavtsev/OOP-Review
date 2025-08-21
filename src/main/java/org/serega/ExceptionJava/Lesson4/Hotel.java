package org.serega.ExceptionJava.Lesson4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
//    boolean [] roomNumbers = new boolean[1000];
    private List<Integer> bookRooms = new ArrayList<>();
    public void bookRoom(int roomNumber) throws RoomNotAvailableException {

        if (bookRooms.contains(roomNumber)) {
            throw new RoomNotAvailableException("Номер " + roomNumber + " уже забронирован");
        }

        if (roomNumber < 1 || roomNumber > 1000) {
            throw new InvalidRoomNumberException("Некорректный номер комнаты - " + roomNumber);
        }

        bookRooms.add(roomNumber);
        System.out.println("Номер " + roomNumber + " успешно забронирован");

    }
}
