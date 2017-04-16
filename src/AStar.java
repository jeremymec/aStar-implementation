import java.util.HashMap;

public class AStar {

    HashMap<Node, Value> nodes;
    HashMap<Node, Value> visited;


}

class Value{
    // Total cost of Node
    int cost;

    //heuristic
    int h;

    int g;

    public Value(int h, int g){
        this.h = h;
        this.g = g;

        this.cost = g + h;
    }

    public int cost(){
        return this.cost;
    }

}