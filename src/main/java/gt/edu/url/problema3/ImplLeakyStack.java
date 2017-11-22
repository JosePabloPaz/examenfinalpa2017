package gt.edu.url.problema3;

public class ImplLeakyStack<E> extends CircularLinkedList<E> implements LeakyStack<E>{

	private int size = 0;
	public int limite;
	
	public ImplLeakyStack(int limite) {
		super();
		this.limite = limite;
	}
	/**
	 * @return Tamaño de la lista
	 */
	@Override
	public int size() {return size;}
	/**
	 * @return Si la lista esta vacia
	 */
	@Override
	public boolean isEmpty() {return size ==0;}
	/**
	 * @param Elemento a insertar
	 * @return Elemento insertado
	 */
	@Override
	public E saveHistory(E e) {
		if(size == limite) {
			undo();
		}
		
		if(size == 0) {
			tail = new Node<>(e, null);
			tail.setNext(tail);
		}else {
			Node<E> newest = new Node<>(e, tail.getNext());
			tail.setNext(newest);
		}
		size++;
		
		return tail.getNext().getElement();
	}
	/**
	 * @return Valor del ultimo 
	 */
	@Override
	public E actual() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	/**
	 * @return Valor eliminado
	 */
	@Override
	public E undo() {
		if(isEmpty()) return null;
		if(isEmpty()) return null;
		Node<E> head = tail.getNext();
		if(head == tail) tail = null;
		else tail.setNext(head.getNext());
		size--;
		return head.getElement();
	}

}
