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



can functional interface have default methods 
transient
volatile
sealed classes 
var keyword in java
cyclicbarrier and countdownlatch in java 
functional interfaces in java and what all interfaces are functional in java
@PropertySource annotation in spring boot
what all design patterns are used in current project
how to read the thread dumps in an application
resilence4j 
how to pass some default value while reading properties value using @Value annotation from application.properties
singelton vs prototype beans in spring boot
------(Interview Mania channel)----------------
genie ashwani spring boot
what will you do when your application/microservices which internally is connecting to some other application/microservies and one of them gets down than what will you do or how you will find out

mircoervices design pqtterns/ architecture patterns
how to protect from SQL injection

parallel streams
map vs flatmap
terminal/intermediate operations in streams
externalization
methods in externalization
lookup annotation in spring
how to connect multiple databases in spring boot
how to inject a prototype bean into a singleton bean in spring boot
how to geenrate  a WAR file in spring boot
transaction management in spring boot api

given 2 string arrays you need to find out whether those are equal or not )in terms of element they contains + size) using streams

## Approach for solving a LLD problem
--------------------------------------
LLD must be scalable first

- Clarify and analyze the requirement
- Find the flow
- Define the scope (methods/classes/functionalitites)
- Come up with the relationship (IS-A[Inheritance]/HAS-A)
- Solid principles + design patterns
- 



1. Diff in comparator & Comparable ?
2. How Can we create Immutable Class?
3. What is Serialization & Serial Version UID ?
4. How can we create a Custom Exception ?
5. What is SOLID Design Principles ?
6.  What is Builder Design Pattern ?
7. New features of Java 8 ?
8. What is the use of Consumer Interface ?
9. What is Predicates ?
10. Default & Static Methods what was the need for it ?
11. What are the Scope of Spring Bean ?
12. What is the use of @Qualifier ?
13. Diff between Constructor & Setter Injection
14. 400 ,200 Status Code ?
15. In SpringBoot how can we read Properties ?
16. In Spring Hibernate Diff between Get & Load ?
17. What are States of Hibernate Entity ?
18. What relationship between hibernate & JPA ?
19. Diff Between CrudRepository & JPA Repository?
20. What is Database Indexing ?In Database why do we do Indexing ?
21. What is the use of Views ?
22. What Do you mean by Transactions in Hibernate ?
