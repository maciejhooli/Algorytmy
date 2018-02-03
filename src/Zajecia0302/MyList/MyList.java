package Zajecia0302.MyList;

public class MyList {
    private int counter = 0;
    private Element head;
    private Element tail;

    public int getCounter() {
        return counter;
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public Element findForward(int value) {
        Element currentElement = head;
        if (currentElement.getData() == value) {
            return currentElement;
        }
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
            if (currentElement.getData() == value) {
                return currentElement;
            }
        }
        return null;
    }

    public Element findBackwards(int value) {
        Element currentElement = tail;
        if (currentElement.getData() == value) {
            return currentElement;
        }
        while (currentElement.getPrev() != null) {
            currentElement = currentElement.getNext();
            if (currentElement.getData() == value) {
                return currentElement;
            }
        }
        return null;
    }

    private void setFirstElement(Element newElement) {
        head = newElement;
        tail = newElement;
        newElement.setNext(null);
        newElement.setPrev(null);
        counter++;
    }

    public void addBegining(int value) {
        Element newElement = new Element();
        newElement.setData(value);
        if (counter > 0) {
            newElement.setNext(head);
            newElement.setPrev(null);
            head = newElement;
            newElement.getNext().setPrev(newElement);
            counter++;
        } else setFirstElement(newElement);
    }

    public void addLast(int value) {
        Element newElement = new Element();
        newElement.setData(value);
        if (counter > 0) {
            newElement.setNext(null);
            newElement.setPrev(tail);
            tail = newElement;
            newElement.getPrev().setNext(newElement);
            counter++;
        } else setFirstElement(newElement);
    }

    public void addElementAfterElement(int newValue, int valueInsertAfter) throws Exception {
        Element elementAfter = findForward(valueInsertAfter);

        if (elementAfter == null) {
            throw new Exception("Nie ma wartości");
        }

        if (elementAfter == tail) {
            addLast(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue);
            newElement.setNext(elementAfter.getNext());
            newElement.setPrev(elementAfter);

            elementAfter.setNext(newElement);
            newElement.getNext().setPrev(newElement);
            counter++;
        }
    }

    public void addElementBeforeElement(int newValue, int valueInsertBefore) throws Exception {
        Element elementBefore = findForward(valueInsertBefore);

        if (elementBefore == null) {
            throw new Exception("Nie ma wartości");
        }
        if (elementBefore == head) {
            addBegining(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue);   //ustawiam wartość nowego elementu
            newElement.setNext(elementBefore); //ustawiam wskaźnik dla nowego elementu na następny element
            newElement.setPrev(elementBefore.getPrev()); //ustawiam wskaźnik dla nowego elementu na element, który element nastepny poprzedzał

            elementBefore.setPrev(newElement); //ustawiam wskaźniki elementu przed nowym elementem
            newElement.getPrev().setNext(newElement); // ustawiam wskaźnik elementu za nowym elementem
            counter++;
        }
    }

    public void removeFromList(int value) throws Exception {
        Element elementToDelete = findForward(value);
        if (elementToDelete == null) {
            throw new Exception("Nie ma wartości");
        }

        if (elementToDelete != head && elementToDelete != tail){
            elementToDelete.getPrev().setNext(elementToDelete.getNext()); //getPrev -> przechodze do elementu poprzedniego i ustawiam wskaźnik next na element następny za usuwanym elementem
            elementToDelete.getNext().setPrev(elementToDelete.getPrev()); //getNext -> przechodze do elementu nastpenego i ustawiam wskaźnik prev na element poprzedni przed usuwanym elementem
        }

        if (elementToDelete == head) {
            head = head.getNext();
            head.setPrev(null);
        }

        if (elementToDelete == tail) {
            tail = tail.getPrev();
            tail.setNext(null);
        }


        counter--;

    }


    //DEBUG
    public void printAll() {
        Element currentElement = head;
        while (true) {
            System.out.println(currentElement.getData());
            if (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            } else {
                break;
            }
        }
    }
}
