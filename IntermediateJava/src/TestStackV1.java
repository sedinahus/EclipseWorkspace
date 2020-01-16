
public class TestStackV1 {

	public static void main(String[] args) throws Exception{
		StackV1 obj1 = new StackV1();
		for(int i = 0; i < 10; i++) {
			obj1.push(i);
			
		}
		while(!obj1.empty()) {
			System.out.print(obj1.pop() + " ");
		}
		
		StackV2 obj2 = new StackV2(16);
			for(int i = 0; i < 16; i++) {
				obj2.push(i);
			}
			while(!obj2.isEmpty()) {
				System.out.print(obj2.pop() + " ");
			
		}
	}

}
