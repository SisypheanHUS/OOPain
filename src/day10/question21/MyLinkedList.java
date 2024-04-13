package day10.question21;

public class MyLinkedList extends MyAbstractList{
    MyLinkedListNode head;
    int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }
    private MyLinkedListNode getNode(int index){
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }
    @Override
    public void add(Object o){
        add(o,size);
    }
    @Override
    public void add(Object o,int index){
        checkBoundaries(index,size);
        if(index == 0){
            head = new MyLinkedListNode(o,head);
        }else{
            MyLinkedListNode current = getNode(index-1);
            current.setNext(new MyLinkedListNode(o,current.next));
        }
        size++;
    }
    @Override
    public void remove(int index){
        checkBoundaries(index,size-1);
        if(index == 0){
            head = head.next;
        }else{
            MyLinkedListNode current = getNode(index-1);
            current.setNext(current.next.next);
        }
        size--;
    }
    @Override
    public Object get(int index){
        checkBoundaries(index,size-1);
        return getNode(index).getPayload();
    }
    @Override
    public int size(){
        return size;
    }
}
