package testAlgos;

import testAlgos.LinkedList.Node;

public class MergeTwoLists {

	
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1 = LinkedList.insert(l1, 1); 
		l1 = LinkedList.insert(l1, 2); 
		l1 = LinkedList.insert(l1, 4); 
        // Print the LinkedList 
        //LinkedList.printList(l1); 
        
        LinkedList l2 = new LinkedList();
        l2 = LinkedList.insert(l2, 1); 
        l2 = LinkedList.insert(l2, 3); 
        l2 = LinkedList.insert(l2, 4); 
        // Print the LinkedList 
        //LinkedList.printList(l2); 
        
        LinkedList.printList(mergeTwoLists(l1,l2));
        
        
	}
	
	public static LinkedList mergeTwoLists(LinkedList l1, LinkedList l2) {
		LinkedList l3 = new LinkedList();
		
		Node currNode1 = l1.head; 
		Node currNode2 = l2.head; 
		
		while (currNode1 != null) {			
			while (currNode2 != null) {
				if(currNode1.data <= currNode2.data) {
					l3 = LinkedList.insert(l3, currNode1.data); 
					currNode1 = currNode1.next; 
				}
				else {
					l3 = LinkedList.insert(l3, currNode2.data); 
					currNode2 = currNode2.next; 
				}
			}
		}
		

		return l3;
    }
	



}
