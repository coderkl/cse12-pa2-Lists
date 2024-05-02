public class ArrayGL<E> implements MyList<E> {

    E[] elements;
    int size;

    public ArrayGL(E[] initialElements) {
        this.elements = initialElements;
        this.size = initialElements.length;
    }

    // Fill in all required methods here
    @Override
    public E[] toArray()
    {
        return elements;
    }
    @Override
	public void transformAll(MyTransformer mt)
    {
        for(int i=0;i<this.size;i++)
        {
            if(elements[i]!=null)
            {
                elements[i] = (E) mt.transformElement(elements[i]);
            }
        }
    }
    @Override
	public void chooseAll(MyChooser mc)
    {
        int ns = 0; 
        for (int i = 0; i < size; i++) {
            if (elements[i] != null && mc.chooseElement(elements[i])) 
            {
                elements[ns++] = elements[i];
            }
        }
    }
    @Override
	public boolean isEmpty()
    {
        if(elements.length==0)
        {
            return true;
        }
        return false;
    }
}