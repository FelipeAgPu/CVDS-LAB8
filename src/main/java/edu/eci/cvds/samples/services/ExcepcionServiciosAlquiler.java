package edu.eci.cvds.samples.services;

import org.apache.ibatis.exceptions.PersistenceException;

public class ExcepcionServiciosAlquiler extends Exception{

    public ExcepcionServiciosAlquiler() {
        super();
    }

    public ExcepcionServiciosAlquiler(String message) {
        super(message);
    }

    public ExcepcionServiciosAlquiler(String s, PersistenceException exception) {
        super(s, exception);
    }
}
