class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class SinglyLinkedList {
	public static void traverseAndPrint(Node head) {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data + " -> ");
			currentNode = currentNode.next;
		}
		System.out.println("null");
	}

	public static Node insertNode(Node head, int value) {
		Node newNode = new Node(value);
		if (head == null) {
			return newNode; // Empty list
		}

		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode; // Insert at the end
		return head;
	}

	public static Node insertNodeAtIndex(Node head, int value, int index) {
		Node newNode = new Node(value);
		if (index == 0) {
			newNode.next = head;
			return newNode; // Insert at the beginning
		}

		Node currentNode = head;
		for (int i = 0; i < index - 1 && currentNode != null; i++) {
			currentNode = currentNode.next;
		}

		if (currentNode != null) {
			newNode.next = currentNode.next;
			currentNode.next = newNode; // Insert at specified index
		}
		return head;
	}

	public static Node insertFirst(Node head, int value) {
		Node newNode = new Node(value);
		newNode.next = head; // New node points to current head
		return newNode; // New node is the new head
	}

	public static Node insertLast(Node head, int value) {
		return insertNode(head, value); // Same as insertNode
	}
}

public class Main {

	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		Node node1 = new Node(7);
		Node node2 = new Node(3);
		Node node3 = new Node(2);
		Node node4 = new Node(9);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		System.out.println("Original list:");
		sll.traverseAndPrint(node1);

		// Insert a new node with value 97 at position 2
		node1 = sll.insertNodeAtIndex(node1, 97, 1);
		System.out.println("After inserting 97 at index 1:");
		sll.traverseAndPrint(node1);

		// Insert a new node with value 42 at the first position
		node1 = sll.insertFirst(node1, 42);
		System.out.println("After inserting 42 at the first position:");
		sll.traverseAndPrint(node1);

		// Insert a new node with value 100 at the last position
		node1 = sll.insertLast(node1, 100);
		System.out.println("After inserting 100 at the last position:");
		sll.traverseAndPrint(node1);
	}
}
