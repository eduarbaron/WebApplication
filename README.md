# WebApplication

This is a basic CRUD on the Person entity stored in a mySQL database.

The important thing in this project is to learn the usability of utilities like Lombok in models and generic classes in the implementation of services with business logic.

In this case if it is required to add another entity, it will not be necessary to implement new classes with business logic to make essential methods of a CRUD. 
This is thanks to the fact that the new class ClsasNameServiceImpl only inherits from the GenericServiceImpl class and implements its own interface with its own methods.
finally the repository to use is injected and that would be it.


I hope this project will be very helpful for everyone.