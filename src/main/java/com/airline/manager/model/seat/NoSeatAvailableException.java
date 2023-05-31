package com.airline.manager.model.seat;

public class NoSeatAvailableException extends Exception {


    public NoSeatAvailableException(){}
    
    public NoSeatAvailableException(String s){
        super(s);
    }
}
