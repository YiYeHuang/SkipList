package example;

public class SLNode {

	public SLNode[] next;

	private int value;
	private int level;

	public SLNode(int value, int level)
	{
		this.value = value;
		this.level = level;
		// 0 is the base level
		this.next = new SLNode[level+1];
	}

	public int getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "[ level " + level + " | value "+value + " ]";
	}
}
