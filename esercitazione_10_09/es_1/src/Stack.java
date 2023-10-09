import java.util.ArrayList;
import java.util.*;

public class Stack <E> implements Iterable{
    private ArrayList<E> elements = new ArrayList<>();

    private class stackIterator implements Iterator {
        private  int position;

        stackIterator() {
            this.position = elements.size() - 1;
        }
        @Override
        public boolean hasNext() {
            return this.position >= 0;
        }

        @Override
        public Object next() {
            if(!hasNext())
                throw new RuntimeException("Stack Empty");
            position --;
            return elements.get(position);
        }
    }

    @Override
    public Iterator iterator() {
        return new stackIterator();
    }

    public void push(E e){
        elements.add(e);
    }

    public void pushAll(Stack <? extends E> other){
        for(E e: other.elements){
            this.elements.add(e);
        }
    }

    public void pushAllIn(Stack<? super E> other){
        for(E e: this.elements){
            other.elements.add(e);
        }
    }

    public E pop() {
        return elements.remove(elements.size() - 1);
    }

    @Override
    public String toString() {
        String out = new String();
        for(E e: elements){
            out += " " + e.toString();
        }
        return out;
    }
}
