/*
 * This is the class that implements the queue data structure.
 * You may decide what data structure to use to implement it.
 */
public class Queue {
	private Node head;

	public Queue() {
		head = null;
	}

	public void enqueue(String data) {
		Node newNode = new Node();
		newNode.record = data;
		if (head == null) {
			head = newNode;
		} else {
			Node counter = head;
			while (counter.next != null) {
				counter = counter.next;
			}
			counter.next = newNode;
		}
	}

	public String dequeue() {
		String oldData;
		oldData = head.record;
		head = head.next;
		return oldData;

	}

	public void printQueue() {
		Node count = head;
		while (count != null) {
			System.out.println(count.record);
			count = count.next;
		}
	}

}
