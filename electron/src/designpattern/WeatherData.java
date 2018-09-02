package designpattern;

import java.util.Observable;

/* observable class */
public class WeatherData extends Observable
{
	float temparature;
	float humidity;
	float pressure;
	

	public void WeatherData()
	{
		
	}
	/* control comes from the setMeasurementChanged() this method notifies the observer using Builtin functions */
	public void measurmentChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurments(float temparature,float humidity,float pressure)
	{
		this.temparature=temparature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurmentChanged();/*after setting the values this method will be called */
	}
	/*
	 * important methods for declaring the  object class data to access the Observer when they required 
	 */
	public float  getTemparature()
	{
		return (float)temparature;
	}
	
	public float getHumidity()
	{
		return (float)humidity;
	}
	public float getPressure()
	{
		return (float)pressure;
	}
}
