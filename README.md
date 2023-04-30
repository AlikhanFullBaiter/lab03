# MyLinkedListQueue🧩
This is a Java implementation of a queue data structure using a ***LinkedList***.

# Overview 👨‍💻
A queue is a data structure that follows the First In First Out (FIFO) principle, meaning that the first element added to the queue is the first one to be removed.

This implementation uses a ***LinkedList*** to store the elements of the queue. Elements are added to the back of the queue using the ***enqueue*** method, and removed from the front using the ***dequeue*** method. The ***peek*** method returns the front element of the queue without removing it.

# Functionality 🦾
The public methods available in this implementation are:

***enqueue(E element)***: adds the specified 
element to the back of the queue.

***dequeue()***: removes and returns the front element of the queue.

***peek()***: returns the front element of the queue without removing it.

***checkList()***: returns true if the queue is empty, false otherwise.

***size()***: returns the number of elements in the queue.

# Usage 🚀
To use this implementation, create an instance of MyLinkedListQueue and start adding elements:
```bash
MyLinkedListQueue<String> list = new MyLinkedListQueue<>();
list.enqueue("element 1");
list.enqueue("element 2");
list.enqueue("element 3");
```
You can then remove elements from the queue using the dequeue method:
```bash
String element = list.dequeue(); // returns "element 1"
```

You can also use the peek method to get the front element of the queue without removing it:
```bash
String front = queue.peek(); // returns "element 2"
```
To check if the queue is empty, use the checkList method:
```bash
boolean empty = queue.checkList(); // returns false
```
And to get the number of elements in the queue, use the size method:
```bash
int size = queue.size(); // returns 2
```

# MyLinkedListStack  🧩
This is a simple implementation of a stack using a linked list in Java. The stack is a data structure that follows the Last In, First Out (LIFO) principle, meaning that the last element added to the stack will be the first one removed.

# Overview 👨‍💻
This implementation uses the built-in LinkedList class provided by Java. The class is parameterized with the type of elements in the stack, represented by the generic type <E>. The MyLinkedListStack class provides three main methods: ***push(), pop(), and peek()***.

***push(E element)***: Adds an element to the top of the stack. 

***pop()***: Removes and returns the element at the top of the stack. Throws an EmptyStackException if the stack is empty.

***peek()***: Returns the element at the top of the stack without removing it. Throws an EmptyStackException if the stack is empty.

In addition to these methods, the MyLinkedListStack class also provides two utility methods:

***checkList()***: Returns true if the stack is empty, false otherwise.

***size()***: Returns the number of elements in the stack.

# Usage 🚀
To use this implementation, create an instance of MyLinkedListQueue and start adding elements:
```bash
MyLinkedListStack<String> list = new MyLinkedListStack<>();
list.push("Hello");
list.push("world");
System.out.println(stack.peek()); // Output: "world"
list.pop();
System.out.println(stack.peek()); // Output: "Hello"
```
  
