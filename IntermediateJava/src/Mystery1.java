
public class Mystery1 {
	
	public static void main(String[] args) {
	
	java.util.Stack<Integer> s = new java.util.Stack<Integer>();
	s.push(2);
	s.push(6);
	s.push(1);
	mystery1(s);
	}

	public static void mystery1(java.util.Stack<Integer> s) {
		java.util.Queue<Integer> q = new java.util.LinkedList<Integer>();
		while(!s.isEmpty()) {
			int n = s.pop();
			q.add(n);
			q.add(n);
		}
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		System.out.println(s);
		
	}
	
}