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
      LinkEntry<E> ne = new LinkEntry<E>();
      ne.element = e;
      // head.next=ne;
      // head.element = e;
      ne.next = head;
      head = ne;
      num_elem++;
      return;
   }

   public E pop()
   {
      /** Add code here **/
      E e = head.element;
      head = head.next;
      num_elem--;
      return e;
   }

   public E peek()
   {
      /** Add code here **/
      return head.element;
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
