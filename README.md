# Chain of Responsibilities
- Each handler responsible for a single task
- Each handler controls whether it should transfer to the next handler after processing its request.
- A base handler class can be created that has to be implemented by all handlers in the chain.
# Command
- Turns a request or behaviour into a stand-alone object containing everything about the request.
- Encapsulates all relevant information needed to perform an action or trigger an event.
# Interpreter
- Each class represents a role or production of the language to be interpreted.
- **Abstract Expression**: Defines a method that is used by subclasses to interpret
- **Terminal Expression**: Sub-class of Abstract Expression. Implements interpret to return value.
- **Non-Terminal Expression**: Implements interpet method. The value returned from the interpret method is a combination of results from the sub-expression’s interpret methods.
- This design pattern is more suitable for grammar and language creation and hard to use in other scenarios.
# Iterator
Extracts traversal behaviour of a collection into a separate class called Iterator which iterates without exposing underlying representation of elements.