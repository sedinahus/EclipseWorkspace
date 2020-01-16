
public class StackV1 {
	private int[] list;
	private int size;
	public static final int DEFAULT_CAPACITY = 16; 
	
	//constructors
	public StackV1() {
		this(DEFAULT_CAPACITY);
	}
	
	public StackV1(int capacity) {
		list = new int[capacity];
	}
	
	//methods
	public void push(int value) {
		if(size >= list.length) {
			int[] newList = new int[list.length * 2]; //make  a new list if the size is greater than the capacity
			System.arraycopy(list, 0, newList, list.length, 0);
			list = newList; 
		}
		list[size++]= value; //it adds 
	}
	public int pop() {
		int topElement = list[--size]; //this method removes, shows the top
		return topElement;
		
	}
	public int peek() { //returns the top element
		return list[size - 1];
		
	}
	public boolean empty() { //as long as the stack is not empty it will be able to take out the num you push
		return (size == 0);
	}
	public int getSize() {
		return size; 
	}

}
