package codingInterview101;

public class LinkedList {
	public class ListElement<T> {
		public ListElement(T value){
			data = value;
		}
		
		public T value(){
			return data;
		}
		public ListElement<T> next(){
			return next;
		}
		
		public void setData(T value){
			data = value;
		}
		
		public void setNext(ListElement<T> elem){
			next = elem;
		}
		
		public ListElement<T> insertInFront(ListElement<T> list, T data){
			ListElement<T> l = new ListElement<T>(data);
			l.setNext(list);
			return l;
		}
		
		public ListElement<T> insertInLast(ListElement<T> head, T data){
			//find last element and set next with new data.
			ListElement<T> lastElem = find(head, null);
			ListElement<T> newLastElem = new ListElement<T>(data);
			
			lastElem.setNext(newLastElem);
			return lastElem;
		}
		
		public ListElement<T> find(ListElement<T> head, T data){
			ListElement<T> elem = head;
			while(elem!=null || elem.value() != data){
				elem = elem.next();
			}
			return elem;
		}
		
		private T data;
		private ListElement<T> next;
		
	}
	
}
