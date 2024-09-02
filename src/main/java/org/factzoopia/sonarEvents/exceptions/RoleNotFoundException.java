package org.factzoopia.sonarEvents.exceptions;


public class RoleNotFoundException extends RoleException {

    public RoleNotFoundException(String message) {
        super(message);
    }
    
    public RoleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}