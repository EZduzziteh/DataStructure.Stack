package myStack;

public interface StackI<E> {
	/*
    push: Equivalent to an insert
    pop: Deletes the most recently inserted element
    empty: Determine whether the stack is empty or not
    top or peek: Examines the most recently inserted element
    display: 

	 */
	void push(E val);
	E pop();
	boolean empty();
	E peek();
	void display();

}
