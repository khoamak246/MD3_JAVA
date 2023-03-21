package practiceUsingQueue;

public class Node {
    public int data;
    public Node link;

    public Node(int data) {
        this.data = data;
        this.link = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", link=" + link +
                '}';
    }
}
