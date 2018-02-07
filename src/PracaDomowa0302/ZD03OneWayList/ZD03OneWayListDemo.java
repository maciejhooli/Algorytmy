package PracaDomowa0302.ZD03OneWayList;

public class ZD03OneWayListDemo {
    public static void main(String[] args) {
        MyOneWayList lista = new MyOneWayList();
        lista.addBegining(9);
        lista.addBegining(8);
        lista.addBegining(7);
        lista.addBegining(6);
        lista.addBegining(5);
        lista.addLast(110);
        lista.addLast(109);
        lista.addLast(108);
        lista.addLast(107);
        lista.printAll();
        System.out.println("*********************");
        try {
            lista.addElementAfterElement(1000, 107);
            lista.addElementAfterElement(1100, 5);
        } catch (Exception e) {
            e.getMessage();
        }
        lista.printAll();
        System.out.println("*********************");
        try {
            lista.removeFromList(1100);
            lista.removeFromList(1000);
            lista.removeFromList(5);
        } catch (Exception e) {
            e.getMessage();
        }

        lista.printAll();
    }
}

