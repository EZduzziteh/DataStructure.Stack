package myStack;

public class StackTest {

	public static void main(String[] args) {
		StackI<Integer> stk=new StackArray<Integer>();
		stk.push(2);
		stk.push(3);
		stk.push(5);
		stk.push(7);
		stk.push(11);
		stk.display();
		
		System.out.println(stk.peek());
		stk.display();
		
		
		
		StackI<String> stks=new StackArray<String>();
		stks.push("Two");
		stks.push("Three");
		stks.push("Five");
		stks.push("Seven");
		stks.push("Eleven");
		stks.display();
		
		System.out.println(stks.pop());
		stks.display();
		

	}

}
