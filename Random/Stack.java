import java.util.Iterator;

public class Stack<Item> {



	private int len = 0;
    private Item[] stack = (Item[]) new Object[1];


    public Item pop() {
            Item item = stack[--len];
            stack[len] = null;
            if (len > 0 && len == stack.length/4)
                resize(stack.length/2);
            return item;
        }
    public void push(Item item) {
            if (len == stack.length) {
	                resize(stack.length*2);
	            }
            stack[len++] = item;
        }



    public boolean isEmpty() {
            return len == 0;
        }
    public int size() {
            return len;
        }
    public void resize(int max) {
            Item[] temp = (Item[]) new Object[max];
            for (int i = 0; i< len; i++) {
	                temp[i] = stack[i];
	            }
            stack = temp;
        }



    public class ReverseStackIterator implements Iterator<Item> {
    
            private int i = len;
    
            public boolean hasNext() {
	                return i > 0;
	            }
            public Item next() {
	                return stack[--i];
	            }
            public void remove() {
	    
	            }
        }

    @Override
        public String toString() {
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i< len; i++) {
		            stringBuilder.append(i).append(" ").append("\n");
		        }
	        return stringBuilder.append(" ").append(len).toString();
	    }


    public Iterator<Item> iterator() {
	    return new ReverseStackIterator();
    }


    public static void main(String[] args) {
    
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < 300; i++) {
	                stack.push(i);
	            }
            System.out.println(stack.toString());
            for (int i = 0; i< 121; i++) {
	                stack.pop();
	            }
            System.out.println(stack.toString());
    
        }
}
