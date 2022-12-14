import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> myStack=new Stack<Integer>();
		myStack.push(101);
		myStack.push(99);
		myStack.push(10);
//		System.out.println(myStack.pop());
//		System.out.println(myStack.peek());
//		System.out.println(myStack.size());
//		System.out.println(myStack.isEmpty());	
		
		while(!myStack.isEmpty()) {
			
			System.out.println(myStack.pop());
		}
		

	}

}
