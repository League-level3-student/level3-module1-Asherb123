package _07_California_Weather;

import java.lang.reflect.Array;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	// JButton
	void start() {
		HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
		String[] buttons = { "Search by city", "Search by weather", "Search by temperature" };
		int buttonss = JOptionPane.showOptionDialog(null, "Please select one", "Lobby", 0, -1, null, buttons, 0);
		if (buttonss == 0) {
			String s = JOptionPane.showInputDialog("Search a city");

			String cityName = Utilities.capitalizeWords(s);
			WeatherData datum = weatherData.get(cityName);

			if (datum == null) {
				System.out.println("Unable to find weather data for: " + cityName);
			} else {
				System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of "
						+ datum.temperatureF + " F");
			}
		}

		if (buttonss == 1) {
			String a = JOptionPane.showInputDialog("Search weather").trim();

			for (String city : weatherData.keySet()) {
				if (weatherData.get(city).weatherSummary.contains(a)) {
					System.out.println(city);
				}
			}
		}
	if (buttonss == 2) {
		String b = JOptionPane.showInputDialog("Input minumum temperture");
		String c = JOptionPane.showInputDialog("Input maximum temperture");
		int low = Integer.parseInt(b);
		int high = Integer.parseInt(c);
		for (String city : weatherData.keySet()) {
			
			if (weatherData.get(city).temperatureF >= low && weatherData.get(city).temperatureF <=high) {
				System.out.println(city);
			}
		}
	}
	
	
	}
}

// All city keys have the first letter capitalized of each word
