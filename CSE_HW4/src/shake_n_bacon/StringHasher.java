package shake_n_bacon;

import providedCode.Hasher;

/**
 * @author Zerina Kapetanovic, Brandon Johanson
 * @UWNetID zerinak,	
 * @studentID 1350326, 
 * @email zerinak@uw.edu
 */
public class StringHasher implements Hasher {

	/**
	 * Take the string and return an integer to be used in the hash function
	 * @param str
	 * @return sum
	 */
	public int hash(String str) {
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			sum += str.charAt(i);
			sum *= 11;
		}
		return sum;
	}
}
