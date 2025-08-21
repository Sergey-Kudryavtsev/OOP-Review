package org.serega.ExceptionJava.Lesson4;

public class InvalidRoomNumberException extends RuntimeException {

    public InvalidRoomNumberException(String message) {
        super(message);
    }
}
