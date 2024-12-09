
public class Queue<T> {

    private Node<T> head;

    public Queue() {
        head = null;
    }

    public T pop() {
        if (head == null) {
            System.out.println("Queue has not been initiazed");
            return null;

        } else {

            // Head -> New Value
            var valueOfHead = head.getNodeValue();

            // Temporary variable to hold the head
            Node<T> temp = head.getNextNode();

            head = temp;

            System.out.println("New head after popping: "+ head.getNodeValue());

            return valueOfHead;

        }
    }

    public void readAllTheValuesOfQueue() {

        if (head == null) {
            System.out.println("Queue has not been initiazed");

        } else {

            // We want to iterate over the values of the Queue
            var temp = head;

            while (temp != null) {

                System.out.println("Value is: " + temp.getNodeValue());

                temp = temp.getNextNode();

            }
        }
    }

    public void add(T value) {

        // This means that the queue has not been initialized
        int count= 0;
        if (head == null) {

            head = new Node<>(value);
            count++;
            System.out.println("Size of the queue: " + count);
            
        } else { // Queue has been initialized

            Node<T> newNode = new Node<>(value);
            var temp = head;
            count++;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();
                count++;
            
            }

            
            // We have traversed to the end of the Queue
            // Append the new node to the end of the Queue
            temp.setNextNode(newNode);
            count++;
            System.out.println("Size of the queue: " + count);

        }

    }

    public static void main(String[] args) throws Exception {

        // Queue is basically a FIFO Structure
        // 1 -> 2 -> -3 -> should return

        System.out.println("Hello World");

        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        queue.readAllTheValuesOfQueue();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
    }
}
