import java.util.ArrayList;

public class Main {

    Graph g;

    public static void main(String[] args){
        new Main();
    }

    public Main(){
        create();
    }


    public void create(){
        this.g = new Graph();

        Node two = new Node(2);
        Node five = new Node(5);
        Node six = new Node(6);
        Node ten = new Node(10);

        g.addNode(two);
        g.addNode(five);
        g.addNode(six);
        g.addNode(ten);

        Edge e = g.addEdge(new Edge(two, five, 3));
        two.addEdge(e);
        five.addEdge(e);
        e = g.addEdge(new Edge(five, six, 1));
        five.addEdge(e);
        six.addEdge(e);
        e = g.addEdge(new Edge(two, ten, 2));
        two.addEdge(e);
        ten.addEdge(e);
    }

    public void print(){

    }

}
