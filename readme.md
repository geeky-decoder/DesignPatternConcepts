## Classification of Design Pattterns
-------------------------------------
Total number of design patterns is 24 which are divided into 3 categories as below:
- `Creational`: Creational patterns have a lot to do with creation of objects. These patterns are designed for the instantiation of classes. Some of the creational design patterns are - Abstract Factory, Builder, Factory Method, Object Pool, Prototype, and Singleton.
- `Behavioural`: Behavioral patterns are those design patterns that describe and identify the interactions between different objects. Making use of behavioral design patterns can reduce complicated flowcharts of the software design into simpler interconnections between various objects of classes.
- `Structural`: Structural patterns are useful in creating larger structures from smaller, individual parts that are in general, of different classes. These patterns can also be used to ease the design by recognizing a basic method for recognizing relationships among entities.

### Singleton Design Pattern
----------------------------
- There must be exactly one instance of a class and it must be accessible to clients from a well-known access point.
- When the sole instance should be extensible by subclassing and clients should be able to use an extended instance without modifying
- Singleton classes are used for logging, driver objects, caching, and thread pool, database connections.

- To implement a singleton pattern, we have different approaches, but all of them have the following common concepts.
  - Private constructor to restrict instantiation of the class from other classes.
  - Private static variable of the same class that is the only instance of the class.
  - Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance      of the singleton class.

### Strategy Design Pattern
---------------------------
- It is used when multiple child classes that are overriding the method of Parent and giving same code defintion in their respective classes, than there comes the problem of `CODE DUPLICACY`. Hence this will not allow us to scale our system when application grows.

- So to avoid this strategy patten is used where we create a interface and maintains the HAS-A relationship with the main Parent class and that interface could have all the common methods needed and individually child classes can implement from the interface and provide their own functionality.
- When the main class will pass the interface refernece than other classes as per their need can call particular implmented class and can leverage the special functionality.
- Using the pattern will remove the problem of code duplicacy which was existing earlier in normal Parent-Child concept.


