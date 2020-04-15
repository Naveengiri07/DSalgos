package dsalgopracticecodes;

import java.util.ArrayList;
import java.util.Scanner;

class Treenode{
	int data;
	ArrayList<Treenode> children;
	Treenode(int data){
		this.data = data;
		this.children = new ArrayList<>();
	}
	
}

class TreeOperations{
	Scanner scanner = new Scanner(System.in);
	void print(Treenode root) {
		String str = root.data+"=>";
		for(Treenode child : root.children) {
			str+= child.data+" , ";
			}
		System.out.println(str);
		
		
		for(Treenode child : root.children) {
			print(child);
		}
	}
	
	
	
	
	
	Treenode addSubtree() {
		Treenode parent;
		//1
		System.out.println("Enter the data of the node");
		int data = scanner.nextInt();
		parent = new Treenode(data);
		System.out.println(data+"th Node and enter the no. of chilren");
		int childs = scanner.nextInt();
		for(int i=1 ; i<=childs; i++) {
			Treenode childNode = addSubtree();
			parent.children.add(childNode);
		}
		return parent;	
	}
	
}


public class GenericTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeOperations tp = new TreeOperations();
		Treenode root =tp.addSubtree();
		tp.print(root);

	}
	
	
}
