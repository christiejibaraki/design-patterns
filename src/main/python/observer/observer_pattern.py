import abc


class Subject(metaclass=abc.ABCMeta):
    """
    Knows its observers. Any number of Observer objects may observe a subject.
    Send a notification to its observers when its state changes.
    """

    @abc.abstractmethod
    def register_observer(self, arg):
        pass

    @abc.abstractmethod
    def remove_observer(self, arg):
        pass

    @abc.abstractmethod
    def notify_observers(self):
        pass


class Observer(metaclass=abc.ABCMeta):
    """
    Define an upating interface for objects that should be notified of
    changes in a subject.
    """

    @abc.abstractmethod
    def update(self, arg):
        pass


class DisplayElement(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def display(self, arg):
        pass
