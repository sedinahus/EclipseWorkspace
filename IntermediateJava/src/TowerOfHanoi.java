
public class TowerOfHanoi {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter number of disk: ");
		int n = input.nextInt();
		moveDisk(n, "From", "Dest", "Aux");
		
	}
	public static void moveDisk(int n, String from, String to, String aux) {
		if(n == 1) {
			System.out.println("Move disk " + n + " from " + from + " to " + to);
		}
			else {
				moveDisk(n - 1, from, aux, to);
				System.out.println("Move disk " + n + " from " + from + " to " + to);
				moveDisk(n - 1, aux, to, from);
				
			}
		}
	}

