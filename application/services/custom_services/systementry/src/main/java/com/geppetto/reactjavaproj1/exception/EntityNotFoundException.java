package com.geppetto.reactjavaproj1.exception;

public class EntityNotFoundException extends RuntimeException {

public EntityNotFoundException(String message) {
super(message);
}

public EntityNotFoundException(String message, Throwable cause) {
super(message, cause);
}
}