class Node {
	int data;
	Node prev, next;

	Node(int data) {
		this.data = data;
		this.prev = this.next = null;
	}
}

class CircularDoublyLinkedList {
	private Node head;

	// Insert a new node at the end of the list
	public void insertNode(int data) {
		insertLast(data);
	}

	// Overloaded insertNode to insert at a specified index
	public void insertNode(int data, int index) {
		Node newNode = new Node(data);

		if (index == 0) {
			insertFirst(data);
			return;
		}

		Node current = head;
		int count = 0;

		// Traverse to the node just before the insertion point
		while (count < index - 1 && current.next != head) {
			current = current.next;
			count++;
		}

		if (current == head && count != index - 1) {
			System.out.println("Index out of bounds");
			return;
		}

		newNode.next = current.next;
		newNode.prev = current;
		current.next.prev = newNode;
		current.next = newNode;
	}

	// Insert a new node at the beginning of the list
	public void insertFirst(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			// For an empty list, point next and prev to itself (circular nature)
			newNode.next = newNode.prev = newNode;
			head = newNode;
		} else {
			Node last = head.prev; // Get the last node

			// Insert the new node at the beginning
			newNode.next = head;
			newNode.prev = last;
			last.next = newNode;
			head.prev = newNode;
			head = newNode; // Move head to the new node
		}
	}

	// Insert a new node at the end of the list
	public void insertLast(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			// For an empty list, point next and prev to itself (circular nature)
			newNode.next = newNode.prev = newNode;
			head = newNode;
		} else {
			Node last = head.prev; // Get the last node

			// Insert the new node at the end
			last.next = newNode;
			newNode.prev = last;
			newNode.next = head;
			head.prev = newNode;
		}
	}

	// Helper function to print the list
	public void printList() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		do {
			System.out.print(temp.data + " <-> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(head)");
	}
}

class Main {
	public static void main(String[] args) {
		CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

		// Inserting nodes at the end
		cdll.insertNode(10);
		cdll.insertNode(20);
		cdll.insertNode(30);
		cdll.insertNode(40);

		System.out.println("List after inserting nodes at the end:");
		cdll.printList();

		// Inserting a node at the beginning
		cdll.insertFirst(5);
		System.out.println("List after inserting 5 at the beginning:");
		cdll.printList();

		// Inserting a node at index 2
		cdll.insertNode(15, 2);
		System.out.println("List after inserting 15 at index 2:");
		cdll.printList();

		// Inserting a node at the end (equivalent to insertNode)
		cdll.insertLast(50);
		System.out.println("List after inserting 50 at the end:");
		cdll.printList();
	}
}
