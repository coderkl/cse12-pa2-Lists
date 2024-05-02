public class LinkedGL<E> implements MyList<E> {
    class Node {
        E value;
        Node next;

        public Node(E value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node front;
    int size;

    public LinkedGL(E[] contents) {
        // Fill in this constructor
        front = null;
        size = 0;
            for (int i = contents.length - 1; i >= 0; i--) {
                front = new Node(contents[i], front);
                size++;
            }
 

    }

    // Fill in all methods
    @SuppressWarnings("unchecked")
    @Override
    public E[] toArray()
    {
        E[] arr = (E[]) new Object[size];
        Node current = front;
        for(int i=0;i<size;i++)
        {
            arr[i] = current.value;
            current = current.next;
        }
        return arr;
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void transformAll(MyTransformer mt)
    {
        Node current = front;
        for(int i=0;i<size;i++)
        {
            if(current.value!=null)
            {
            current.value = (E) mt.transformElement(current.value);
            current = current.next;
            }
        }
    }
    @SuppressWarnings("unchecked")
    @Override
    public void chooseAll(@SuppressWarnings("rawtypes") MyChooser mc)
    {
        while (front != null && !mc.chooseElement(front.value)) {
            front = front.next;
            size--;
        }
        Node current = front;
        while (current != null && current.next != null) {
            if (!mc.chooseElement(current.next.value)) {
                // If the next node doesn't meet the condition, remove it
                current.next = current.next.next;
                size--;
            } else {
                // Move to the next node
                current = current.next;
            }
        }
    }
    @Override
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        return false;
    }
}
