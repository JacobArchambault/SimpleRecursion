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
	 * @paramsize The size of the part of the array being searched.
	 * @return If the value is found, the method returns true. Otherwise, it returns
	 *         false.
	 */
	public static boolean isMember(final int[] array, final int value, final int size) {
		if (size == 0) {
			return false;
		}
		if (array[size - 1] == value) {
			return true;
		} else {
			return App.isMember(array, value, size - 1);
		}
	}

	public static void main(final String[] args) {
		final var ARRAY_SIZE = 10;
		final int[] numbers = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
		// Test all of the values from 0 through 20 and see if// they are in the array.
		for (var x = 0; x <= 20; x++) {
			if (App.isMember(numbers, x, ARRAY_SIZE)) {
				System.out.println(x + " is found in the array.\n");
			} else {
				System.out.println(x + " is not found in the array.\n");
			}
		}
	}
}
