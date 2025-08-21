package org.serega.ExceptionJava.Lesson4;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        int roomToBook = 111;

        try {
            hotel.bookRoom(111);
            hotel.bookRoom(1001);
        }catch (RoomNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }catch (InvalidRoomNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            hotel.bookRoom(111);
        }catch (RoomNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }catch (InvalidRoomNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            hotel.bookRoom(100);
        }catch (RoomNotAvailableException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }catch (InvalidRoomNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
