package restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import Services.WeatherLogic;

@RestController

public class WeatherController {
	
	@GetMapping("/weatherCondition/{temperature}")
	public boolean IsWeatherModerate(@PathVariable float temperature)
	{
				
		WeatherLogic weatherLogic = new WeatherLogic();
		
		return weatherLogic.IsWeatherModerate(temperature);
		
	}
	

}