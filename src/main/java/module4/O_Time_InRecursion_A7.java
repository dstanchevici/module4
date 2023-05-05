class Node {
    int data;
    Node next;
}

class MyList {

    Node front, rear;
    int cnt = 0;

    public void add (int element)
    {
	if (front==null) {
	    front = rear = new Node();
	    front.data = element;
	}
	else { // Instead of else, a return can be added to the if block.
	    Node nextOne = new Node();
	    nextOne.data = element;
	    rear.next = nextOne;
	    rear = nextOne;
	}
		
    }

    public void print ()
    {
	if (front == null) return;
	printRecursive (front);
	System.out.println ("cnt=" + cnt);
    }

    void printRecursive (Node node)
    {
	if (node == null) return;
	System.out.println (node.data);
	cnt++;
	printRecursive (node.next);
    }
       
}

public class O_Time_InRecursion_A7 {

    public static void main (String[] argv)
    {
	MyList list = new MyList();
	
	for (int i=10; i<=100; i+=10) {
	    list.add(i);
	}
	list.print();
    }
}
