
class Node {

	public int value;
	public Node next;
	public Node (int value, Node next) {
		this.value=value;
		this.next=next;
	}

}

public class LinkedLists {

	public static void main(String[] args) {
		Node nodeBig = new Node(2, null);
		for (int i = 0; i < 100; i++) {
			Node node = new Node(i, nodeBig);
			nodeBig = node;
		}
		for (int i = 0; i< 100; i++) {
			System.out.println(" " + nodeBig.value);
			nodeBig = nodeBig.next;
		}
	}


}
