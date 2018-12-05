from observer.weather_observer import *

weatherData = WeatherData()
display = CurrentCondition(weather_data=weatherData)
weatherData.set_measurement(90, 70, 30)
weatherData.set_measurement(100, 80, 40)
weatherData.remove_observer(observer=display)
weatherData.set_measurement(110, 80, 40)
weatherData.register_observer(observer=display)
weatherData.set_measurement(108, 80, 40)
