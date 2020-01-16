
public class StackV2 {
	//protected is accessible within the same class or same package
	//if it is subclass of same package or subclass of different package
	
	protected int capacity;
	
	//default array capacity
	public static final int CAPACITY = 10;
	
	protected int[] stackList; //array
	
	//index of the top element of the stack in the array
	protected int top = -1; //you cant assign 0,1,2,3...
	
	//constructor
	public StackV2() {
		this(CAPACITY);
	}
	public StackV2(int cap) {
		capacity = cap;
		stackList = new int[capacity];
	}
	
	//method
	public int size() { //return num of elements in the stack
		return top + 1; 
	}
	public boolean isEmpty() { 
		return top < 0;
	}
	public void push(int number) throws Exception{ //throw exception right after method
		if(size() == capacity) {
			throw new Exception("Stack is full");
			
		}
		stackList[++top] = number; //pre-increment(++top) because the top is -1
	}
	public int top() throws Exception{ //identifytop 
		if(isEmpty()) {
			throw new Exception("The stack is empty");
		}
		return stackList[top];
	}
	//remove top element from stack
	public int pop() throws Exception {
		int nextData;
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		
		nextData = stackList[top];
		stackList[top--] = Integer.MIN_VALUE;
		return nextData;
	}
	
	public String toString() {
		String s;
		s = "[";
		if(size() > 0) {
			s += stackList[0];
		}
		if(size() > 1) {
			for(int i = 0; i <= size() - 1; i++) {
				s += "," + stackList[i];
			}
		}
		return s + "]";
	}
}
