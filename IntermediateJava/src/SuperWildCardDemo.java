
public class SuperWildCardDemo {
	public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("C#");
        stack2.push(5);
        stack2.push("Ruby");
        stack2.push("Python");
        stack2.push(67);
        stack2.push("Java");

        stack1.push("Moon");
        stack1.push("Sun");
        stack1.push("62");

        AnyWildCardDemo.print(stack2);
        System.out.println();
         add(stack1, stack2);
         AnyWildCardDemo.print(stack2);

    }

    public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
}