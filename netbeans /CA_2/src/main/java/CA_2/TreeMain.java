/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CA_2;

/**
 *
 * @author valeriadionisio
 */

import java.util.ArrayList;

//This class controls the binary tree.
//TreeBinary represents one node, but TreeMain manages the full tree.

public class TreeMain {

    // Root node of the binary tree
    private TreeBinary root;

    //This method creates a simple binary tree using employees from the ArrayList.
    
    public void createTree(ArrayList<Employee> employeeList) {

        if (employeeList.isEmpty()) {
            System.out.println("Employee list is empty.");
            return;
        }

        root = new TreeBinary(employeeList.get(0));
        
        // Adding the next employees to the tree
        for (int i = 1; i < 20 && i < employeeList.size(); i++) {

         insertLevelOrder(employeeList.get(i));
}
        
        System.out.println("Binary tree created successfully.");
        System.out.println("Root employee: " + root.employee.getFullName());
        
        System.out.println("Total nodes in tree:" + countNodes(root));
        
        // Displaying the height of the binary tree
        System.out.println("Tree height: " + treeHeight(root));
        
        // Displaying the tree employees in level-order
        displayLevelOrder();
        
    }
    
    
    //In this part, I am adding employee records into the binary tree structure. 
    //The first employee becomes the root node of the tree, 
    //and the next employees are inserted into the left and right sides of the tree using a simple level order insertion approach.
    //I created separate methods to keep the code more organised and easier to understand.
  
    
    // This method inserts employees into the tree in a simple level-order way
    private void insertLevelOrder(Employee employee) {

    TreeBinary newNode = new TreeBinary(employee);

    if (root.left == null) {
        root.left = newNode;
    } else if (root.right == null) {
        root.right = newNode;
    } else {
        insertLevelOrder(root.left, newNode);
    }
}

    // to help to used to continue inserting nodes into the tree
    private void insertLevelOrder(TreeBinary current, TreeBinary newNode) {

    if (current.left == null) {
        current.left = newNode;
    } else if (current.right == null) {
        current.right = newNode;
    } else {
        insertLevelOrder(current.left, newNode);
    }
}
    
    // This method counts how many nodes exist in the binary tree
public int countNodes(TreeBinary node) {

    // If the node is null, there is nothing to count
    if (node == null) {
        return 0;
    }

    // Count this node + nodes on the left + nodes on the right
    return 1 + countNodes(node.left) + countNodes(node.right);
}
   // This method calculates the height of the binary tree
public int treeHeight(TreeBinary node) {

    // Base case: if the node is null, height is 0
    if (node == null) {
        return 0;
    }

    // Calculate left subtree height
    int leftHeight = treeHeight(node.left);

    // Calculate right subtree height
    int rightHeight = treeHeight(node.right);

    // Return the larger height + 1 for the current node
    return Math.max(leftHeight, rightHeight) + 1;
} 
   
    // This method displays the tree using level-order traversal
    public void displayLevelOrder() {

    // If the tree is empty, show a message
    if (root == null) {
        System.out.println("Tree is empty.");
        return;
    }

    // This ArrayList will work like a simple queue
    ArrayList<TreeBinary> queue = new ArrayList<>();

    // Add the root node to start the traversal
    queue.add(root);

    System.out.println("\n===== LEVEL ORDER TRAVERSAL =====");

    // Loop while there are still nodes in the queue
    while (!queue.isEmpty()) {

        // Remove the first node from the queue
        TreeBinary current = queue.remove(0);

        // Display the employee stored in the current node
        System.out.println(current.employee.getFullName());

        // If the current node has a left child, add it to the queue
        if (current.left != null) {
            queue.add(current.left);
        }

        // If the current node has a right child, add it to the queue
        if (current.right != null) {
            queue.add(current.right);
        }
    }
}


}
