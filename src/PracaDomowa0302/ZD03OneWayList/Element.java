package PracaDomowa0302.ZD03OneWayList;

public class Element {
    private int data;
    private Element next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{"+"data=" + data + '}';
    }
}
