#include <iostream>
using namespace std;

// Definition for a node in the doubly linked list
class Node {
public:
    int data;
    Node* next;
    Node* prev;

    Node(int data) {
        this->data = data;
        this->next = nullptr;
        this->prev = nullptr;
    }
};

// Doubly Linked List class
class Main {
private:
    Node* head;

public:
    DoublyLinkedList() {
        head = nullptr;
    }

    // Traverse the list from front to back
    void traverseFront() {
        Node* current = head;
        while (current != nullptr) {
            cout << current->data << " ";
            current = current->next;  // Move to the next node
        }
        cout << endl;
    }

    // Traverse the list from back to front
    void traverseBack() {
        // First, move to the last node
        Node* current = head;
        if (current == nullptr) {
            return; // Empty list
        }

        // Move to the last node
        while (current->next != nullptr) {
            current = current->next;
        }

        // Now traverse backward using the prev reference
        while (current != nullptr) {
            cout << current->data << " ";
            current = current->prev;  // Move to the previous node
        }
        cout << endl;
    }

    // Utility function to add a node to the end of the list
    void addNode(int data) {
        Node* newNode = new Node(data);
        if (head == nullptr) {
            head = newNode;
            return;
        }

        Node* current = head;
        // Traverse to the last node
        while (current->next != nullptr) {
            current = current->next;
        }

        // Add new node at the end
        current->next = newNode;
        newNode->prev = current;  // Set the previous pointer of the new node
    }
};

int main() {
    DoublyLinkedList dll;
    dll.addNode(1);
    dll.addNode(2);
    dll.addNode(3);
    dll.addNode(4);
    dll.addNode(5);

    cout << "Traversal from front to back:" << endl;
    dll.traverseFront();

    cout << "Traversal from back to front:" << endl;
    dll.traverseBack();

    return 0;
}
