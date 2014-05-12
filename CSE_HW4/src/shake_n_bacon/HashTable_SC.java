package shake_n_bacon;

import providedCode.*;

/**
 * @author Zerina Kapetnaovic, Brandon Johanson
 * @UWNetID zerinak, 
 * @studentID 1350326,
 * @email zerinak@uw.edu
 * 
 *        TODO: Replace this comment with your own as appropriate.
 * 
 *        1. You may implement HashTable with separate chaining discussed in
 *        class; the only restriction is that it should not restrict the size of
 *        the input domain (i.e., it must accept any key) or the number of
 *        inputs (i.e., it must grow as necessary).
 * 
 *        2. Your HashTable should rehash as appropriate (use load factor as
 *        shown in the class).
 * 
 *        3. To use your HashTable for WordCount, you will need to be able to
 *        hash strings. Implement your own hashing strategy using charAt and
 *        length. Do NOT use Java's hashCode method.
 * 
 *        4. HashTable should be able to grow at least up to 200,000. We are not
 *        going to test input size over 200,000 so you can stop resizing there
 *        (of course, you can make it grow even larger but it is not necessary).
 * 
 *        5. We suggest you to hard code the prime numbers. You can use this
 *        list: http://primes.utm.edu/lists/small/100000.txt NOTE: Make sure you
 *        only hard code the prime numbers that are going to be used. Do NOT
 *        copy the whole list!
 * 
 *        TODO: Develop appropriate tests for your HashTable.
 */


public class HashTable_SC extends DataCounter 
{	
	public static class Node
	{
		public Node next;
		public Object key;
		public Object value;
		
		
		public Node(Node next, Object key, Object value)
		{
			this.next = null;
			this.key = key;
			this.value = value;
		}
		
		public Object getValue()
		{
			return value;
		}
		
		public Object getKey()
		{
			return key;
		}
		
		public Node getNext()
		{
			return next;
		}
		
		public void setNext(Node next)
		{
			this.next = next;
		}
		
		public void setValue(Object value)
		{
			this.value = value;
		}
		
	}
	
	private Hasher hasher;
	private Comparator compare;
	private int size;
	private Node[] data;
	private int dataSize = 100;
	
	public HashTable_SC(Comparator<String> c, Hasher h) 
	{
		this.compare = c;
		this.hasher = h;
		data = new Node[dataSize];
		size = 0;
		
	}

	/**
	 * Increment the count for a particular data element.
	 * @param data
	 *            data element whose count to increment.
	 */
	public void incCount(String data) 
	{
		//double loadFactor = size/data.length;
		
	}

	/**
	 * The number of unique data elements in the structure.
	 * @return the number of unique data elements in the structure.
	 */
	public int getSize() 
	{
		return size;
	}

	/**
	 * The current count for the data, 0 if it is not in the counter.
	 */
	public int getCount(String data) 
	{
		return 0;
	}

	/**
	 * Clients must not increment counts between an iterator's creation and its
	 * final use. Data structures need not check this.
	 * @return an iterator for the elements.
	 */
	public SimpleIterator getIterator() 
	{
		return null;
	}

}
