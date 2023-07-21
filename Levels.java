package Yashwanth;

import java.util.*;
public class Levels {
	public static class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public Node root;
	
	public Levels() {
		root=null;
	}
	
	public int difference() {
		int oddlevel=0,evenlevel=0,diffoddeven=0;
		int nodeslevel=0;
		int currentlevel=0;
		Queue<Node> queue=new LinkedList<Node>();
		
		if(root==null) {
			System.out.println("Tree is Empty");
			return 0;
		}
		else {
			queue.add(root);
			currentlevel++;
			
			while(queue.size()!=0) {
				nodeslevel=queue.size();
				while(nodeslevel>0) {
					Node current=queue.remove();
					
					if(currentlevel % 2 == 0)
						evenlevel+=current.data;
					else
						oddlevel+=current.data;
					
					if(current.left!=null)
						queue.add(current.left);
					if(current.right!=null)
						queue.add(current.right);
					nodeslevel--;
				}
				currentlevel++;
			}
			diffoddeven=Math.abs(oddlevel-evenlevel);
		}
		return diffoddeven;
	}
	public static void main(String args[]) {
		Levels bt=new Levels();
		bt.root=new Node(1);
		bt.root.left=new Node(8);
		bt.root.right=new Node(9);
		bt.root.left.left=new Node(42);
		bt.root.right.left=new Node(58);
		bt.root.right.right=new Node(6);
		System.out.println("Difference between sum of odd level and even level nodes:"+bt.difference());
	}
}
