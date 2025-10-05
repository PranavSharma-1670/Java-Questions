//1.	Create a user-defined generic class Box<T> with methods addItem(T item) 
//and getItem(). Demonstrate its usage with String and Integer types. 
package Set1;

class Box <T> {
	private T item;
	
	public void addItem(T item) {
		this.item = item;
	}
	
	public T getItem() {
		return item;
	}
}

public class Ques1 {
	public static void main(String[] args) {
		Box<String> Sbox = new Box<>();
		Sbox.addItem("Hello World");
		System.out.println(Sbox.getItem());
		
		Box<Integer> Ibox = new Box<>();
		Ibox.addItem(379);
		System.out.println(Ibox.getItem());
	}
}
