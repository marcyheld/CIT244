import java.util.ArrayList;

public class GenericStack<E> {
  private ArrayList<E> list = new ArrayList<E>();

  public int getSize() {
    return list.size();
    // uses .size method of ArrayList class, returns num of elements
  }

  public E peek() {
    return list.get(getSize() - 1);
    // returns last element in stack
  }

  public void push(E o) {
    list.add(o);
    // adds object "o" to end of ArrayList
  }

  public E pop() {
    E o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
    // removes last element in stack
  }

  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public String toString() {
	return "stack: " + list.toString();
  }
}
