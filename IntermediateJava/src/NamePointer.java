
public class NamePointer extends Point {
	private String pName;
	
	public NamePointer(int x, int y,String pName) {
		super(x, y);
		this.pName = pName;
	}
	public String getpName() {
		return pName;
	}
	
	@Override
	public String toString() {
		return pName + "(" + x + "," + y + ")";
	}
}
