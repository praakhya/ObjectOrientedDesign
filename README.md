# Adapter
- Allows objects with incompatible interfaces to collaborate with each other.
- An adapter class that instantiates the class to be adapted.

```java
public class AdapterOfMyClass implements ParentOfMyClass {
	private final MyClass myClass;
	public AdapterOfMyClass() {
		myClass = new MyClass();
	}
	@Override
	public void methodOfMyClass(OldDataType oldDT) {
		NewDataType newDT = convertToOldToNew(oldDT);
		myClass.methodOfMyClass(newDT);
	}
}
//Now use AdapterOfMyClass instead of MyClass
```

- Uses inheritance and composition to allow collaboration between objects of incompatible interfaces.
- Can introduce new adapters without breaking existing code
- A middle layer that serves as translator
- Applies single responsibility and open-closed principles
# Facade
- Provides a interface that hides all complex classes in the background
- Subsystems need not be aware of the facade and can work with each other directly whereas, the client uses the facade instead of the subsystems.
# Proxy
- provides a substitute or placeholder to the original object that controls access to the original object.
- applies open-closed principle
# Flyweight
- Fit more objects in same RAM by sharing common parts of state.
- Don’t store state that rarely changes but move it to separate class called the flyweight class.
- Flyweight is immutable, never altered at run time. So it should only be set once using constructor and then only accessed using get methods. Use `@Getter` and `@AllArgsConstructor` for this.
## Flyweight Factory
- Consists of relevant flyweight mappings that can be called when a flyweight has to be selected for use. This way all classes needing a particular state utilise the same flyweight object thus saving space.
- **Context** **class**: Contains state that is unique among all objects, extrinsic mutable state.
- **Flyweight** **class**: Contains state that is common across all objects, intrinsic immutable state.
- **Flyweight factory**: Contains mappings of flyweights.