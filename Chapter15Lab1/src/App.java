/**
 * This program demonstrates a solution to the* isMember Method programming
 * challenge.
 */
public class App {
	/**
	 * The isMember method searches all or part of an array for value.
	 *
	 * @param array The array to be searched.
	 * @param value The value to search for.
	 * @param size  The size of the part of the array being searched.
	 * @return If the value is found, the method returns true. Otherwise, it returns
	 *         false.
	 */

	public static void main(final String[] args) {
		final int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		MyArray myArray = new MyArray(numbers);
		// Test all of the values from 0 through 20 and see if// they are in the array.
		System.out.println("Without recursion: ");
		for (var x = 0; x <= 20; x++) {
			System.out.println(
					myArray.hasMember(x) ? x + " is found in the array.\n" : x + " is not found in the array.\n");
		}
		System.out.println("With recursion: ");
		for (var x = 0; x <= 20; x++) {
			System.out.println(
					myArray.hasMemberRecursive(x, 10) ? x + " is found in the array.\n" : x + " is not found in the array.\n");
		}
	}
}
