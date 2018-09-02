package designpattern;

public class WeatherOperate 
{

	public static void main(String[] args)
	{
		WeatherData data = new WeatherData();
		CConditionDisplay obsr= new CConditionDisplay(data);
		data.setMeasurments(123.4f, 54.5f, 56.7f);

	}

}
