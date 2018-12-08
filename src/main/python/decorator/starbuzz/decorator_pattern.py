import abc


class Beverage(metaclass=abc.ABCMeta):
    """
    'Component' Object
    Define the interface for objects that can have responsibilities
    added to them dynamically
    """

    def __init__(self):
        self.description = "Unknown Beverage";

    def get_description(self):
        return self.description

    @abc.abstractmethod
    def cost(self):
        pass


class CondimentDecorator(Beverage, metaclass=abc.ABCMeta):
    """
    'Decorator' Object
    Maintain a reference to a Beverage (Component) object and
    define an interface that conforms to Component's interface
    """

    def __init__(self, beverage):
        self._beverage = beverage

    @abc.abstractmethod
    def get_description(self):
        pass

class HouseBlend(Beverage):
    """
    Concrete Beverage (Component)
    """

    def __init__(self):
        self.description = "House Blend"

    def cost(self):
        return 1.00

class Espresso(Beverage):
    """
    Concrete Beverage (Component)
    """

    def __init__(self):
        self.description = "Espresso"

    def cost(self):
        return 1.99


class Mocha(CondimentDecorator):
    """
    Concrete CondimentDecorator
    """

    def get_description(self):
        return self._beverage.get_description() + ', Mocha'

    def cost(self):
        return self._beverage.cost() + 0.20

class Whip(CondimentDecorator):
    """
    Concreate CondimentDecorator
    """

    def get_description(self):
        return self._beverage.get_description() + ', Whip'

    def cost(self):
        return self._beverage.cost() + 0.15


