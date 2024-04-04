package SecondYear2ndSem.DFS;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Graph graph;
        ArrayList<GraphNode> nodeList = new ArrayList<>();
        Scanner scanf = new Scanner(System.in);

        int numOfBaranggays;


        System.out.print("Enter number of nodes: ");
        numOfBaranggays = scanf.nextInt();

        scanf.nextLine();

        for(int i = 0; i < numOfBaranggays; i++){
            int name = 'A' + i;
            nodeList.add(new GraphNode("" + (char)name, i));
        }

        for(int i = 0; i < nodeList.size(); i++){
            System.out.println(i + ": " + nodeList.get(i).name);
        }

        graph = new Graph(nodeList);

        while(true){
            int index1;
            int index2;

            System.out.print("Enter the index of the adjacent nodeList: ");

            try{
                index1 = scanf.nextInt();
                index2 = scanf.nextInt();
            }catch (Exception e){
                break;
            }

            graph.addUndirectedEdge(index1, index2);
        }

        graph.bfs();

        System.out.println(graph.toString());

    }

}
