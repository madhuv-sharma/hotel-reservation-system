package com.Hotel.Reservation;

public class SuperDeluxe extends Room{

	public void set(int r,boolean w,boolean s)
	{
		rate=r;
		wifi=w;
		status=s;
	}

	public boolean getStatus()
	{
		return status;
	}
	
	public boolean getWifi()
	{
		return wifi;
	}
	
	

	public int getRate()
	{
		return rate;
	}

	public void statuschange() {
		// TODO Auto-generated method stub
		if(status==true)
			status= false;
		else
			status=true;
		
	}
}
