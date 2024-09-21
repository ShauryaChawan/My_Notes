class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    # Traverse the list from front to back
    def traverse_front(self):
        current = self.head
        while current:
            print(current.data, end="->")
            current = current.next
        print("null")

    # Traverse the list from back to front
    def traverse_back(self):
        # First, move to the last node
        current = self.head
        if not current:
            return  # Empty list

        # Move to the last node
        while current.next:
            current = current.next

        # Now traverse backward using the prev reference
        while current:
            print(current.data, end="->")
            current = current.prev
        print("null")

    # Utility function to add a node to the end of the list
    def add_node(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            return

        current = self.head
        # Traverse to the last node
        while current.next:
            current = current.next

        # Add new node at the end
        current.next = new_node
        new_node.prev = current  # Set the previous pointer of the new node

# Main logic to test the doubly linked list
if __name__ == "__main__":
    dll = DoublyLinkedList()
    dll.add_node(1)
    dll.add_node(2)
    dll.add_node(3)
    dll.add_node(4)
    dll.add_node(5)

    print("Traversal from front to back:")
    dll.traverse_front()

    print("Traversal from back to front:")
    dll.traverse_back()
