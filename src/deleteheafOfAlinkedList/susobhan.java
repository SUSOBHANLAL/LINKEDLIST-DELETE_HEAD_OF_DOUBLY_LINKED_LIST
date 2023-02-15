package deleteheafOfAlinkedList;
class node{
	int data;
	node prev;
	node next;
	node(int data){
		this.data=data;
		prev= null;
		next=null;
		
	}
}
public class susobhan {
	public static void main(String args[]) {
		node head = new node(12);
		node temp1= new node (20);
		node temp2= new node(30);
		node temp3= new node(50);
		head.next = temp1;
		temp1.prev=  head;
		
		temp1.next= temp2;
		temp2.prev= temp1;
		
		temp2.next=temp3;
		temp3.prev= temp2;
		temp3.next=null;
		head=deletehead(head);
		printnode(head);
		
	}
	
	static node deletehead(node head) {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return null;
		}
		
		else {
			head=head.next;
			head.prev=null;
			return head;
		}
		
	}
	
	public static void printnode(node head)
	{
		node curr= head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr= curr.next;
		}
		System.out.println();
	}
	

}
