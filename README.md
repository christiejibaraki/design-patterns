# design-patterns & principles
demos common oop design patterns and principles in java and python.

## Design Patterns
#### Observer pattern (behavioral)
Defines a one (Subect) to many (Observers) relationship between objects, such that when Subject changes state, all dependent Observers are notified and updated automatically.

Subject and Observer use interfaces. 
Subject keeps track of objects implementing Observer, while observers register with and are notified by the Subject Interface (loose coupling). 
Relationships are determined at runtime by composition (instead of inheritance).

#### Decorator pattern (structural)
Extends functionality by attaching additional responsibilities to an object dynamically.  
Provides a flexible alternative to subclassing.

Decorators have the same supertype as the objects they decorate.  
One or more decorators can wrap an object.
If the decorator has the same supertype as the object it decorates, can pass around decorated object instead of original (wrapped) object.  
Decorator adds its own behavior before and/or after delegating to the object it decorates.  
Objects can be decorated at any time, including dynamically at runtime, with multiple decorators

#### Factory Pattern (creational)
Factory patterns encapsulate object creation
- Simple Factory
Simple Factory is more of a programming idiom rather than an actual design pattern.

- Factory Method Pattern - object creation through inheritance  
Factory method handles object creation and encapsulates it in a subclass.  
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Lets a class defer instantiation to subclasses (i.e. subclasses decide what objects to create).  
This decouples client code in the superclass from the object creation code in the subclass.  

- Abstract Factory - object creation through object composition  
An abstract factory provides an interface for a family of products.  
From abstract factory, derive one or more concrete factories that produce the same products but with different implementations.  
Methods in abstract factory are often implemented as factory methods.

## Types of Design Patterns
Creational patterns deal with object creation mechanisms.  
Structural patterns ease design by capturing relationships b/t entitites.  
Behavioral patterns id/realize communication patterns between objects


## Design Principles
- Encapsulate what varies
- Program to an interface, not an implementation
- Favor composition over inheritance
- Classes should be open for extension, but closed for modification
- Strive for loose coupling between objects that overlap
- Depend on abstractions. Do not depend upon concrete classes (Dependency inversion principle)
    - No variable should hold a reference to a concrete class
    - No class should derive from a concrete class
    - No method should override an implemented method of any of its base classes

