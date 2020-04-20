package dsalgopracticecodes;

import java.util.Scanner;

class BTree{
	int data;
	BTree left;
	BTree right;
	BTree(int data){
		this.data = data;
		
	}
	
}

class BinaryTreeOperations{
	Scanner scanner = new Scanner(System.in);
	String node = "root";
	
	
	void print(BTree root) {
		if(root==null) {
			return;
		}
		String output = "";
		output += root.data + "=>";
		if(root.left!=null) {
			output += "Left"+root.left.data;
		}
		if(root.right!=null) {
			output += "Right"+root.right.data;
		}
		System.out.println(output);
		print(root.left);
		print(root.right);
		
	}
	
	BTree insert() {
		System.out.println("Enter the data of "+node);
		int data = scanner.nextInt();
		if(data==-1){
			return null;
		}
		BTree treenode = new BTree(data);
		node = "left";
		treenode.left = insert();
		node = "right";
		treenode.right = insert();
		return treenode;
	}
	
	//void preOrder(BTree root) {
		//if(root == null) {
			//return ;
		//}
		//System.out.println(root.data);
		//preOrder(root.left);
		//preOrder(root.right);
	//}
	//void inOrder(BTree root) {
		//if(root == null) {
			//return ;
		//}
		//inOrder(root.left);
		//System.out.println(root.data);
		
		//inOrder(root.right);
	//}
	
}

public class BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    BinaryTreeOperations b = new BinaryTreeOperations();
		BTree root = b.insert();
		b.print(root);
		
		

	}

}
