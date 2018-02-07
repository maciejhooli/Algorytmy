package PracaDomowa0302.ZD03OneWayList;

public class MyOneWayList {
    private int counter = 0;
    private Element head;

    public int getCounter() {
        return counter;
    }

    public Element getHead() {
        return head;
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

    public Element findLastElement() {
        Element currentElement = head;
        while (currentElement.getNext() != null) {
            currentElement = currentElement.getNext();
        }
        return currentElement;
    }

    public Element findAccordingToIndex(int index) {
        Element currentElement = head;
        for (int i = 0; i < this.counter; i++) {
            if (i == index) {
                return currentElement;
            }
            currentElement = currentElement.getNext();
        }
        return null;
    }

    private int findIndexOfElement(Element element) {
        Element currentElement = head;
        int index = 0;
        while (currentElement.getNext() != null) {
            if (currentElement.getData() == element.getData()) {
                return index;
            }
            currentElement = currentElement.getNext();
            index++;
        }
        return -1;
    }

    private void setFirstElement(Element newElement) {
        head = newElement;
        newElement.setNext(null);
        counter++;
    }

    public void addBegining(int value) {
        Element newElement = new Element();
        newElement.setData(value);
        if (counter > 0) {
            newElement.setNext(head);
            head = newElement;
            counter++;
        } else setFirstElement(newElement);
    }

    public void addLast(int value) {
        Element newElement = new Element();
        newElement.setData(value);
        if (counter > 0) {
            newElement.setNext(null);
            findLastElement().setNext(newElement);
            counter++;
        } else setFirstElement(newElement);
    }

    public void addElementAfterElement(int newValue, int valueInsertAfter) throws Exception {
        Element elementAfter = findForward(valueInsertAfter);

        if (elementAfter == null) {
            throw new Exception("Nie ma wartości");
        }

        if (elementAfter.getNext() == null) {
            addLast(newValue);
        } else {
            Element newElement = new Element();
            newElement.setData(newValue);
            newElement.setNext(elementAfter.getNext());
            elementAfter.setNext(newElement);
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

            findAccordingToIndex(findIndexOfElement(elementBefore)).setNext(newElement);
            counter++;
        }
    }

    public void removeFromList(int value) throws Exception {
        Element elementToDelete = findForward(value);
        if (elementToDelete == null) {
            throw new Exception("Nie ma wartości");
        }

        if (elementToDelete.getNext() == null ) {
            findAccordingToIndex(counter - 2).setNext(null);
        }

        if (elementToDelete.getData() ==  head.getData()) {
            head = head.getNext();
        }

        if (elementToDelete != head && elementToDelete.getNext() !=null) {
            findAccordingToIndex(findIndexOfElement(elementToDelete) - 1).setNext(elementToDelete.getNext());
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
