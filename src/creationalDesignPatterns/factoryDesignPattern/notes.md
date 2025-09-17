# Factory Design Pattern
Factory design pattern is a creational design pattern that separates the logic of creating objects from the client code. The factory class in the factory design pattern is responsible for creating objects based on the request from the client.

The structure of the factory design pattern include:
- Clients
- Product 
- Concrete Products
- Factory

Product:-> product is an interface which defines a common layout that all the products that the factory will produce has to follow.

Concrete Product:-> concrete product is an implementation of the product interface, factory produces the instances of these concrete products.

Factory:-> a factory class is responsible for creating the product instances as outputs to the clients requests.

Client:-> a client is responsible for instantiating the factory class and creating product objects using its factory method

there is a cons to this design pattern that we should keep in mind and it is the fact that factory design pattern is open to modification, if needed to add new concrete products.
