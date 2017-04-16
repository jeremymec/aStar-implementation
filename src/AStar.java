import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class AStar {
    Graph g;
    HashMap<Node, Value> nodes;
    ArrayList<Node> visited;

    public AStar(Graph g){
        this.nodes = new HashMap<>();
        this.visited = new ArrayList<>();

        this.g = g;

        for (Node n : g.nodes){
            nodes.put(n, new Value(Integer.MAX_VALUE, Integer.MAX_VALUE));
        }
    }


}

class Value{
    // Total cost of Node
    private int cost;

    //heuristic
    int h;

    //edge cost
    int g;

    public Value(int h, int g){
        this.h = h;
        this.g = g;

        this.cost = g + h;
    }

    public int getCost(){
        return this.cost;
    }

}