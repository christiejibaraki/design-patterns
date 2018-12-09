# design-patterns & principles
demos common oop design patterns and principles in java and python.

## Patterns
#### Observer pattern
Defines a one (Subect) to many (Observers) relationship between objects, such that when Subject changes state, all dependent Observers are notified and updated automatically.

Subject and Observer use interfaces. 
Subject keeps track of objects implementing Observer, while observers register with and are notified by the Subject Interface (loose coupling). 
Relationships are determined at runtime by composition (instead of inheritance).

#### Decorator pattern
Extends functionality by attaching additional responsibilities to an object dynamically. Provides a flexible alternative to subclassing.

Decorators have the same supertype as the objects they decorate.
One or more decorators can wrap an object.
If the decorator has the same supertype as the object it decorates, can pass around decorated object instead of original (wrapped) object.
Decorator adds its own behavior before and/or after delegating to the object it decorates.
Objects can be decorated at any time, including dynamically at runtime, with multiple decorators

#### Factory Pattern
Factory patterns encapsulate object creation
- Simple Factory
Simple Factory is more of a programming idiom rather than an actual design pattern.

- Factory Method Pattern
Encapsulates object creation by letting subclasses decide what objects to create.
Factory method handles object creation and encapsulates it in a subclass.
This decouples client code in the superclass from the object creation code in the subclass.

## Principles
- Encapsulate what varies
- Program to an interface, not an implementation
- Favor composition over inheritance
- Classes should be open for extension, but closed for modification
- Strive for loose coupling between objects that overlap