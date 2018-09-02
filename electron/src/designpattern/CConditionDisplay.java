package designpattern;

import java.util.Observable;
import java.util.Observer;

public class  CConditionDisplay implements Observer,DisplayElements
{
	Observable observeble;
	float temparature;
	float humidity;
	float pressure;
	
	public CConditionDisplay(Observable observable)
	{
		this.observeble=observable;
		observeble.addObserver(this);
	}
	
	public void update(Observable obs,Object arg)
	{
		if(obs instanceof WeatherData)
		{
			WeatherData weatherData= (WeatherData) obs;
			this.temparature=weatherData.getTemparature();
			this.humidity=weatherData.getHumidity();
			this.pressure=weatherData.getPressure();
			display();
		}
	}
	
	public void display()
	{
	System.out.println("Current conditions:\n"+temparature+"F degrees and\n"+humidity+"humidity\n"+pressure+"pressure");
	}
	
}




