package assignment3;

public class StackArrayImpl<E> implements StackInterface<E>
{
    private int num_elem;
    private int max_elem;
    private E[] elements;

    public StackArrayImpl(int n)
    {
        max_elem = n;
        num_elem = 0;
        elements = (E[]) new Object[max_elem];
    }
    /**
     * Push an element on the stack.  If the stack is full, then allocate
     * more memory to hold a new stack, copy existing elements to the new
     * stack and add the new element to the newly enlarged stack.
     * Do not use System.arraycopy().  You are essentially implementing
     * what System.arraycopy() will do when you expand an existing array. **/
    public void extendStack( )
    {
        E[] new_elem = elements;
        max_elem = 2*max_elem;
        elements = (E[]) new Object[max_elem];
        for(int i = 0; i < new_elem.length; i++)
        {
            elements[i] = new_elem[i];	    }
    }

    public void push(E e)
    {
        /** Add code here **/
        if (num_elem == elements.length)
        {
            extendStack( );
        }

        elements[num_elem]= e;
        num_elem++;
        return;
    }

    public E pop()
    {
        /** Add code here **/
        num_elem --;
        return elements[num_elem];
    }

    public E peek()
    {
        /** Add code here **/
        return elements[num_elem-1];
    }

    public int size()
    {
        /** Add code here **/
        return num_elem;
    }

} /* StackArrayImpl<E> */
