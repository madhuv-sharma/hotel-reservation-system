package com.Hotel.Reservation;

abstract class Room {

	int rate;
	boolean wifi;
	boolean status;
    
    abstract public void statuschange();
}
