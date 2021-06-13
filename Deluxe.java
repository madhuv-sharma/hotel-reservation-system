package com.Hotel.Reservation;

public class Deluxe extends Room {


	public void set(int r,boolean w,boolean s)
	{
		rate=r;
		wifi=w;
		status=s;
	}
	
	public int getRate()
	{
		return rate;
	}

	public boolean getStatus()
	{
		return status;
	}
	
	public boolean getWifi()
	{
		return wifi;
	}
	
	
	public void statuschange() {
		// TODO Auto-generated method stub
		if(status==true)
			status= false;
		else
			status=true;
		
	}
}
