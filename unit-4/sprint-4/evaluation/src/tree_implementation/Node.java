package tree_implementation;

public class Node {

	  int data;
	  Node left;
	  Node right;

	  Node(int val){
	    this.data=val;
	    this.left=null;
	    this.right=null;
	  }
	
}

class Tree {
	  
    Node root;
  
  // Tree(){root=null;}
  
  public static void main(String[] args) {
    
    Tree tree=new Tree();
    tree.root=new Node(10);  

    Node node2=new Node(20);
    Node node3=new Node(30);
    Node node4=new Node(12);
    Node node5=new Node(15);
    Node node6=new Node(80);

    tree.root.left=node2;
    tree.root.right=node3;

    node2.left=node4;
    node2.right=node5;

    node2.left=node4;
    node2.right=node5;

    node5.left=node6;
    // tree creation till here

    Tree.preOrderTraversal(tree.root);


    
  }
    public static void preOrderTraversal(Node root){ // PLR
      if(root==null)return;
      System.out.println(root.data);
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);   
    }
}
