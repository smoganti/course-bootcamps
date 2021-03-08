package assignment3;


public class StackLinkedListImpl<E> implements StackInterface<E>
{
   private LinkEntry<E> head;
   private int num_elem;

   public StackLinkedListImpl()
   {
      head = null;
      num_elem = 0;
   }

   public void push(E e)
   {
      /** Add code here **/

   }

   public E pop()
   {
      /** Add code here **/
	   return null;
   }

   public E peek()
   {
      /** Add code here **/
	   return null;
   }

   public int size()
   {
      /** Add code here **/
	   return num_elem;
   }

   /* ------------------------------------------------------------------- */
   /* Inner classes                                                      */
   protected class LinkEntry<E>
   {
      protected E element;
      protected LinkEntry<E> next;

      protected LinkEntry() { element = null; next = null; }
   }
} /* StackLinkedListImpl<E> */
