package myStack;

import java.util.Arrays;

public class StackArray<E> implements StackI<E> {
	
	
	

	private E[] data;
	int topOfStack=-1;
	private static final int INITIAL_CAPACITY = 10;
	
	public StackArray() {
		super();
		data=(E[]) new Object[INITIAL_CAPACITY];
	}
	public StackArray(int sz) {
		super();
		data=(E[]) new Object[sz];
	}
	
	private void reallocate() {
		int newSize=data.length*2;
		data=Arrays.copyOf(data, newSize);
		
	}

	@Override
	public void push(E val) {
		// TODO Auto-generated method stub
		if(topOfStack==data.length-1) {
			reallocate();
		}
		
		topOfStack++;
		data[topOfStack]=val;
		
	}
	


	@Override
	public E pop() {
		// TODO Auto-generated method stub
		
		if(empty())
		{
			return null;
		}
		
		E val=data[topOfStack];
		topOfStack--;
		return val;
	}

	@Override
	public boolean empty() {
		return topOfStack==-1;
	}

	@Override
	public E peek() {

		if(empty())
		{
			return null;
		}
		
		E val=data[topOfStack];
		return val;
	}

	@Override
	public void display() {
		System.out.println("Contents of the Stack: ");
		System.out.print("Top -->");
		for(int i=topOfStack; i>=0; i--)
		{
			System.out.println("\t|\t"+data[i]+"\t|");
		}
		System.out.println("\t|--------------\t|");
	}
}
