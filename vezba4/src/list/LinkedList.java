package list;

public class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int listSize;

    public void addFirst(Object element){
        ListNode newNode = new ListNode(element, head);
        head = newNode;

        if(listSize == 0){
            tail = head;
        }

        listSize++;
    }

    public void addLast(Object element){
        ListNode newNode = new ListNode(element);

        if(listSize == 0){
            head = tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
        listSize++;
    }

    public void add(int index, Object element){
        if(index == 0 && listSize == 0){
            addFirst(element);
            return;
        }

        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        if(index == listSize - 1){
            addLast(element);
            return;
        }

        ListNode currentNode = head;

        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNext();
        }

        ListNode newNode = new ListNode(element, currentNode.getNext());
        currentNode.setNext(newNode);
        listSize++;
    }

    public Object getFirst(){
        return null;
    }

    public Object getLast(){
        return null;
    }

    public Object get(int index){
        if(index < 0 || index >= listSize){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + listSize);
        }

        ListNode currentNode = head;

        for (int i = 0; i < index ; i++) {
            currentNode = currentNode.getNext();
        }

        return currentNode.getElement();
    }

    public int indexOf(Object element){
        return -1;
    }

    public void set(int index, Object element){

    }

    public void removeFirst(){

    }

    public void removeLast(){

    }

    public void remove(int index){

    }

    public void remove(Object element){

    }

    public void clear(){

    }

    public int size(){
        return listSize;
    }
}
