package designpatternRawPractice;
/*package designpattern;

import java.util.ArrayList;
import designpattern.Observer;

public class WeatherData implements Subject
{
	ArrayList observers ;
 	float temparature;
	float humidity;
	float pressure;
	
	public WeatherData() {
		super();
		observers= new ArrayList();
	}

	@Override
	public void registerObserver(designpattern.Observer o) {
		observers.add(o);
		
	}

	@Override
	public void removeObserver(designpattern.Observer o) {
		int index=observers.indexOf(o);	
		observers.remove(index);
		
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++)
		{
			Observer observer=(Observer)observers.get(i);
			observer.update(temparature,humidity,pressure);
		}
		
	}

	public void setMesurments(float temaparature,float humidity,float pressure)
	{
		notifyObservers();
	}



}
*/