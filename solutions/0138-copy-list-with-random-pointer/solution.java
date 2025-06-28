/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {

//     private Node deepCopy(Node head){
//         Node Head1=new Node(head.val);
//         Node temp1=head.next;
//         Node temp2=Head1;
//         while(temp1!=null){
//             Node node=new Node(temp1.val);
//             temp2.next=node;
//             temp2=temp2.next;
//             temp1=temp1.next;
//         }
//         return Head1;
//     }
//     private Node alternateConnection(Node head1,Node head2){
//         Node dummy=new Node(-1);
//         Node t1=head1;
//         Node t2=head2;
//         Node temp=dummy;

//         while(t1!=null && t2!=null){
//             temp.next=t1;
//             temp=temp.next;
//             t1=t1.next;
//             temp.next=t2;
//             temp=temp.next;
//             t2=t2.next;



//         }
//         return dummy.next;
//     }


//     private void assigningrandom( Node head1, Node head2){
//         Node t1=head1;
//         Node t2=head2;
//         while(t1!=null){
//             t2=t1  .next;
//             if(t1.random!=null) t2.random=t1.random.next;
//             t1=t1.next.next;
//         }
//     }
    
//    private void splitingList(Node head,Node head2){

//       Node t1=head;
//       Node t2=head2;
//       while(t1!=null){
//         t1.next=t2.next;
//         t1=t1.next;
//         if(t1==null) break;
//         t2.next=t1.next;
//         t2=t2.next;
//       }
      
//    }
    
    public Node copyRandomList(Node head) {
        // if(head==null ) return null;
        // // Create a Deep copy
        // Node head2=deepCopy(head);
        // // create Alternate connection

        // alternateConnection(head,head2);

        // // Assignong random
        // assigningrandom(  head,  head2);

        // // Slpliting Linked List

        // splitingList(head,head2);
        // return head2;






        // using Hash MAP
        if(head==null) return null;
        Node Head1=new Node(head.val);
        Node temp1=head.next;
        Node temp2=Head1;
        while(temp1!=null){
            Node node=new Node(temp1.val);
            temp2.next=node;
            temp2=temp2.next;
            temp1=temp1.next;
        }

        HashMap<Node,Node> map=new HashMap<>();
        temp1=head;
        temp2=Head1;
        
        Node head1=temp2;
        while(temp1!=null){
            map.put(temp1,temp2);
            temp1=temp1.next;
            temp2=temp2.next;

            
        }

        for(Node original:map.keySet()){
            Node dublicate=map.get(original);
            if(original!=null){
                dublicate.next=map.get(original.next);
                dublicate.random=map.get(original.random);
                
            }
        }
        return head1;

        


    }
}
