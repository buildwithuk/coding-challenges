
/**
 * 
 * Base class for the Stack
 */
public class Stack<T> {

    public Node<T> head;

    public Stack() {

    }

    public void readAllTheStackValues() {


        if (head == null) {
            System.out.println("Stack is empty");
        } else {

            var temp = head;

            System.out.println("Value: " + temp.value);


            while (temp.getNextNode() != null) {
                
                temp = temp.getNextNode();

                System.out.println("Value: " + temp.getValue());

            }



        }

    }
    


    public Stack(T value) {
        head = new Node<>(value);
    }

    public T pop() {

        if (head == null)  {
            System.out.println("Stack is empty");
            return null;
        } else {

            var temp = head;

            head = head.nextNode;

            return temp.value;

        }

    }

    public void push(T value) {

        if (head == null) {
            head = new Node<>(value);

        } else {

            Node<T> newHead = new Node<>(value);

            newHead.nextNode = head;

            head = newHead;

        }
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

}