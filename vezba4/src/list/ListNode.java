package list;

public class ListNode {
    private Object element;
    private ListNode next;

    public ListNode(Object element){
        this.element = element;
    }

    public ListNode(Object element, ListNode next){
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
