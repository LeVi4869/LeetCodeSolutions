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
    public Node copyRandomList(Node head) {
        if(head == null)    {
            return null;
        }
        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(head.val);
        Node temp = newHead;
        map.put(head, newHead);
        while(head != null) {
            if(head.next == null)   {
                temp.next = null;
            }
            else if(!map.containsKey(head.next)) {
                Node newNode = new Node(head.next.val);
                map.put(head.next, newNode);
                temp.next = newNode;
            }
            else    {
                Node newNode = map.get(head.next);
                temp.next = newNode;
            }
            if(head.random == null) {
                temp.random = null;
            }
            else if(!map.containsKey(head.random)) {
                Node newNode = new Node(head.random.val);
                map.put(head.random, newNode);
                temp.random = newNode;
            }
            else    {
                Node newNode = map.get(head.random);
                temp.random = newNode;
            }
            temp = temp.next;
            head = head.next;
        }
        return newHead;
    }
}