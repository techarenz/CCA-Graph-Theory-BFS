import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String[] args) {
        // Declare and initialize your adjacency list.

        // Declare and initialize your starting node.

        // Iterative BFS.
        System.out.println("Iterative BFS solution");
        // Call your iterative BFS method.

        System.out.println();
        // Recursive BFS.
        System.out.println("Recursive BFS solution");
        // Declare and instantiate a queue.

        // Add the starting node to the queue.

        // Call your recursive BFS method.

    }

    public static void bfsIterative(int[][] adjacencyList) {

        // Create a new queue.

        // Create an array that will record whether we have visited each node.

        // Add the starting node to the queue.

        // While our queue is not empty ...

            // Poll the first node from the queue.

            // Mark this node as visited.

            // Print the node - not fundamental to our algorithm - just so we can see the path that our algorithm takes.

            // Get the neighbours of this node.

            // For each neighbouring node ...

                // Obtain a reference to the neighbour node.

                // If the neighbour node has not yet been visited ...

                    // Mark the neighbour node as visited

                    // Add the neighbour node to the queue




    }

    public static void bfsRecursive(int[][] graph, Queue<Integer> queue, boolean[] visited) {
        // If the queue is empty, return (this is the base case).

        // Poll the first node from the queue and store it in a variable called node.

        // Record this node as visited.

        // Print the node - not fundamental to our algorithm - just so we can see the path that our algorithm takes.

        // Get the neighbours of this node.

        // For each neighbouring node ...

            // Obtain a reference to the neighbour node.

            // If the neighbour node has not yet been visited ...

                // Mark the neighbour node as visited.

                // Add the neighbour node to the queue.


        
        // Call the bfsRecursive method (this is the recursive call).

    }

}
