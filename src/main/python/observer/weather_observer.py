from observer.observer_pattern import *


class WeatherData(Subject):

    def __init__(self):
        self._observers = set()
        self.temperature = None
        self.humidity = None
        self.pressure = None

    def register_observer(self, observer):
        self._observers.add(observer)

    def remove_observer(self, observer):
        self._observers.discard(observer)

    def notify_observers(self):
        for observer in self._observers:
            observer.update(self.temperature, self.humidity, self.pressure)

    def measurements_changed(self):
        self.notify_observers()

    def set_measurement(self, temperature, humidity, pressure):
        self.temperature = temperature
        self.humidity = humidity
        self.pressure = pressure
        self.measurements_changed()


class CurrentCondition(Observer, DisplayElement):

    def __init__(self, weather_data):
        self.weather_data = weather_data
        self.weather_data.register_observer(observer=self)
        self.temperature = None
        self.humidity = None
        self.pressure = None

    def update(self, temperature, humidity, pressure):
        self.temperature = temperature
        self.humidity = humidity
        self.pressure = pressure
        self.display()

    def display(self):
        print('Current conditions: ' + str(self.temperature) + ' degrees F and ' + str(self.humidity) + '% humidity')

