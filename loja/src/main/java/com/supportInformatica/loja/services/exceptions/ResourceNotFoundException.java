package com.supportInformatica.loja.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    // private static final long serialVersionUD = 1L;

    public ResourceNotFoundException (Object id){
        super("Resource not found. Id " + id);
    }
}
