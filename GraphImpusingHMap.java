import java.io.*;
import java.util.*;
class GraphImpusingHMap{
    HashMap<Integer,LinkedList<Integer>> mp = new HashMap<>();
    void addEdge(int src,int dst){
        if(!mp.containsKey(src)){
            LinkedList<Integer> l = new LinkedList<>();
            l.add(dst);
            mp.put(src,l);
        }
        else{
            LinkedList<Integer> l = mp.get(src);
            l.add(dst);
            mp.put(src,l);
        }
    }
    void Print(){
        for(Map.Entry m:mp.entrySet()){
            System.out.println(m.getKey()+"-->"+m.getValue());
        }
    }
    public static void main(String[] args) {
        GraphImpusingHMap g = new GraphImpusingHMap();
        g.addEdge(0,1);
        g.addEdge(0,4);
        g.addEdge(0,5);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(3,2);
        g.addEdge(2,1);
        g.addEdge(3,1);
        g.Print();
        

    }
}