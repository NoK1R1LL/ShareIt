package ru.practicum.shareit.exceptions;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(final String m) {
        super(m);
    }
}