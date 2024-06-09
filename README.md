# DecoratorPattern

Used when we need a wrapper for a given object, which allows us to "extend" the capabilities of the base object with the capabilities of the decorators superimposed on it.
It is done by tightly coupling the abstract decorator class, which is used so that specific decorators do not inherit directly from the base class, which prevents an unstable structure for maintaining the code, such as:
- Chaos in the structure and uniformity of decorators,
- Lack of good hierarchy of decorators,
- Difficulties in testing (imposed need to test each decorator separately against the class it extends)
- ...

When the decorator extends the base class, it gives him the opportunity to use the so-called "composition", i.e. it has access to the object it decorates because it is provided in its constructor, which allows it to extend the operation of the wrapped class.

It prevents situations of a multitude of model classes, because if you tried to model application classes without it in very large cases, you would have to create as many classes as possible, and this would not be very pleasant both in the creation, operation and further development and maintenance of the application code. .

### Code explanation:

##### Abstract base class `Sandwich`:
Model class template (sandwiches).

##### Specific base class `BigMac`:
A class that defines a specific type of sandwich.

##### `SandwichDecorator` abstraction:
A template of the decorator class, it has references to the wrapped object, and of course it extends the `Sandwich` class, i.e. it inherits its methods.

##### Specific `Tomato` / `TomatoDecorator` decorator:
A specific decorator of the `Sandwich` class, overwrites the cost of the base sandwich in the `cost()` method by adding its own cost, all this is done through an instance injected into its constructor, of course through the `super()` operation, to eliminate the need to rewrite the code of its parent class `SandwichDecorator`.
