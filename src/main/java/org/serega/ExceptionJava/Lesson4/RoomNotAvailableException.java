package org.serega.ExceptionJava.Lesson4;

public class RoomNotAvailableException extends RuntimeException {

    public RoomNotAvailableException(String message) {
        super(message);
    }

}
