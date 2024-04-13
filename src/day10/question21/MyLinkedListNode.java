package day10.question21;

public class MyLinkedListNode {
    Object payload;
    MyLinkedListNode next;

    public MyLinkedListNode(Object payload){
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next){
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    public MyLinkedListNode getNext() {
        return next;
    }
    public void setNext(MyLinkedListNode nextValue) {
        this.next = nextValue;
    }
}
