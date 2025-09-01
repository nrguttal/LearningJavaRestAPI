package Services;

public class WeatherLogic {
	
	public boolean IsWeatherModerate(float temperature) 
	{
		
		if( temperature >= 15.0 &  temperature <= 30)
			return true;
		
		return false;
		
	}

}
